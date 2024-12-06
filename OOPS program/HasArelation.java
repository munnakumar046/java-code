class Ihub
{
    public String courseName()
    {
        return "Full stack java + AWS";
    }
    public double courseFee()
    {
        return 30000d;
    }
    public String trainerName()
    {
        return "munna sir";
    }
}
class Usha
{
    public void getCourseDetail()
    {
        Ihub i=new Ihub();
        System.out.println(i.courseName() );
        System.out.println(i.courseFee() );
        System.out.println( i.trainerName());
    }
}
public class HasArelation {
    public static void main(String[] args) {
        Usha u=new Usha();
        u.getCourseDetail();
    }
}
