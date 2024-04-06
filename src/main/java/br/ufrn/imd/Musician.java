package br.ufrn.imd;

public class Musician extends Person {
    public boolean  playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;
    Musician() {
        System.out.println("set this person name");
        this.name = scan.next();

        System.out.println("set this person hometown");
        this.hometown = scan.next();

        canImprovise = true;
        canCompose = false;
        playClassicalMusic = false;
    }
    public boolean playClassicalMusic() {
        return this.playClassicalMusic;
    }
    public boolean canCompose() {
        return this.canCompose;
    }
    public void play() {
        System.out.println("is playing");
    }


    public boolean canImprovise() {
        return this.canImprovise;
    }
}
