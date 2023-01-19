public class LAB1_Q10 {
        public static void main(String[] args) {
            Inheritance obj =new Inheritance();
            System.out.println("10) Write a program to demonstrate inheritance. ");
            System.out.println("\n### Super class = Shape :");
            Inheritance.Shape shape = obj.new Shape(7, 9, 4);
            shape.displayDimensions();
            
            Inheritance.Cube cube = obj.new Cube(8);
            System.out.println("\n### Inherited class = Shape <- Cube :");
            cube.displayDimensions();
            System.out.println(" Volume of cube: " + cube.getVolume());
        }  
}
class Inheritance{
    class Shape {
        protected double width;
        protected double height;
        protected double depth;
        
        public Shape(double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        
        public double getDepth() {
            return depth;
        }
        public void setDepth(double depth) {
            this.depth = depth;
        }
        
        public void displayDimensions() {
            System.out.println(" Width: " + width + "\n Height: " + height + "\n Depth: " + depth);
        }
    }
    
    class Cube extends Shape {
        public Cube(double width) {
            super(width, width, width);// sets all three constructor-parameters of super class as width
        }
        public double getVolume() {
            return width * height * depth;
        }
    }
}