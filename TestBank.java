
class Bank2{
    int getInterestRate(){
        return 0;}}
class Canara extends Bank2{
    int getInterestRate(){
        return 5;}}
class SBI extends Bank2{
    int getInterestRate(){
        return 6;}}
class SDCC extends Bank2{
    int getInterestRate(){
        return 8;}}
    
    

 

public class TestBank {
    public static void main(String[] args){
        Canara bank1 = new Canara();
        SBI bank2 = new SBI();
        SDCC bank3 = new SDCC();
        System.out.println("Bank1: "+ bank1.getInterestRate() + "%");
        System.out.println("Bank2: "+ bank2.getInterestRate() + "%");
        System.out.println("Bank3: "+ bank3.getInterestRate() + "%");
    }
    
}
