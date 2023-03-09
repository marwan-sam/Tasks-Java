package geoshape;

class Rectangle extends GeoShape {
            Rectangle (double d1,double d2){
                super(d1,d2);
            }
            double area(){
//            System.out.println("Area of the Rectangle:");
            return(dim1*dim2);
            }
        }