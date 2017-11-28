/**
 * 
 * Code application :
 * Composant : 
 */
package fr.epita.iam.launcher;

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
public class Main {

	/** 
	 * <h3>Description</h3>  
	 * <p>Cette méthode permet de ...</p>
	 *
	 * <h3>Utilisation</h3>
	 * <p>Elle s'utilise de la manière suivante :
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
	public static void main(String[] args) {
		Identity id1 = new Identity();
		id1.setDisplayName("Thomas");
		id1.setUid("123");
		id1.setEmail("tbr@tbr.com");
		
		System.out.println(id1);
		
	}

}
