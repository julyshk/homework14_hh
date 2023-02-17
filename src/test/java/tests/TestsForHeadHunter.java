package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

    public class TestsForHeadHunter extends TestBase {

        @Test
        @Owner("shkrebayv")
        @DisplayName("Отображение секции 'Сервисы для соискателей' на вкладке 'Все сервисы'")
        void checkForSectionServicesForApplicants() {

            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
                sleep(5000);
            });
            step("Нажать кнопку 'Все сервисы'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Проверить наличие раздела 'Сервисы для соискателей'", () -> {
                pageHeadHunter.checkForSection(pageHeadHunter.section, pageHeadHunter.textServicesForApplicants);
            });
        }

        @Test
        @Owner("shkrebayv")
        @DisplayName("Отображение секции 'Образование и консультации' на вкладке 'Все сервисы'")
        void checkForSectionEducationAndConsultations() {
            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
                sleep(5000);
            });
            step("Нажать кнопку 'Все сервисы'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Проверить наличие раздела 'Образование и консультации'", () -> {
                pageHeadHunter.checkForSection(pageHeadHunter.section, pageHeadHunter.textEducationAndConsultations);
            });
        }

        @Test
        @Owner("shkrebayv")
        @DisplayName("Отображение секции 'Студентам и начинающим специалистам' на вкладке 'Все сервисы'")
        void checkForSectionStudentsAndBeginners() {
            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
                sleep(5000);
            });
            step("Нажать кнопку 'Все сервисы'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Проверить наличие раздела 'Студентам и начинающим специалистам'", () -> {
                pageHeadHunter.checkForSection(pageHeadHunter.section, pageHeadHunter.textStudentsAndBeginners);
            });
        }

        @Test
        @Owner("shkrebayv")
        @DisplayName("Отображение секции 'Сервисы в разработке' на вкладке 'Все сервисы'")
        void checkForSectionServicesInDevelopment() {
            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
                sleep(5000);
            });
            step("Нажать кнопку 'Все сервисы'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Проверить наличие раздела 'Сервисы в разработке'", () -> {
                pageHeadHunter.checkForSection(pageHeadHunter.section, pageHeadHunter.textServicesInDevelopment);
            });
        }

        @Test
        @Owner("shkrebayv")
        @DisplayName("Отметка 'Можно из дома' для вакансий раздела 'Работа из дома'")
        void check() {
            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
                sleep(5000);
            });
            step("Нажать на виджет 'Работа из дома'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonWorkInHome);
            });
            step("Проверить наличие отметки 'Можно из дома' у вакансии", () -> {
                pageHeadHunter.verifyChapterWorkInHome();
            });
        }
    }

