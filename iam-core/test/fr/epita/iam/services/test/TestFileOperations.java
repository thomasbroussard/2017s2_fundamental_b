/**
 
 * Code application :
 * Composant : 
 */
package fr.epita.iam.services.test;

import java.io.IOException;

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
		FileIdentityDAO dao = new FileIdentityDAO("/tmp/2017s2_b/identities.txt");
		
		Identity id1 = new Identity();
		id1.setDisplayName("Thomas");
		id1.setUid("123");
		id1.setEmail("tbr@tbr.com");
		
		dao.create(id1);
		
		
	}

}
