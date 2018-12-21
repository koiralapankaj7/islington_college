// Q.1. Write a java program to show the implementation of parameterize
// constructor and methods.
// step 1: Open bluej.
// 2: Create a new project "week6".
// 3: Create a class OnlineShop.
// 4: declare itemname, price, and quantity as class level variable.
// 5: wirte the parameterize constructor then initialize itemname, price and
// quantity.
// 6: define a method to display the details of the item.
// 7: define a method to sell the registered item.
// a. name of the method is itemSell.
// b. ask the value for quantitiy to purchase as parameter.
// c. if item has not been sold out, sell the item then calculate the total
// amount. Reduce the quantity in inventory also.
// d. If customer tries to purchase the sold item then display the message, item
// is already sold.

// Step 3
class OnlineShop {

        // Step 4
        String itemName;
        double price;
        int quantity;

        // In bluej you will not require main method as we can rell each method by
        // selecting method name
        // We can provide value through bluej window
        // If you are running this code from command prompt / terminal then you need to
        // defin main method
        // Create object of a class
        // Then call method using object name
        // Remember this is not required in bluej
        public static void main(String[] args) {

                // Creating an object and inatializing value of class/instance variables
                OnlineShop onlineShop = new OnlineShop("Demo", 25.55, 20);

                // Calling display method
                onlineShop.display();

                // Calling method which sell item
                onlineShop.sellItem(10);

                // Again calling display method to see changes
                onlineShop.display();
        }

        // Step 5
        OnlineShop(String itemName, double price, int quantity) {
                this.itemName = itemName;
                this.price = price;
                this.quantity = quantity;
        }

        // Step 6
        void display() {
                System.out.println("Item name : " + itemName);
                System.out.println("Price : " + price);
                System.out.println("Quantity : " + quantity);
        }

        // Step 7a and 7b
        void sellItem(int quantitiy) {

                // Step 7c
                if (this.quantity >= quantitiy) {

                        // Calculating total price
                        double total = this.price * quantitiy;

                        System.out.println("====================================");
                        System.out.println("Quantity sold : " + quantitiy);
                        System.out.println("Total price : " + total);
                        System.out.println("====================================");

                        // Decreasing quantity
                        this.quantity = this.quantity - quantitiy;

                } else {
                        // Step 7d

                        System.out.println("====================================");
                        System.out.println("Sorry there is not enough quantity :");
                        System.out.println("====================================");
                        System.out.println("Available quantity :" + this.quantity);
                        System.out.println("Ordered quantity :" + quantity);
                        System.out.println("====================================");

                }
        }

}