
# Тестовое задание на вакансию Java разработчика



Описание проекта

Проект представляет собой веб-приложение для управления информацией о покупках пользователей с использованием Spring Boot.

Используемые технологии:

Java 11
Spring Boot 2.1.6
Spring Data JPA
Spring Security
Maven
Tomcat
PostgreSQL 11
HTML 5/CSS (возможно использование React.js, Angular.js, Vue.js и т.д.)
Docker
Входные форматы данных:

Структура покупки:

xml

<purchase>
<name>Телевизор</name>
<lastname>Иванов</lastname>
<age>30</age>
<purchase_item>Телевизор</purchase_item>
<count>1</count>
<amount>500.00</amount>
<purchase_date>2024-03-20</purchase_date>
</purchase>
Задача

Описать входящий запрос XSD-схемой + описать структуры базы данных в SQL.

Реализовать веб-страницу с простой авторизацией (используя Spring Security), которая реализует CRUD операции для работы с информацией о покупках пользователей. Работа с таблицей "покупки" не требуется, она доступна только для выбора на странице.

Реализовать REST-сервис, который принимает информацию о покупке в формате XML, проводит ее валидацию по XSD и при успехе записывает в БД. При ошибке выводится информация пользователю о причине ошибки.

Сформировать четыре страницы с отчетами по базе данных:

Вывести список покупок за последнюю неделю.
Вывести самый покупаемый товар за последний месяц.
Вывести имя и фамилию человека, совершившего больше всего покупок за полгода.
Определить, что чаще всего покупают люди в возрасте 18 лет.
Результаты

В качестве результатов необходимо предоставить:

XSD-схему для входящего запроса.
SQL-скрипт для построения структуры базы данных.
Исходный код, решающий данное тестовое задание.
Запуск приложения

Клонировать репозиторий.
Убедиться, что у вас установлены Java 11 и Maven.
Запустить приложение из корневой директории
проекта с помощью команды mvn spring-boot:run.
После запуска приложения можно посмотреть эндпоинты контроллера, 
схему запросов, спецификацию и протестировать работу, перейдя по ссылке   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html),в вашем браузере.
Для остановки приложения нажмите Ctrl + C.
Docker

Дополнительно, можно предоставить Dockerfile или docker-compose файл для вашего приложения.

