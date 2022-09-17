public class Kogtevran extends Hogwarts {
   private int mind;
   private int wisdom;
   private int wit;
   private int creation;
    public Kogtevran(String fullName, int wisdom, int mind, int wit, int creation, int magic, int teleport) {
        this.wisdom = wisdom;
        this.mind = mind;
        this.wit = wit;
        this.creation = creation;
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getMind() {
        return mind;
    }
    public int getWit() {
        return wit;
    }
    public int getCreation() {
        return creation;
    }
    @Override
    public String toString() {
        return fullName+ ", Факультет Kogtevran{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
     public void compareStudent(Kogtevran studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit + this.creation;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creation;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }
}