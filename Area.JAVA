public class Area {
    public static void main(String[] rgs){
        Area obj=new Area();
        obj.Circle(5f);
        obj.Square(4);
        obj.Rectangle(9,7);
    }
    public static void Circle(Float a){
        Float ar=(22/7)*a*a;
        System.out.println("The area of circle is :"+ar);
    }
    public static void Square(int b){
        int ar=b*b;
        System.out.println("The area of square is :"+ar);
    }
    public static void Rectangle(int c,int v){
        int ar=c*v;
        System.out.println("The area of rectangle is :"+ar);
    }
}
