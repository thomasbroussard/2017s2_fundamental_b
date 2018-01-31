/**
 * Ce fichier est la propriété de Thomas BROUSSARD
 * Code application :
 * Composant :
 */
package fr.epita.iam.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.exceptions.IdentityCreationException;

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
public class IdentityXMLDAO implements IdentityDAO {

	private Document document;

	/**
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 *
	 */
	public IdentityXMLDAO() throws ParserConfigurationException, IOException, SAXException {
		final Configuration conf = Configuration.getInstance();
		final String path = conf.getProperty("xml.filePath");
		final File source = new File(path);
		final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		final DocumentBuilder db = dbf.newDocumentBuilder();
		document = null;
		if (source.exists()) {
			document = db.parse(source);
		}else {
			source.getParentFile().mkdirs();
			source.createNewFile();
			document = db.newDocument();
		}


	}

	/* (non-Javadoc)
	 * @see fr.epita.iam.service.IdentityDAO#create(fr.epita.iam.datamodel.Identity)
	 */
	@Override
	public void create(Identity identity) throws IdentityCreationException {

	}

	/* (non-Javadoc)
	 * @see fr.epita.iam.service.IdentityDAO#update(fr.epita.iam.datamodel.Identity)
	 */
	@Override
	public void update(Identity identity) {

	}

	/* (non-Javadoc)
	 * @see fr.epita.iam.service.IdentityDAO#delete(fr.epita.iam.datamodel.Identity)
	 */
	@Override
	public void delete(Identity identity) {

	}

	/* (non-Javadoc)
	 * @see fr.epita.iam.service.IdentityDAO#search(fr.epita.iam.datamodel.Identity)
	 */
	@Override
	public List<Identity> search(Identity criteria) {
		final List<Identity> list = new ArrayList<>();
		final NodeList identityNodeList = document.getElementsByTagName("identity");
		for (int i = 0; i < identityNodeList.getLength(); i++) {
			final Node identityNode = identityNodeList.item(i);
			if (identityNode instanceof Element) {
				final Element identityElement = (Element) identityNode;
				final NodeList properties = identityElement.getElementsByTagName("property");
				final Identity identity = new Identity();
				list.add(identity);
				for (int j = 0; j < properties.getLength(); j++) {

					final Node propertyNode = properties.item(j);
					if (propertyNode instanceof Element) {
						final Element propertyElement = (Element) propertyNode;
						final String propertyName = propertyElement.getAttribute("name");
						final String propertyValue = propertyElement.getTextContent().trim();
						switch (propertyName) {
						case "displayName":
							identity.setDisplayName(propertyValue);
							break;
						case "email":
							identity.setEmail(propertyValue);
							break;
						case "uid":
							identity.setUid(propertyValue);
							break;
						}

					}

				}

			}

		}

		return list;
	}

}
