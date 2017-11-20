/**
 *
 * $Id$
 */
package Model.validation;

import Model.DEVS;
import Model.IPort;
import Model.OPort;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Model.DEVS}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DEVSValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateContainer(DEVS value);
	boolean validateIports(EList<IPort> value);
	boolean validateOports(EList<OPort> value);
}
