package br.ufrn.imd;

public class GuitarPlayer extends Musician {
    public int howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;

    GuitarPlayer() {
        System.out.println("set this person name");
        this.name = scan.next();

        System.out.println("set this person hometown");
        this.hometown = scan.next();

        canImprovise = true;
        canCompose = false;
        playClassicalMusic = false;

        howManyYears =10;
        playEletronicGuitar = true;
        playAcousticGuitar = false;
    }


    public int howManyYears() {
        return howManyYears;
    }

    public void playGuitar() {
        System.out.println("is playing guitar");
    }
}
