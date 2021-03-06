/**
 *
 * $Id$
 */
package rsgf.bundle.validation;

import org.eclipse.emf.common.util.EList;

import rsgf.mw.Middleware;

import rsgf.tree.Node;

/**
 * A sample validator interface for {@link rsgf.bundle.Process}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProcessValidator {
	boolean validate();

	boolean validateID(String value);
	boolean validateNodes(EList<Node> value);
	boolean validateMiddleware(Middleware value);
}
