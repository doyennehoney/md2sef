/**
 *
 * $Id$
 */
package ws.middleware.validation;

import org.eclipse.emf.common.util.EList;

import ws.middleware.ServiceImpl;

/**
 * A sample validator interface for {@link ws.middleware.Repository}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RepositoryValidator {
	boolean validate();

	boolean validateServices(EList<ServiceImpl> value);
}
