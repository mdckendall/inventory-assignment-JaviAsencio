import java.util.Scanner;
import java.util.ArrayList;

// Create a class for the inventory
class Inventory {

  // Create a string for the name.
  String name;

  // Create a string for the serial number.
  String serialNum;

  // Create an int to store the value.
  int value;


  // Create a public class for the inventory.
  public Inventory(String name, String serialNum, int value) {

    // Create this function to prevent any errors from happening.
    this.name = name;
    this.serialNum = serialNum;
    this.value = value;
  }

  // Create a public string to get and return the name.
  public String getName() {
    return name;
  }

  // Create a public void to get the new name and return the new name of the item.
  public void setName(String name) {
    this.name = name;
  }

  // Create a public string to get the serial number and return the serial number of the item.
  public String getSerialNum() {
    return serialNum;
  }

  // Create a public void to get the new serial number and return the new serial number of the item.
  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
  }

  // Create a public int to get the value and return the value of the item.
  public int getValue() {
    return value;
  }

  // Create a public void to get the new value and return the new value of the item.
  public void setValue(int value) {
    this.value = value;
  }
}

class Main {
  public static void main(String[] args) {

// Create an int to store the choice of the menu.
int choice;

// Create a string for the name of the item.
String name;

// Create a string for the serial number.
String serialNum;

// Create a string for the value.
int value;

// Create an array list to store the items that were added to the inventory.
ArrayList<Inventory> InventItem = new ArrayList<>();

// Create a scanner to get the input in the menu.
Scanner scan = new Scanner(System.in);

// Display the menu options.
  do {
    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");

    // Get the option that was selected and create a new line.
    choice = Integer.parseInt(scan.nextLine());

    // Create the outcome for each option.
    switch(choice) {

        // If option one is selected get some information about the item.
      case 1:

        // Create a message and ask for the name of the item and create a scan to take the input from the next line.
        System.out.println("Enter the name");
        name = scan.nextLine();

        // Create a message and ask for the serial number and create a scan to take the input from the next line.
        System.out.println("Enter the serail number: ");
        serialNum = scan.nextLine();

        // Create a message and ask for the price and create a scan to take the input from the next line.
        System.out.println("Enter the value in dollars (whole number):");
        value = Integer.parseInt(scan.nextLine());

        // Store the informatin about the item.
        Inventory item = new Inventory(name, serialNum, value);

        // Allow the object to be added or if the user decides to add another item make sure to store the information.
        InventItem.add(item);

        // Stop the menu from repeating over and over.
        break;

        // Allow the user to delete the item that they want to delete.
      case 2:

        // Display a message and ask for the serial number of the item that they want to delete and create a scan to take the input from the next line.
        System.out.println("Enter the serial number of the item to delete: ");
        String serial = scan.nextLine();

        // Remove the item from the list
        for(int i = 0; i < InventItem.size(); i++) {

          // Check to see if the serial number matches the item that they want to remove.
          if(InventItem.get(i).getSerialNum().contains(serial)) {

            // Allow the user to remove the item.
            InventItem.remove(i);
          }
        }

        // Stop the menu from repeating over and over.
        break;

        // Allow the user to update the information for an object.
      case 3:

        // Create a message and ask for the serial number of the item that they want to change and create a scan to take the input from the next line.
   System.out.println("Enter the serial number of the item to change:");
        serial = scan.nextLine();

        // Check the amount of items that are in the inventory.
        for(int i = 0; i < InventItem.size(); i++) {

          // Another check to see if the serial number matches with the current item.
          if(InventItem.get(i).getSerialNum().contains(serial)) {

            // Create a message and ask for the new name of the item and create a scan to take the input from the next line.
            System.out.println("Enter the new name:");
            name = scan.nextLine();

            // Store the information about the new name.
            InventItem.get(i).setName(name);

            // Create a new meassage and ask for the new value of the item and create a scan to take the input from the next line.
            System.out.println("Enter the new value in dollars (whole number):");
            value = Integer.parseInt(scan.nextLine());

            // Store the information about the new value of the item.
            InventItem.get(i).setValue(value);
          }
        }

        // Prevent the menu from repeating over and over.
        break;

        // Allow the user to show all of the current items.
      case 4:

        // Check the inventory to see how many items there are.
        for(int i = 0; i < InventItem.size(); i++) {

          // Display the name, serial number, and value for each item while it is seperated with a comma.
          System.out.print(InventItem.get(i).name + ",");
          
          System.out.print(InventItem.get(i).serialNum + ",");
          
          System.out.println(InventItem.get(i).value);
        }

        // Prevent the menu from repeating over and over.
        break;
    }

    // To quit the program prevent the choice from being equal to the number five.
  }while (choice !=5);

    // Return the option, object, and response.
    return;
    }
  }