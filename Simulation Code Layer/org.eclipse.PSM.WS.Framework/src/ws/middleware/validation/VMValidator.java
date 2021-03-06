/**
 *
 * $Id$
 */
package ws.middleware.validation;

import org.eclipse.emf.common.util.EList;

import ws.middleware.Processor;

/**
 * A sample validator interface for {@link ws.middleware.VM}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VMValidator {
	boolean validate();

	boolean validateID(String value);
	boolean validateProtocol(String value);
	boolean validateProcessors(EList<Processor> value);
}
