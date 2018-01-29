/**
 * Ce fichier est la propriété de Thomas BROUSSARD
 * Code application :
 * Composant :
 */
package fr.epita.iam.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import fr.epita.logger.Logger;

/**
 * <h3>Description</h3>
 * <p>This class allows to ...</p>
 *
 * <h3>Usage</h3>
 * <p>This class should be used as follows:
 *   <pre><code>${type_name} instance = new ${type_name}();</code></pre>
 * </p>
 *
 * @since $${version}
 * @see See also $${link}
 * @author ${user}
 *
 * ${tags}
 */
public class Configuration {

	private static final Logger logger = new Logger(Configuration.class);
	private static Configuration instance;

	private final Properties properties;

	public static Configuration getInstance() {
		if (instance == null) {
			instance = new Configuration();
		}
		return instance;
	}

	private Configuration() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("testConfiguration.properties"));
		} catch (final IOException e) {
			logger.error("error while loading the configuration", e);
		}
	}

	public String getProperty(String key) {

		return properties.getProperty(key);

	}

	public boolean containsProperty(String key) {
		return properties.containsKey(key);
	}


}
