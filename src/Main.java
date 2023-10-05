import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Shape shape = new Shape();

       Point point = new Point(1,3, 4);
       Polygon polygon = new Polygon(point);

       var i = 9;
       var j = 8;


        System.out.println(shape.toString() + i);
        System.out.println(polygon.toString() + j);
        System.out.println(ret(point));

        IntStream.range(j, i).forEach(System.out::println);
    }


    private static int ret(Point p){

        return switch (p.x()){
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> {
                System.out.println("hello");
                yield 4;
            }
            default -> 0;
        };

    }
}