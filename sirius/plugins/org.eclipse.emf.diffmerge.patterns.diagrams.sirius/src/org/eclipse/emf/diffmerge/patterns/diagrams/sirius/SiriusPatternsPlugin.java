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
package org.eclipse.emf.diffmerge.patterns.diagrams.sirius;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * @author Olivier Constant
 * @author Skander Turki
 */
public class SiriusPatternsPlugin extends AbstractUIPlugin {
  
	/** The plug-in ID */
	public static final String PLUGIN_ID = "org.eclipse.emf.diffmerge.patterns.diagrams.sirius"; //$NON-NLS-1$

	/** The shared instance */
	private static SiriusPatternsPlugin plugin;
	
	/**
	 * Constructor
	 */
	public SiriusPatternsPlugin() {
	  // Nothing needed
	}
	
	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
  public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
  public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	/**
	 * Return the shared instance
	 * @return the shared instance
	 */
	public static SiriusPatternsPlugin getDefault() {
		return plugin;
	}
	
}