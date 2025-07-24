abstract class shapes{
    public abstract int Noofangles();
};

class triangle extends shapes
{
    public int Noofangles()
    {
        return 3;
    }
};
class pentagon extends shapes{
    public int Noofangles(){
        return 5;
    }
};

class hexagon extends shapes{
    public int Noofangles(){
        return 6;
    }
};
class angles{
    public static void main(String args[]){
        triangle obj1=new triangle();
        int agt=obj1.Noofangles();
        System.out.println("Number of angle in triangle="+agt);

        pentagon obj2=new pentagon();
        int agp=obj2.Noofangles();
        System.out.println("Number of angle in pentagon="+agp);

        hexagon obj3=new hexagon();
        int agh=obj3.Noofangles();
        System.out.println("Number of angle in hexagon="+agh);
    }
}