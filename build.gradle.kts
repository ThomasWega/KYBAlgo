plugins {
    application
    id("io.freefair.lombok") version "8.10.2"
    id("java")
}

group = "me.weglarz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass = "me.weglarz.Main"
}

tasks.test {
    useJUnitPlatform()
}