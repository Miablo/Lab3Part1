import java.util.ArrayList;

/**
 *
 */
public class DrawGraph {
    ArrayList<Coordinates> coords = new ArrayList<>();
    /**
     *
     */
    public void setLines(){
        // Line One
        // -200 <= x-y <=200
        Coordinates point1 = new Coordinates(-200,0);
        Coordinates point2 = new Coordinates(0, 200);
        // Line Two
        // -250 <= 2x+y-150 <= 250
        Coordinates point3 = new Coordinates(0,-100);
        Coordinates point4 = new Coordinates(200, 0);

        coords.add(point1);
        coords.add(point2);
        coords.add(point3);
        coords.add(point4);

        // x-y-200 <= 0
        // x-y-200 <= 0
        // x-y = -200
        // x-y = 200

        // -100 <= 2x+y <= 400
        // 2x+y=-100
        // 2x+y=400

    }

    /**
     *
     */
    public void solveZ(){
        // z = 3x^2+y^2+3xy-7x-8y+10
    }
    // z = 3x^2+y^2+3xy-7x-8y+10


     /*
    x-y-200 <= 0 this is linear, x = 0,
    y = -200 choose y = 0 and x = 200
    then draw line find four lines and find boundary where
    the intersection of two lines
    find domain for x and y

    post condition is max or min for both so for z...
    find four equations
    find the four points and plug them into the z equation and
    get value find the max and min based on the four max points */
}
