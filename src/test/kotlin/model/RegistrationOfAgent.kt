package src2.model

import com.codeborne.selenide.Selenide.element
import org.openqa.selenium.By
import org.openqa.selenium.Keys

class RegistrationOfAgent {

    private val typeInput = By.id("//span[text()=' Тип организации ']/following-sibling::div/input")
    private val nameInput = By.id("//span[text()='Название компании']/following-sibling::div/input")
    private val addressInput = By.id("//span[text()=' Адрес ']/following-sibling::div/input")
    private val innInput= By.id("//span[text()=' ИНН ']/following-sibling::div/input")
    private val phoneInput = By.id("//span[text()=' Телефон: ']/following-sibling::div/input")


    fun setType(dealerType: dealerTypes) {
        when(dealerType) {
            dealerTypes.LEGAL -> element(typeInput).selectOption(1)
            dealerTypes.INDIVIDUAL-> element(typeInput).selectOption(2)
            else -> throw IllegalStateException()
        }
    }

    fun setCompanyName(text: String = "Default name") {
        element(nameInput).apply {
            sendKeys(Keys.chord(Keys.CONTROL, "a"))
            sendKeys(Keys.BACK_SPACE)
            sendKeys(text)
        }
    }

    fun setAddress(text: String = "Default name") {
        element(addressInput).apply {
            sendKeys(Keys.chord(Keys.CONTROL, "a"))
            sendKeys(Keys.BACK_SPACE)
            sendKeys(text)
        }
    }

    fun setInn(text: String = "Default name") {
        element(innInput).apply {
            sendKeys(Keys.chord(Keys.CONTROL, "a"))
            sendKeys(Keys.BACK_SPACE)
            sendKeys(text)
        }
    }

    fun setPhone(text: String = "Default name") {
        element(phoneInput).apply {
            sendKeys(Keys.chord(Keys.CONTROL, "a"))
            sendKeys(Keys.BACK_SPACE)
            sendKeys(text)
        }
    }

    enum class dealerTypes(var desc: String) {
        LEGAL("Юр лицо"),
        INDIVIDUAL("Индивидуал");

        override fun toString(): String {
            return this.desc
        }
    }
}