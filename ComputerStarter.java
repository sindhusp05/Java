class ComputerStarter{

public static void main(String[] args)
{

Computer computer=new Product();
Computer.displayDetails();
Computer.brand="hp";
Computer.modelNo="8.0f"
Computer.price=50.0;
Computer.quantity=1;
Computer.displayDetails();

Computer computer1=new Product();
Computer1.displayDetails();
Computer1.brand="hp";
Computer1.modelNo="8.0f"
Computer1.price=50.0;
Computer1.quantity=1;
Computer1.displayDetails();

Computer computer2=new Product();
Computer2.displayDetails();
Computer2.brand="dell";
Computer2.modelNo="7.0f"
Computer2.price=30.0;
Computer2.quantity=1;
Computer2.displayDetails();

Computer computer3=new Product();
Computer.displayDetails();
Computer.brand="lenevo";
Computer.modelNo="10.0f"
Computer.price=60.0;
Computer.quantity=1;
Computer.displayDetails();

Computer computer4=new Product();
Computer4.displayDetails();
Computer4.brand="Sony";
Computer4.modelNo="8.0f"
Computer4.price=50.0;
Computer4.quantity=1;
Computer4.displayDetails();




Computer.displayTotalPrice();
Computer1.displayTotalPrice();
Computer2.displayTotalPrice();
Computer3.displayTotalPrice();
Computer4.displayTotalPrice();

}
}