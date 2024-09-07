plugins {
	id("java-gradle-plugin")
	alias(libs.plugins.kotlin.jvm)
}

repositories {
	maven("https://repo.spring.io/release")
	maven("https://repo.huaweicloud.com/repository/maven/")
	maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
}

gradlePlugin {
	plugins {
		create("deployedPlugin") {
			id = "com.rocg.maven.deployed"
			implementationClass = "com.rocg.maven.DeployedPlugin"
		}
	}
}

tasks.withType<Jar> {
	manifest.attributes.putIfAbsent(
		"Created-By",
		System.getProperty("java.version") + " (" + System.getProperty("java.specification.vendor") + ")"
	)
	manifest.attributes.putIfAbsent("Gradle-Version", GradleVersion.current())
}
