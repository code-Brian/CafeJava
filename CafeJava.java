public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = "Your total is $";
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 0.85;
        double lattePrice = 4.65;
        double cappucinoPrice = 3.65;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // App interaction simulation (add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        
        System.out.println(customer1 + readyMessage + displayTotalMessage + dripCoffeePrice);

        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappucinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        isReadyOrder2 = true;
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + (lattePrice*2));
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        // Customer interaction print statements here
    }
}   