public class GeometryLab {
    public int f(int x, int y){
        return x + y;
    }
    
    public int g(int x, int y){
        return x - y;
    }
    public int h(int x, int y){
        return x * y;
    }
    public int j(int x, int y){
        return x / y;
    }
    public int k(int x, int y){
        return x % y;
    }
    public int m(int x, int y, int z){
        return x + y - z;
    }
    public double triArea(int b, int h){
        return 0.5 * b * h;
    }
    public double trapArea(int b1, int b2, int h){
        return 0.5 * h * (b1 + b2);
    }
    public int rectArea(int b, int h){
        return b * h;
    }
    public double circArea(int r){
        return 3.14 * r * r;
    }
    public int paralArea(int b, int h){
        return b * h;
    }
    public int pythHypotenuse(int a, int b){
        return a * a + b * b;
    }
    public double triPrismVol(int b, int h, int w){
        return 0.5 * b * h * w;
    }
    public int rectPrismVol(int b, int h, int w){
        return b * h * w;
    }
    public double rectPyramidVol(int b, int h, int w){
        return (1.0/3) * b * h * w;
    }
    public double cylVol(int r, int h){
        return 3.14 * r * r *h;
    }
    public double sphereVol(int r){
        return (4.0/3) * (3.14) * r * r * r;
    }
    public double coneVol(int r, int h){
        return (1.0/3) * 3.14 * r * r* h;
    }
    public double sphereSurfArea(int r){
        return (4.0) * (3.14) * r * r;
    }
    public double cylSurfArea(int r, int h){
        return ((2.0) * 3.14 * r * h) + ((2.0) * 3.14 * r *r);
    }
    public double rectPrismSurfArea(int b, int h, int w){
        return ((2.0) * b * h ) + ((2.0) * b * w ) + ((2.0) * h * w );
    }
    
}

