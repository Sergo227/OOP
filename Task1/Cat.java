package Task1;
// Задача 1:
// Создайте класс "Кот" (Cat) со следующими свойствами:

// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

import java.text.MessageFormat;

public class Cat {
   private String name;
   private int age;
   private Owner ownerName;

   public Cat() {
   }

   public void setOwnerName(Owner ownerName) {
      this.ownerName = ownerName;
   }

   public Owner getOwnerName() {
      return this.ownerName;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return this.name;
   }

   public int getAge() {
      return this.age;
   }

   public void greet() {
      System.out.println(MessageFormat.format("\u041c\u044f\u0443! \u041c\u0435\u043d\u044f \u0437\u043e\u0432\u0443\u0442 {0}. \u041c\u043e\u0439 \u0432\u043e\u0437\u0440\u0430\u0441\u0442 {1} \u0433\u043e\u0434\u0430(\u043b\u0435\u0442). \u041c\u043e\u0439 \u0432\u043b\u0430\u0434\u0435\u043b\u0435\u0446 {2}.", this.name, this.age, this.ownerName.getName()));
   }
}
