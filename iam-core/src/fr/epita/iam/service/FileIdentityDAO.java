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

	private String filePath;
	
	private Scanner scanner;
	private PrintWriter printWriter;
	
	
	/**
	 * @param string
	 * @throws IOException 
	 */
	public FileIdentityDAO(String path) throws IOException {
		this.filePath = path;
		
		File file = new File(this.filePath);
		
		// filepath "/some/file/path.txt" 
		if (!file.exists()) {
			// first create the "/some/file" directories
			file.getParentFile().mkdirs();
			
			// then create the file "path.txt"
			file.createNewFile();
			
		}
		
		this.printWriter = new PrintWriter(file);
		this.scanner = new Scanner(file);
		
		
	}

	
	
	public void create(Identity identity) {
		this.printWriter.println("----------------------");
		this.printWriter.println(identity.getUid());
		this.printWriter.println(identity.getEmail());
		this.printWriter.println(identity.getDisplayName());
		this.printWriter.println("----------------------");
		this.printWriter.flush();
	}
	
	public List<Identity> search(Identity criteria){
		List<Identity> results = new ArrayList<Identity>();
		
		
		return results;
	}
	
	public void update(Identity identity) {
		
	}
	
	public void delete(Identity identity) {
		
	}
	
	
}
