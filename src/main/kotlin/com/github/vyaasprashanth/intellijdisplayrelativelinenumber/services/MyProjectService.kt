package com.github.vyaasprashanth.intellijdisplayrelativelinenumber.services

import com.github.vyaasprashanth.intellijdisplayrelativelinenumber.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
