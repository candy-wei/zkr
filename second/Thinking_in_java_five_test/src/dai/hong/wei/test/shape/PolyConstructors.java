package dai.hong.wei.test.shape;

/**
 * Date:18/8/28
 * Author: Candy you will like it
 * Desc: for fun
 */
public class PolyConstructors {
    public static void main(String[] args) {
        new RectangularGlyph(5);
    }
}
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()...");
    }
    Glyph(){
        System.out.println("Glyph before draw()...");
        draw();
        System.out.println("Glyph after draw()...");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph() radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = "+radius);
    }
}
class RectangularGlyph extends Glyph{
    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), width = "+width);
    }
    private int width = 3;
    public RectangularGlyph(int a){
        width = a;
        System.out.println("RectangularGlyph.RectangularGlyph() width = "+width);
    }
}