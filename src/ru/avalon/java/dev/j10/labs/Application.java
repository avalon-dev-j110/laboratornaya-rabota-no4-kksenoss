package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"The", "man", "in", "black", "fled", "across", "the", "desert", 
            "and", "the", "gunslinger", "followed", "test", "free", "wish", "end", "mass" ,"ace", "of", "spades"};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = {
                new implPerson("Роланд", LocalDate.of(1990,1,12)),
                new implPerson("Рикардо", LocalDate.of(1986, 3, 15)),
		new implPerson("Иван", LocalDate.of(1956, 5, 27)),
		new implPerson("Рогал", LocalDate.of(1974, 4, 25)),
		new implPerson("Терри", LocalDate.of(1947, 6, 28)),
		new implPerson("Кирг", LocalDate.of(2017, 4, 19)),
		new implPerson("Морти", LocalDate.of(2005, 05, 17)),
		new implPerson("Рик", LocalDate.of(2020, 1,01)),
		new implPerson("Вася", LocalDate.of(2007, 12, 29)),
		new implPerson("Яша", LocalDate.of(2014, 3, 16)),
		new implPerson("Петр", LocalDate.of(1991, 12, 7)),
		new implPerson("Имя", LocalDate.of(2003, 7, 11)),
		new implPerson("Ещеодноими", LocalDate.of(1968, 4, 26)),
		new implPerson("Ксения", LocalDate.of(1917, 2, 19)),
		new implPerson("Пётр", LocalDate.of(1987, 4, 17)),
		new implPerson("Тест", LocalDate.of(1989, 3, 4)),
		new implPerson("Имяимя", LocalDate.of(1978, 7, 10)),
		new implPerson("Человек", LocalDate.of(2015, 1, 30)),
		new implPerson("Я", LocalDate.of(1985, 1, 01)),
		new implPerson("Длинноеимя", LocalDate.of(2020, 4, 26))
            };
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new implSort();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
       Comparator comparator = new implComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
       sort.sort(strings, comparator);


		for (Person person : persons ) {
			System.out.println(person);
		}
			for (String string : strings) {
				System.out.println(string);
			}

    }
    }

