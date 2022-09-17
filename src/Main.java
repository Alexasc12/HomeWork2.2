public class Main {
    public static void main(String[] args) {
        Griffendorf haryPotter = new Griffendorf("Harry Potter", 45, 32, 77, 67, 78);
        Griffendorf ronUizly = new Griffendorf("Ron Uizly", 35, 33, 67, 57, 79);
        Kogtevran joyJang = new Kogtevran("Joy Jang",32,45,65,39,78,66);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil",52,46,85,29,48,56);
        Puffenduy  zahariaSmith = new Puffenduy("Zaharia Smith",44,77,55,76,43);
        Puffenduy  sedrikDiggory = new Puffenduy("Sedrik Diggory",74,67,35,74,73);
        Slizerin dragoMalfoy = new Slizerin("Drago Malfoy", 33,54,78,66,45,87,76);
        Slizerin gregoryGoyl = new Slizerin("Gregory Goyl", 47,73,58,59,71,77,49);
        System.out.println(haryPotter);
        System.out.println(joyJang);
        System.out.println(zahariaSmith);
        System.out.println(gregoryGoyl);
        haryPotter.compareStudent(ronUizly);
        Hogwarts.compareStudent(haryPotter,dragoMalfoy );
        System.out.println();
        zahariaSmith.compareStudent(sedrikDiggory);
        Hogwarts.compareStudent(zahariaSmith,ronUizly);
        System.out.println();
        dragoMalfoy.compareStudent(gregoryGoyl);
        Hogwarts.compareStudent(dragoMalfoy,ronUizly);
    }
}