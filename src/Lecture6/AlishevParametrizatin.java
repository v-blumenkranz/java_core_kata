package Lecture6;

import java.util.ArrayList;
import java.util.List;

public class AlishevParametrizatin {
    public static void main(String[] args) {
        //до Java 5:
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("owl");
        animals.add("deer");
        animals.add(ourAnimal); //этот объект не получится извлечь

        String animal = (String) animals.get(1);
        //String someAnimal = (String) ourAnimal;//ошибка
        System.out.println(animal);

        /**
         * Поскольку ArrayList и другие коллекции хранят массивы класса Object, а не конкретных классов
         * (например, String), которые мы туда кладем, то при извлечении элемента массива приходится
         * прибегать к даункастингу. Во избежание этого и были придуманы дженерики.
         */
        //после Java 5:
        //мы заранее предопределяем, что в лист можно класть объекты только класса String,
        //соответственно мы не сможем класть в лист левые объекты и не будем получать ошибки при даункастинге, как выше
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("owl");
        animals2.add("deer");

        String animal2 = animals2.get(1); //без даункастинга, поскольку параметр задан уже в листе
        System.out.println(animal2);

        //после Java 7 можно не указывать параметризацию справа
        List<String> animals3 = new ArrayList<>();
        //animals3.add(ourAnimal);//компилятор подчеркнет, что добавить Animal в массив String невозможно
    }
}

class Animal {

}
