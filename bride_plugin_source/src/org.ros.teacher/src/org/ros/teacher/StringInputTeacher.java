package org.ros.teacher;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

public class StringInputTeacher implements TeacherPlugin {
	private Group ebar;
	private Text inputbox;
	public StringInputTeacher()
	{
		
	}
	
	public String getType()
	{
		return "java.lang.String";
	}
	
	public String getGUIData(String name)
	{
		return inputbox.getText();
	}
	public Widget getGUIWidget(Composite parent, String name, String current_data)
	{
		ebar = new Group(parent, SWT.PUSH);
		GridLayout layout = new GridLayout ();
		layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 4;
		layout.verticalSpacing = 4;
		ebar.setLayout(layout);
		inputbox = new Text(ebar, SWT.PUSH);
		inputbox.setText(current_data);
		inputbox.setEditable(true);
		ebar.setText("Teacher: " + name);
		return ebar;
	}
	public String getName()
	{
		return "StringInputTeacher";
	}
	
}
