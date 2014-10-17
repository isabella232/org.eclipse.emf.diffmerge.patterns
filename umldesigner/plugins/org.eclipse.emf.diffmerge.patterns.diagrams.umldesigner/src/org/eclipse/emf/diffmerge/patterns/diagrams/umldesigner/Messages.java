/**
 * <copyright>
 * 
 * Copyright (c) 2010-2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.emf.diffmerge.patterns.diagrams.umldesigner;

import org.eclipse.osgi.util.NLS;


/**
 * Messages for UML Designer extension.
 * @author Skander Turki
 */
public class Messages extends NLS{
  
  private static final String BUNDLE_NAME = "org.eclipse.emf.diffmerge.patterns.diagrams.umldesigner.messages"; //$NON-NLS-1$
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }
  
  private Messages() {
    // Nothing
  }
  
  public static String UMLDesignerDeleteCommand_Label;
  
}