public class MyCode{
    public static void main(String args[]){
        Circul Circ = new Circul();
        Circ.AreaCirc(8.56f);
    }
}

class Circul{
    float pi  = 3.14f;
    
    void AreaCirc(float Radious){
        float Area = pi*Radious*Radious;
        System.out.println(Area);
    }
} 