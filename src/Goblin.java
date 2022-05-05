public class Goblin extends Person {

   public Goblin (int hp, int str, int dex, int xp, int gold) {
      super(hp, str, dex, xp, gold);
   }

   public void battleCry() {
      System.out.println("Roarrr !!!");
   }
}
