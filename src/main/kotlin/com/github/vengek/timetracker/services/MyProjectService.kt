package com.github.vengek.timetracker.services

import com.github.vengek.timetracker.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
