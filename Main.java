package Lesson2;

public class Main {
 public Main() {
   }

   public static void main(String[] args) {
      Market market = new Market();
      market.addPerson("\u0412\u043b\u0430\u0434\u0438\u043c\u0438\u0440");
      market.addPerson("\u0410\u043d\u0442\u043e\u043d");
      market.addPerson("\u0415\u043b\u0438\u0437\u0430\u0432\u0435\u0442\u0430");
      market.addPerson("\u0413\u0440\u0438\u0433\u043e\u0440\u0438\u0439");
      market.addPerson("\u0410\u043d\u0430\u0442\u043e\u043b\u0438\u0439");
      market.addPerson("\u0418\u0432\u0430\u043d");
      market.addPerson("\u0410\u043b\u0435\u043a\u0441\u0435\u0439");
      market.removePerson("\u0410\u043d\u0442\u043e\u043d");
      market.removePerson("\u0410\u043b\u0435\u043a\u0441\u0435\u0439");

      for(int i = market.size(); i >= 0; --i) {
         market.update();
         if (market.size() == 0) {
            market.update();
            break;
         }

         System.out.println("\u0412 \u043e\u0447\u0435\u0440\u0435\u0434\u0438 " + market.size() + " \u0447\u0435\u043b\u043e\u0432\u0435\u043a(\u0430)");

         try {
            Thread.sleep(5000L);
         } catch (InterruptedException var4) {
            throw new RuntimeException(var4);
         }
      }

   }
}
