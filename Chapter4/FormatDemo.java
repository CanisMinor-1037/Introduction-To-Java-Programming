public class FormatDemo {
    public static void main(String[] args) {
        //Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees","Radius","Sine","Cosine","Tangent");

        //Display values for 30 degrees
        int degrees = 30;
        double radius = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,radius,Math.sin(radius),Math.cos(radius),Math.tan(radius));
    
        degrees = 60;
        radius = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,radius,Math.sin(radius),Math.cos(radius),Math.tan(radius));
    }
}
