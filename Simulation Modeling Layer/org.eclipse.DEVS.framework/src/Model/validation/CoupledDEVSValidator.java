/**
 *
 * $Id$
 */
package Model.validation;

import Model.DEVS;
import Model.EIC;
import Model.EOC;
import Model.IC;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Model.CoupledDEVS}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CoupledDEVSValidator {
	boolean validate();

	boolean validateSubModels(EList<DEVS> value);
	boolean validateEics(EList<EIC> value);
	boolean validateIcs(EList<IC> value);
	boolean validateEocs(EList<EOC> value);
}