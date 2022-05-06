import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int choice, buff;
    public static boolean thatsAllFolks;

    public static void main(String[] args) {

        System.out.println("== WELCOME to unfortunate adventures of Hero Vasya ! ==");
        System.out.println("=======================================================");

        //Hero buffs choice aka classes
        System.out.println(" Please select the buff: 1:Knight +2 to STR or 2:Rogue +2 to DEX ");
        Scanner scanner = new Scanner(System.in);
        buff = scanner.nextInt();
        if ((buff != 1) && (buff != 2)) {
            buff = 0;
            System.out.println("You will have no buff then ");
        }

        //create unique chars
        HeroVasya vasya = new HeroVasya(100, 5, 5, 0, 0, buff);
        Merchant merch = new Merchant(33);

        // lets go
        thatsAllFolks = false;
        do {
            System.out.println(vasya);
            System.out.println(" Where now ? 1: Forest, 2: Merchant, 3: End ");
            System.out.println(" -------------------------------------------");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Vasya is going to fight ! ");
                    // Skeleton or Goblin ?
                    Random random = new Random();
                    if (random.nextBoolean()) {
                        Skeleton enemy = new Skeleton(30, 5, 3, 20, (int) Math.random() * 30);
                        System.out.println("Skeleton appeared ! FIGHT !!!");
                        enemy.battleCry();
                        thatsAllFolks = fight(vasya, enemy);
                    } else {
                        Goblin enemy = new Goblin(20, 3, 5, 10, (int) Math.random() * 20);
                        System.out.println("Goblin appeared ! FIGHT !!!");
                        enemy.battleCry();
                        thatsAllFolks = fight(vasya, enemy);
                    }
                    Object enemy = null;
                }
                case 2 -> {
                    System.out.println("Vasya is going to the Merchant for healing potion ! ");
                    merch.sellAndHeal(vasya);
                }
                case 3 -> thatsAllFolks = true;
                default -> System.out.println("Where did you send Vasya, again ?");
            }

        } while (!thatsAllFolks);
        System.out.println("That is All, Folks !");

    }
        public static boolean fight (HeroVasya vasya, Person enemy){
            do {
                int v_hit = vasya.slash();
                int e_hit = enemy.slash();
                enemy.setHp(enemy.getHp() - v_hit);
                vasya.setHp(vasya.getHp() - e_hit);
            } while ((vasya.getHp() > 0) && (enemy.getHp() > 0));

            if (vasya.getHp() <= 0) {
                System.out.println("Vasya is DEAD ! RIP ");
                return true;
            } else {
                System.out.println("Victory! " + "Got " + enemy.getXp() + "XP and "+ enemy.getGold()+" Gold");
                vasya.setXp(vasya.getXp() + enemy.getXp());
                vasya.setGold(vasya.getGold() + enemy.getGold());
                return false;
            }
        }

}
