package design_patterns.factory;

public class Phone implements Computer{
    @Override
    public void compute(){
        System.out.println("Phone computes");
    }
}
