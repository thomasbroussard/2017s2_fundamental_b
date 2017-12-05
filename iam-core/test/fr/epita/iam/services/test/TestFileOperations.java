/**

 * Code application :
 * Composant :
 */
package fr.epita.iam.services.test;

import java.io.IOException;
import java.util.List;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.service.FileIdentityDAO;

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
public class TestFileOperations {


	public static void main(String[] args) throws IOException {

		testCreateAndSearch();

	}

	/**
	 * <h3>Description</h3>
	 * <p>This methods allows to ...</p>
	 *
	 * <h3>Usage</h3>
	 * <p>It should be used as follows :
	 *
	 * <pre><code> ${enclosing_type} sample;
	 *
	 * //...
	 *
	 * sample.${enclosing_method}();
	 *</code></pre>
	 * </p>
	 *
	 * @since $${version}
	 * @see Voir aussi $${link}
	 * @author ${user}
	 *
	 * ${tags}
	 */
	private static void testCreateAndSearch() throws IOException {
		// Given : initial context
		final FileIdentityDAO dao = new FileIdentityDAO("/tmp/2017s2_b/identities.txt");

		final Identity id1 = new Identity();
		id1.setDisplayName("Thomas");
		id1.setUid("123");
		id1.setEmail("tbr@tbr.com");

		// When : we execute the action
		dao.create(id1);


		// Then : we expect the following result to verify the test.
		final Identity criteria = new Identity();
		criteria.setDisplayName("Thom");
		final List<Identity> identities = dao.search(criteria);
		if (identities.get(0).equals(id1)) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
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
	private static void testCreateUpdateAndSearch() throws IOException {
		// Given : initial context
		final FileIdentityDAO dao = new FileIdentityDAO("/tmp/2017s2_b/identities.txt");

		final Identity id1 = new Identity();
		id1.setDisplayName("Thomas");
		id1.setUid("123");
		id1.setEmail("tbr@tbr.com");

		// When : we execute the action
		dao.create(id1);

		// Then : we expect the following result to verify the test.
		final Identity criteria = new Identity();
		criteria.setDisplayName("Thom");
		final List<Identity> identities = dao.search(criteria);
		if (identities.get(0).equals(id1)) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
	}

}
