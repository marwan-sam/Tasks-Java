package geoshape;

class Triangle extends GeoShape {
            Triangle (double d1,double d2){
                super(d1,d2);
            }
            double area(){
//                System.out.println("Area of the Triangle:");
                return(dim1*dim2);
            }
        }