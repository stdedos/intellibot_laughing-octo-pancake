package com.github.stdedos.intellibotlaughingoctopancake.services

import com.intellij.openapi.project.Project
import com.github.stdedos.intellibotlaughingoctopancake.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
