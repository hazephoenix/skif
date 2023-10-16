package src2.test.agentCreation
import com.codeborne.selenide.Selenide
import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import src2.model.RegistrationOfAgent
import src2.model.BaseTestClass


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Регистрация нового диллера")
class AgentCreationTest : BaseTestClass() {

    val skif = RegistrationOfAgent()

    @BeforeAll
    override fun beforeAll() {
        super.beforeAll()
    }

    @BeforeEach
    override fun beforeEach() {
        Selenide.open("/dealer")
    }

    @ParameterizedTest(name = "Регистрация проходит без ошибок, если указать указать имя диллера {}")
    @CsvSource(
        "ACSII символы, asdf",
        "не ACSII символы, тесттекст",
        "Длиной 100 символов, тесттексттесттекст",
        "Длиной 1 символ, a"
    )
    fun registrationWithCorrectNameShouldPass(number: String, fileName: String) {
        skif.setCompanyName("test")
        // заполнить все остальные поля и заассертить дизейбл кнопки и отсутствие ошибо
    }
}