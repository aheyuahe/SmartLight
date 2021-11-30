package com.github.aheyuahe.smartlight.services

import com.intellij.openapi.project.Project
import com.github.aheyuahe.smartlight.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
