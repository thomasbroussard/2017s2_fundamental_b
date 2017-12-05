/**
 * Code application :
 * Composant :
 */
package fr.epita.iam.service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.epita.iam.datamodel.Identity;

/**
 * <h3>Description</h3>
 * <p>Cette classe permet de ...</p>
 *
 * <h3>Utilisation</h3>
 * <p>Elle s'utilise de la manière suivante :
 *   <pre><code>${type_name} instance = new ${type_name}();</code></pre>
 * </p>
 *
 * @since $${version}
 * @see Voir aussi $${link}
 * @author ${user}
 *
 * ${tags}
 */
public class FileIdentityDAO {

	private final String filePath;

	private final Scanner scanner;
	private final PrintWriter printWriter;


	/**
	 * @param string
	 * @throws IOException
	 */
	public FileIdentityDAO(String path) throws IOException {
		filePath = path;

		final File file = new File(filePath);

		// filepath "/some/file/path.txt"
		if (!file.exists()) {
			// first create the "/some/file" directories
			file.getParentFile().mkdirs();

			// then create the file "path.txt"
			file.createNewFile();

		}

		printWriter = new PrintWriter(file);
		scanner = new Scanner(file);


	}



	public void create(Identity identity) {
		printWriter.println("----------------------");
		printWriter.println(identity.getUid());
		printWriter.println(identity.getEmail());
		printWriter.println(identity.getDisplayName());
		printWriter.println("----------------------");
		printWriter.flush();
	}

	public List<Identity> search(Identity criteria){
		final List<Identity> results = new ArrayList<>();
		while (scanner.hasNext()) {
			final Identity currentIdentity = new Identity();
			scanner.nextLine();
			currentIdentity.setUid(scanner.nextLine());
			currentIdentity.setEmail(scanner.nextLine());
			currentIdentity.setDisplayName(scanner.nextLine());
			scanner.nextLine();

			if (checkMatch(criteria, currentIdentity)) {
				results.add(currentIdentity);
			}
		}

		return results;
	}

	/**
	 * <h3>Description</h3>
	 * <p>
	 * This methods allows to ...
	 * </p>
	 *
	 * <h3>Usage</h3>
	 * <p>
	 * It should be used as follows :
	 *
	 * <pre>
	 * <code> ${enclosing_type} sample;
	 *
	 * //...
	 *
	 * sample.${enclosing_method}();
	 *</code>
	 * </pre>
	 * </p>
	 *
	 * @since $${version}
	 * @see Voir aussi $${link}
	 * @author ${user}
	 *
	 *         ${tags}
	 */
	private boolean checkMatch(Identity criteria, final Identity currentIdentity) {
		boolean result = false;
		if (criteria.getDisplayName() != null) {
			result = result || currentIdentity.getDisplayName().startsWith(criteria.getDisplayName());
		}
		if (criteria.getEmail() != null) {
			result = result || currentIdentity.getEmail().startsWith(criteria.getEmail());

		}
		if (criteria.getUid() != null) {
			result = result || currentIdentity.getUid().equals(criteria.getUid());
		}
		return result;
	}


	public void update(Identity identity) {

	}

	public void delete(Identity identity) {

	}


}
