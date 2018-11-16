package com.kathie.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


class myPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {

        println project.getTasks().toString()
        println project.getBuildFile().toString()
        println project.getAllprojects().toString()
        println project.getConfigurations().toString()
        println "-----------this is kethie plugin!----------"
        println "-----------this is kethie plugin!----------"
        println "-----------this is kethie plugin!----------"
        println "-----------this is kethie plugin!----------"
        println "-----------this is kethie plugin!----------"


    }
}