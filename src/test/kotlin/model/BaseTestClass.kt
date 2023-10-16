package src2.model

import com.codeborne.selenide.Configuration
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach

open class BaseTestClass {

    @BeforeAll
    open fun beforeAll() {
        Configuration.fastSetValue = true

        if (System.getenv("BASE_URL") == null) {
            Configuration.baseUrl = "https://app.skif.pro"
            println("Using default baseUrl=${Configuration.baseUrl}")
        } else {
            Configuration.baseUrl = System.getenv("BASE_URL")
            println("Using environment baseUrl=${Configuration.baseUrl}")
        }
        Configuration.webdriverLogsEnabled = true
        Configuration.timeout = 20000
        Configuration.driverManagerEnabled = true
    }

    @BeforeEach
    open fun beforeEach() {
    }
}