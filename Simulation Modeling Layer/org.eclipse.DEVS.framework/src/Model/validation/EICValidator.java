/**
 *
 * $Id$
 */
package Model.validation;

import Model.IPort;

/**
 * A sample validator interface for {@link Model.EIC}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EICValidator {
	boolean validate();

	boolean validateInfluencer(IPort value);
	boolean validateInfluencee(IPort value);
}