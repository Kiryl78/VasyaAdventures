public class Merchant {
   private int cost;
   final int POTION_HP = 50;

   public Merchant (int cost) {
       this.cost = cost;
   }

   public void sellAndHeal (HeroVasya heroVasya) {
       if (heroVasya.getGold() >= cost) {
           heroVasya.setHp(heroVasya.getHp() + POTION_HP );
           System.out.println("Vasya: Gulp! HP insreased by "+ POTION_HP+"and now "+heroVasya.getHp());
           System.out.println("Vasya: Paid "+ cost+" for healing potion ");
           heroVasya.setGold(heroVasya.getGold()-cost);
       } else {
           System.out.println("Vasya: Not enough money !");
       }
   }
}
