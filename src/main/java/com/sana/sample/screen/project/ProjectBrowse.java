package com.sana.sample.screen.project;

import io.jmix.ui.screen.*;
import com.sana.sample.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {

}