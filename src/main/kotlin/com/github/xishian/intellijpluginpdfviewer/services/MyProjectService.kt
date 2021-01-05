package com.github.xishian.intellijpluginpdfviewer.services

import com.intellij.openapi.project.Project
import com.github.xishian.intellijpluginpdfviewer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
