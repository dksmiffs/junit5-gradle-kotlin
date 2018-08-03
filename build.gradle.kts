plugins {
  kotlin("jvm") version "1.2.60"
}

val junitVersion: String = "5.2.0"

repositories {
  jcenter()
}

dependencies {
  testCompile("org.junit.jupiter:junit-jupiter-api:$junitVersion")
  testCompile("org.junit.jupiter:junit-jupiter-params:$junitVersion")
  testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.withType<Test> {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

