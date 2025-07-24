interface shapes{
    public void Noofangles();
};

class square implements shapes
{
    public void Noofangles()
    {
        int s=10;
        double areas=s*s;
        System.out.println("Area Of SQuare "+ areas);

    }
};
class rectangle implements shapes{
    public void Noofangles(){
        int l=10, b=23;
        double arear=l*b;
        System.out.println("Area Of Rectangle "+ arear);
        
    }
};


class area{
    public static void main(String args[]){
        square obj1=new square();
        obj1.Noofangles();

        rectangle obj2=new rectangle();
        obj2.Noofangles();
    
    
    }


}