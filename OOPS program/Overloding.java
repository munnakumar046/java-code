class MeeSeva
{
    public void search(int voterId)
    {
        System.out.println("detail found via voterId");
    }
    public void search(long adharId)
    {
        System.out.println("detail found via adharId");
    }
    public void search(String houseNo)
    {
        System.out.println("detail found via houseNo");
    }

}
public class Overloding {
    public static void main(String[] args) {
        MeeSeva m=new MeeSeva();
        m.search(123);
        m.search(500943249025l);
        m.search("12/23-0");
        
    }
}
