plugins {
    java
    id("org.springframework.boot") version "2.5.2"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
	mavenCentral()
}

dependencies {
    implementation(enforcedPlatform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
    test {
    	useJUnitPlatform()
    }
}

sourceSets {
	main {
		java {
			srcDirs.add(File("src/generated/java"))
		}
	}
}
