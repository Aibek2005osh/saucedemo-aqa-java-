# SauceDemo AQA Java

Автоматизированные UI тесты для сайта https://www.saucedemo.com/

## Технологии

- Java 17
- Selenium WebDriver
- JUnit 5
- Gradle
- Allure Reports
- Page Object Model (POM)

## Запуск тестов

Windows:
gradlew clean test

Mac/Linux:
./gradlew clean test

## Генерация отчета Allure

gradlew allureServe

## Покрытые сценарии

1. Успешный логин
2. Логин с неверным паролем
3. Логин заблокированного пользователя
4. Логин с пустыми полями
5. Логин performance_glitch_user с ожиданием загрузки

## Автор

Aibek
