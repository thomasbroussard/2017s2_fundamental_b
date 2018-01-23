/**
 * Ce fichier est la propriété de Thomas BROUSSARD Code application : Composant :
 */
package fr.epita.logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * <h3>Description</h3>
 * <p>
 * This class allows to ...
 * </p>
 *
 * <h3>Usage</h3>
 * <p>
 * This class should be used as follows:
 *
 * <pre>
 * <code>${type_name} instance = new ${type_name}();</code>
 * </pre>
 * </p>
 *
 * @since $${version}
 * @see See also $${link}
 * @author ${user}
 *
 *         ${tags}
 */
public class Logger {

	private static PrintWriter pw;

	static {
		try {
			pw = new PrintWriter("application.log");
		} catch (final FileNotFoundException e) {
			System.out.println("error while initializing the log file");
		}
	}
	private final Class cls;

	public Logger(Class loggingClass) {
		cls = loggingClass;
	}

	public void info(String message) {
		pw.println("INFO - " + message);
	}

	public void error(String message) {
		pw.println("ERROR - " + message);
	}

}
