/**
 * @author Cody Walker, Mio Diaz
 * @version 1.0
 */

public class MathEquation {
    double x;
    double y;
    double minz;
    double maxz;

    /**
     *
     * @return  give back value of z for x and y values
     */
    private double equationZ(){
        return(3 * Math.pow(this.x, 2) + Math.pow(this.y, 2) + 3 * this.x * this.y + 10.0);
    }

    /**
     * finds max and min z value for range of x with corresponding y values
     */
    public void fun(){
        this.x = -100;
        this.y = 100;
        this.minz = equationZ();
        this.maxz = equationZ();
        do{
            if(this.x <= 33) {
                this.x += 1;
                this.y -= 2;
            }else if(x > 33 && x <= 66){
                this.x += 1;
                this.y += 13;
            }else{
                x += 1;
                y -= 1.9703703704;
            }
            if(minz > equationZ())
               this.minz = equationZ();
           if(maxz < equationZ())
               this.maxz = equationZ();
        }while(this.x < 200);
        System.out.println("For |x-y| <= 200 and |2x+y-150| <= 250");
        System.out.println("Gives us the range for x and y as, -100 <= x <= 200 and -166 <= y <= 266.");  //preconditions
        System.out.print("For this range of x and y the range of Z is ");
        System.out.print(this.minz + " <= Z <= " + this.maxz);  //post-conditions for Z
    }
}
