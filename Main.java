abstract class Nyenyak {
    public abstract void berkata();
    public void tidur() {
        System.out.println("ngokkk ngokkkk suara joko mendengkur");
    }
}

class Teman extends Nyenyak {
    public void berkata() {
        System.out.println("Joko berkata ingin tidur");
    }
}

class Main {
    public static void main(String[] args) {
        Teman Joko = new Teman();
        Joko.berkata();
        Joko.tidur();
    }
}
