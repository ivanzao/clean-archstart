object Dependency {

    private object Versions {
        //http
        const val ktor = "1.2.2"
        //root
        const val logbackClassic = "1.2.3"
        const val assertjCore = "3.12.2"
        const val mockitoKotlin = "2.1.0"
        const val springCommon = "5.1.7.RELEASE"
        const val junitJupiterCommon = "5.4.1"
    }

    //http
    const val ktorServer = "io.ktor:ktor-server-jetty:${Versions.ktor}"
    const val ktorGson = "io.ktor:ktor-gson:${Versions.ktor}"
    //root
    const val springContext = "org.springframework:spring-context:${Versions.springCommon}"
    const val logbackClassic = "ch.qos.logback:logback-classic:${Versions.logbackClassic}"
    const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junitJupiterCommon}"
    const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junitJupiterCommon}"
    const val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
}