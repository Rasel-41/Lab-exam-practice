public class Supervisor extends Worker{
    private String division;
    public Supervisor(String name,double wage,String division){
        super(name, wage);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    @Override
    public String toString() {
        return super.toString()+ ",Division :" +division;
    }
}
