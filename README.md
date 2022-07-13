# Link_cutter
Это тестовое api задача которого сокращать длинные ссылки.
## Многоуровневая архитектура
- controller
- dao
- repository
- service

## Применяемые техноголии 
- Spring boot 
  - Spring web
  - Spring jpa
  - Spring security
- Database in memory H2
- Swagger
- lombok
- Java 11

## Как запустить проект 
Есть 3 способоа запустить проект
###  Через браузер
1. Форкнуть проект.
2. Запустите через IntelliJ IDEA.
3. Пройти по ссылке http://localhost:8080/cut?long-url= + ваша URL.
4. Аутентифицироваться под email = ```user@gmail.com``` password = ```password```.
5. На экран выведеться ваша новая URL.
### Через Postman
1. Форкнуть проект.
2. Запустите через IntelliJ IDEA.
3. (Не обязательно) Зарегестируйтесь по ссылку http://localhost:8080/registration и введите JSON объект с полями ```username```, ```email```, ```password```.
4. Пройдите по ссылке http://localhost:8080/cut?long-url= + ваша URL c методом ```GET```.И используя Basic Auth авторизуйтесь по своему зарегестрированому пользователю либо по email = ```user@gmail.com``` password = ```password```.
5. На экран выведеться ваша новая URL.
### Через Swagger
1. Форкнуть проект.
2. Запустите через IntelliJ IDEA.
3. Пройтите по ссылке http://localhost:8080/swagger-ui/#/ и аутентифицируйтесь по email = ```user@gmail.com``` password = ```password```.
4. На сайте будет россписан вест функционал.
