class Student
{
  String nrp;

  public String getNrp() {
    return nrp;
  }

  public void setNrp(String nrpB) {
    nrp = nrpB;
  }

  public static void main(String[] args)
  {
    Student x = new Student();
    Student y = x;
    x.setNrp("01");
    y.setNrp("02");
    System.out.println("x nrp = " + x.getNrp());
    Student z = new Student();
    z.setNrp("03");
    x = z;
    System.out.println("x nrp = " + x.getNrp());
    System.out.println("y nrp = " + y.getNrp());
  }
}
