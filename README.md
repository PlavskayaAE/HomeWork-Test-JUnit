Необходимо разработать класс Book, объект которого содержит в себе следующую информацию:
title - название книги;
releaseYear - год выпуска;
author - автор;
pages - количество страниц.
И методы:
- isBig(), возвращающий ответ на вопрос, является ли книга большой; книгу считаем большой, если в ней больше 500 страниц;
- matches(String word), возвращающий ответ на вопрос, содержится ли в описании книги (названии или в имени автора) переданное параметром слово (для этого используйте метод contains, который есть у объектов класса String);
- estimatePrice(), возвращающий оценку стоимости книги (целое число в рублях) по формуле 3 рубля за страницу, но не меньше 250 рублей.
  
**Дополнительно создан метод getFullTitle(), возвращающий строку в формате "Название книги, год выпуска". 
**Дополнительно созданы тесты для методов isBig() и getFullTitle()
 

