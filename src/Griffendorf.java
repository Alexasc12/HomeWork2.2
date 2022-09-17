public class Griffendorf extends Hogwarts {
    private int honor;
    private int nobility;
    private int bravery;
    public Griffendorf(String fullName, int magic, int teleport, int bravery, int honor, int nobility) {
        this.bravery = bravery;
        this.nobility = nobility;
        this.honor = honor;
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    @Override
    public String toString() {
        return fullName+ ", Факультет Griffendorf{" +
                "honor=" + honor +
                ", nobility=" + nobility +
                ", bravery=" + bravery +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
    public void compareStudent(Griffendorf studentSecond) {
        int powerOne = this.bravery + this.nobility + this.honor;
        int powerTwo = studentSecond.bravery + studentSecond.nobility + studentSecond.honor;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }
}


