/*
 * Copyright 2021-2024 spring-boot-extension the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rocg.boot

import com.rocg.boot.dependency.CompileProcessorPlugin
import com.rocg.boot.dependency.ManagementPlugin
import com.rocg.boot.dependency.OptionalPlugin
import com.rocg.boot.info.ManifestPlugin
import com.rocg.boot.tasks.DeleteExpand
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author livk
 */
class CorePlugin : Plugin<Project> {
	override fun apply(project: Project) {
		project.pluginManager.apply(DeleteExpand::class.java)
		project.pluginManager.apply(ManagementPlugin::class.java)
		project.pluginManager.apply(OptionalPlugin::class.java)
		project.pluginManager.apply(CompileProcessorPlugin::class.java)
		project.pluginManager.apply(ManifestPlugin::class.java)
	}

}

