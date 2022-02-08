package com.sana.sample.screen.task;

import io.jmix.ui.screen.*;
import com.sana.sample.entity.Task;

@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
}