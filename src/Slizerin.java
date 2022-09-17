public class Slizerin extends Hogwarts {
    private int cunning;
   private int determination;
   private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slizerin(String fullName,int cunning, int determination, int ambition, int resourcefulness, int lustForPower,int magic, int teleport ) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
    }
    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getLustForPower() {
        return lustForPower;
    }
    @Override
    public String toString() {
        return fullName+ ", Факультет Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", teleport=" + teleport +
                '}';
    }
    public void compareStudent(Slizerin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition + studentSecond.resourcefulness + studentSecond.lustForPower;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }
}




