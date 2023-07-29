// Задача 2:
// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:

// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).

public class Rectangle {
    private int width;
    public int height;

   public Rectangle() {
      this(10, 10);
   }

   public Rectangle(int width, int height) {
      this.height = height;
      this.width = width;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public void setWidth(int width) {
      this.width = width;
   }

   public int getHeight() {
      return this.height;
   }

   public int getWidth() {
      return this.width;
   }

   public int calculateArea(Rectangle rectangle) {
      int area = rectangle.getWidth() * rectangle.getHeight();
      return area;
   }

   public int calculatePerimeter(Rectangle rectangle) {
      int perimeter = 2 * (rectangle.getHeight() + rectangle.getWidth());
      return perimeter;
   }
}
