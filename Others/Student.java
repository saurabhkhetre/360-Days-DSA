public class Student
{
 public static void main(String Arr[]){

    Info P1 = new Info();
    P1.setinfo("Niraj" , 30);
    System.out.println(P1.name);
    System.out.println(P1.rollno);

    P1.Persentage(67.35f,58.63f,97.95f);



 }
}
class Info{
    String name;
    int rollno;

    void setinfo(String setname, int setrollno){
        name = setname;
        rollno = setrollno;

    }
    void Persentage(float math, float english, float chem){
        float Persentage = (math + english + chem)/3;
        System.out.println(Persentage);


    }
}