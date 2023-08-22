package method;

class Point2D {

    private int x;
    private int y;
    public boolean isZeroPoint() {
        return x == 0 && y == 0 ;
    }


}
public class removeFlag {
    void drawOutLinedCircle(Point2D point, double radius) {
        if (point.isZeroPoint()) {
            firstDraw(radius);
        }
        circle_draw2(point, radius);
    }
    void drawUnOutLinedCircle( Point2D point, double radius) {
        if (point.isZeroPoint()) {
            firstDraw(radius);
        }
        circle_draw(point, radius);
    }

    void deleteCircle(Point2D point , double radius) {
        if (point.isZeroPoint()) {
            firstDraw(radius);
        }
        circleDelete(point, radius);
    }

    void circle_draw(Point2D point, double radius) {
        //원을 화면에 그린다.
    }

    void circleDelete(Point2D point, double radius) {
        //원을 화면에 지운다.
    }

    void circle_draw2(Point2D point, double radius) {
        //테두리가 있는 원을 화면에 그린다.
    }

    void firstDraw(double radius) {
        //0, 0 에 그림을 그리지 못하도록 예외처리
        //에러 출력 하지 않고, 아무것도 하지 않는다.
    }
}