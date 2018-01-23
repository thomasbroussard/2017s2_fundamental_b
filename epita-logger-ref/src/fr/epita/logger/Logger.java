/**
 * Ce fichier est la propriété de Thomas BROUSSARD Code application : Composant :
 */
package fr.epita.logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		printMessage(message, "INFO");
	}

	public void error(String message) {
		printMessage(message, "ERROR");
	}

	public void error(String message, Exception e) {
		printMessage(message, "ERROR");
		e.printStackTrace(pw);
		pw.flush();
	}

	public void debug(String message) {
		printMessage(message, "DEBUG");
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
	private void printMessage(String message, String level) {
		final Date date = new Date();
		final String timestamp = new SimpleDateFormat("yyyyMMdd_HH:mm:ss.SSS").format(date);
		pw.println(timestamp + " - " + level + " - " + message);

		pw.flush();
	}



}
