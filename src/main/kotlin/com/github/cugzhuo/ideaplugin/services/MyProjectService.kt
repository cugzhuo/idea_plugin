package com.github.cugzhuo.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.cugzhuo.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
