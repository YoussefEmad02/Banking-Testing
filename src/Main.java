public class Main {
    public static void main(String[] args){
       /* Client client1 = new Client("Seif","****");
        System.out.println(client1.getName());
        Transaction trans1 = new Transaction("Withdraw",200,client1.getAccount());
        System.out.println(client1.getAccount().getBalance());
        Transaction trans2 = new Transaction("Deposit",200,client1.getAccount());
        System.out.println(client1.getAccount().getBalance());
        Client client2 = new Client("Yassin","******");
        Transaction trans3 = new Transaction("Transfer",200,client1.getAccount(),client2.getAccount());
        System.out.println(client1.getAccount().getBalance());
        System.out.println(client2.getAccount().getBalance());
        System.out.println(client1.getPassword());
        System.out.println(client2.getPassword());
        System.out.println(client1.getPhoneNo());
        System.out.println(client2.getPhoneNo());*/

        Client client8 = new Client("Seif ","*****");
        Client client9 = new Client("Yassin ","*****");

        Transaction trans = new Transaction("Deposit", 400, client8.getAccount());

        Transaction trans2 = new Transaction("Deposit", 600, client8.getAccount());
        Transaction trans3 = new Transaction("Withdraw", 150, client8.getAccount());
        Transaction trans4 = new Transaction("Transfer", 150, client8.getAccount(), client9.getAccount());

        Transaction trans6 = new Transaction("Pay",client8.getAccount(),"40091000");
        //System.out.println(client8.getAccount().getBalance());
        Transaction trans7 = new Transaction("Withdraw", 10000, client8.getAccount(), client9.getAccount());

        client8.getAccount().printTransactions();
        System.out.println("\n");

        System.out.println(client8.getAccount().getBalance());
        client9.getAccount().printTransactions();
        double[] prices = {100,200,300,400,500,600,700,800,900,1000};
        String payCode = "10000";
        System.out.println(payCode.charAt(0) - '0');

    }
}