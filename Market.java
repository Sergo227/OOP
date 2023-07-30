// 2)Реализовать класс Market и все его обязательные методы. Этот класс должен реализовывать методы из интерфейса QueueBehaviour, 
// которые имитируют работу очереди. Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour, 
// которые добавляют и удаляют людей из очереди, а также метод update, который обновляет состояние магазина путем принятия и отдачи заказов.
package Lesson2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Market implements MarketBehaviour, QueueBehaviour {
   private Queue<String> queue = new LinkedList();

   public Market() {
   }

   public void addPerson(String person) {
      this.enqueue(person);
   }

   public void removePerson(String person) {
      this.queue.remove(person);
   }

   public void update() {
      if (!this.queue.isEmpty()) {
         Random random = new Random();
         int id = random.nextInt(10000) + 1000;
         String person = this.dequeue();
         System.out.println("\u0417\u0430\u043a\u0430\u0437 \u043d\u0430 \u0438\u043c\u044f " + person + " \u043f\u0440\u0438\u043d\u044f\u0442, \u2116 \u0437\u0430\u043a\u0430\u0437\u0430: " + id);

         try {
            Thread.sleep(2000L);
         } catch (InterruptedException var6) {
            throw new RuntimeException(var6);
         }

         System.out.println("\u041e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0430 \u0437\u0430\u043a\u0430\u0437\u0430 \u2116" + id);

         try {
            Thread.sleep(2000L);
         } catch (InterruptedException var5) {
            throw new RuntimeException(var5);
         }

         System.out.println("\u0417\u0430\u043a\u0430\u0437 \u2116" + id + " \u0432\u044b\u0434\u0430\u043d, \u043f\u043e\u043b\u0443\u0447\u0430\u0442\u0435\u043b\u044c: " + person);
      } else {
         System.out.println("\u0412 \u043e\u0447\u0440\u0435\u0434\u0438 \u043d\u0435\u0442 \u0437\u0430\u043a\u0430\u0437\u043e\u0432");
      }

   }

   public void enqueue(String person) {
      this.queue.add(person);
   }

   public String dequeue() {
      return (String)this.queue.remove();
   }

   public int size() {
      return this.queue.size();
   }
}
