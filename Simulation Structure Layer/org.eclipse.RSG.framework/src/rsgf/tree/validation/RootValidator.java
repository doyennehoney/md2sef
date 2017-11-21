/**
 *
 * $Id$
 */
package rsgf.tree.validation;

import rsgf.tree.BasicNode;

/**
 * A sample validator interface for {@link rsgf.tree.Root}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RootValidator {
	boolean validate();

	boolean validateChild(BasicNode value);
}
