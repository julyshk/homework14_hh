package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.remote;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class PageHeadHunter {
    public String textServicesForApplicants = "Сервисы для соискателей",
            textEducationAndConsultations = "Образование и консультации",
            textStudentsAndBeginners = "Студентам и начинающим специалистам",
            textServicesInDevelopment = "Сервисы в разработке",
            textChapterWorkInHome = "Можно из дома";

    public SelenideElement
            buttonAllService = $("[data-qa=mainmenu_applicantServices]"),
            buttonWorkInHome = $("[data-page-analytics-value=\"Работа из дома\"]").$(byText("Работа из дома")),
            section = $(".supernova-overlay__content"),
            chapterWorkInHome = $(".vacancy-serp-item__layout");

    public PageHeadHunter openPage() {
        open(remote);

        return this;
    }

    public PageHeadHunter clickButton(SelenideElement button) {
        button.click();

        return this;
    }

    public PageHeadHunter checkForSection(SelenideElement section, String text) {
        $(section).shouldHave(text(text));

        return this;
    }
    public PageHeadHunter verifyChapterWorkInHome() {
        chapterWorkInHome.$(withText(textChapterWorkInHome)).should(Condition.exist);

        return this;
    }
}
