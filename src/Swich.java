public class Swich {
    public static void main(String[] args) {
        String danie = "Burger";
     switch (danie)  {
         case "Pizza":
             System.out.println("Cena 22 zl");
             break;
         case "Łosoś":
                 System.out.println("Cena to 23 zl");
                 break;
         case "Frytki":
             System.out.println("Cena to 9 zl");
             break;
         default:
             System.out.println("Nie ma dania w karcie");
     }
    }
}
