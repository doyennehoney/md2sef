/**
 *
 * $Id$
 */
package rsgf.bundle.validation;

import org.eclipse.emf.common.util.EList;

import rsgf.skeleton.Skeleton;

/**
 * A sample validator interface for {@link rsgf.bundle.Bundle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BundleValidator {
	boolean validate();

	boolean validateID(String value);
	boolean validateSkeleton(Skeleton value);
	boolean validateProcess(EList<rsgf.bundle.Process> value);
}
