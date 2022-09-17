public class Puffenduy extends Hogwarts{
   private int industriousness;
   private int loyalty;
    private int honesty;
    public Puffenduy(String fullName, int magic, int teleport, int industriousness, int loyalty, int honesty) {
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;}
    public int getIndustriousness() {
        return industriousness;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }
    @Override
    public String toString() {
        return fullName+ ", Факультет Puffenduy{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
         public void compareStudent(Puffenduy studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }
}