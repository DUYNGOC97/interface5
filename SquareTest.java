package interface5;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square("red",true,12);
        squares[1] = new Square("green",true,2);
        squares[2] = new Square("black",true,5);

        for (Square square : squares) {
            System.out.println(square);
           square.howToColor();
            }

        }
    }

