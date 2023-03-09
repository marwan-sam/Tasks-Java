package geoshape;

class GeoShape{
        double dim1,dim2;
        
        GeoShape(double d1,double d2){
        dim1=d1;
        dim2=d2;
        }
        
        double area(){
        System.out.println("Area for the GeoShape cannot be determined");
            return 0;
        }
        
        
       
        
        
        
            
        public static void main (String args []){
            
                GeoShape s = new GeoShape(3,5);
                
                s = new Rectangle(5,10);
                System.out.println("area of Rectangle:"+s.area());
                
                s = new Circle (5, 3.14);
                System.out.println("area of Circle :"+s.area());
                
                s= new Triangle(5,6);
                System.out.println("area of Triangle:"+s.area());
        }
        
}