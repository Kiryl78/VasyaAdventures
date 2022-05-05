public class HeroVasya extends Person implements Agressive {
    private int buff;
    public HeroVasya (int hp, int str, int dex, int xp, int gold, int buff) {
        super(hp,str, dex,xp, gold);
        this.buff = buff;
        if (buff == 1) {
            System.out.println("Vasya is a knight! ");
            str = str + 2;
        }
        if (buff == 2) {
            System.out.println("Vasya is a rogue! ");
            dex = dex + 2;
        }
    };

}
