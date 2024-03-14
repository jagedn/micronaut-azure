plugins {
    id("io.micronaut.build.internal.azure-example")
    id("groovy")
}

micronaut {
    version(libs.versions.micronaut.platform.get())
}

dependencies {
    annotationProcessor(mn.micronaut.inject.java)
    implementation(mnServlet.micronaut.servlet.core)
    compileOnly(mn.micronaut.inject.groovy)
    implementation(projects.micronautAzureFunctionHttp)
    implementation(libs.managed.azure.functions.java.library)
    testImplementation(libs.groovy.all)
    testImplementation(libs.jakarta.inject.api)
}
