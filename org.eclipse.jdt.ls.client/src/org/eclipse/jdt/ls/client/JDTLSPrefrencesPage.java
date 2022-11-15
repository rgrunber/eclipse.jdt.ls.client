package org.eclipse.jdt.ls.client;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class JDTLSPrefrencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(JDTLSClientPlugin.getInstance().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(JDTLSProductConnectionProvider.PREF_LOCATION, "Language Server location", getFieldEditorParent()));
	}

}
