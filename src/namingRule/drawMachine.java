package namingRule;

import java.util.ArrayList;

public class drawMachine {

    class Point2D {
        private int x;
        private int y;

        Point2D (int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void draw() {
            System.out.println(x + " " + y);
        }
    }

    class Canvas {
        ArrayList<Point2D> points = new ArrayList<>();

        void addPoint(Point2D point) {
            points.add(point);
        }

        void drawPoints() {
            for (Point2D point : points) {
                point.draw();
            }
        }
    }
    public class Main {

    }

}