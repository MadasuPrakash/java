interface sum{
int sm=10;
void sa();}
interface add{
int d=20;
void ad();}
class interface_ex implements add,sum{
public void sa(){System.out.println(sm);}
public void ad(){System.out.println(d);}
public static void main(String args[]){
interface_ex ie=new interface_ex();
ie.sa();
ie.ad();}}
