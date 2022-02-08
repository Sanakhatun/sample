package com.sana.sample.screen.task;

import io.jmix.ui.screen.*;
import com.sana.sample.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}