public class Director extends Supervisor{
    private String region;
public Director(String name,double wage,String division,String region){
    super(name, wage, division);
    this.region = region;
}

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Region : "+ region;
    }
}
