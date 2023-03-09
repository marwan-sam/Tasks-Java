package geoshape;

 class Circle  extends GeoShape{
            Circle (double d1, double d2 ){
                super(d1, d2);
            }
            double area(){
//                System.out.println("Area of the Circle :");
                return((dim1*dim1)*dim2);
            }
        }