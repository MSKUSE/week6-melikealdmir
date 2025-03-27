public class Main {
    public static void main(String[] args) {
        Point p = new Point(x:3,y:4);
        Rectangle r1=new Rectangle(p,sideA:3,sideB:4);
        System.out.println(r1.counterforobject);
        System.out.println(Rectangle.counter);
        Rectangle r2=new Rectangle(p, r1.sideA:5,sideB:6);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        System.out.println(Integer.max(a:3 ,b:4));
        System.out.println(Integer.parseInt(s:"1");
        String a =new String(original:"aaa");
        System.out.println(a);
        System.out.println(r1);


        Rectangle =new Rectangle(new Point(x:3,y:4)),sideA:5,sideB);
        System.out.println(r,getLocation());
        System.out.println(r);

        Shape shape =new Shape(new Point());
    }
    public class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }



}