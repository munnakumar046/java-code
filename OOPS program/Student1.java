class Test{
    //current class variable
    private int studId;
    private String studName; 
    private double studFee;
    
    //setter method
    public void setstudId(int studId)
    {
        this.studId=studId;
    }
    public void setstudName(String studName)
    {
        this.studName=studName;
    }
    public void setstudFee(double studFee)
    {
        this.studFee=studFee;
    }

    //getter method
    public int getstudId()
    {
        return studId;
    }
    public String getstudName()
    {
        return studName;
    }
    public double getstudFee()
    {
        return studFee;
    }
}
class Student1 {
    public static void main(String[] args) {
        Te t=new Te
        t.setstudId(121);
        t.setstudName("Muuna");
        t.setstudFee(2000d);

        System.out.println("Student id="+t.getstudId());
        System.out.println("Student name="+t.getstudName());
        System.out.println("Student fee="+t.getstudFee());
    }
    
}
