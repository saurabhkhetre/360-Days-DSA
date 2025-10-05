public class Pen {
    public static void main(String Arr[])
    {
        Penn obj = new Penn();
        obj.setcolour("Blue");
        System.out.println(obj.colour);

        obj.setlid(5);
        System.out.println(obj.lid);

    }
    
}
class Penn {
    String colour;
    int lid;

    void setcolour(String newcolour){
        colour = newcolour;

    }
    void setlid(int newlid) {
        lid = newlid;
    }
}