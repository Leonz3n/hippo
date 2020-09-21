package com.github.leonz3n.hippo.services

import com.intellij.openapi.project.Project
import com.github.leonz3n.hippo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
