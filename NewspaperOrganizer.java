import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Represents a collections of newspapers.
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (12.02.2018)
 */
public class NewspaperOrganizer
{
    // An Arraylist for storing objects of class Newspaper.
    private ArrayList<Newspaper> listOfNewsPapers;
    private String[] menuItems = {
        "1. List all products",
        "2. Add new product",
        "3. Find a product by name",
    };
    
    /**
     * Creates an instance of the ApplicationUI User interface. 
     */
    public NewspaperOrganizer() 
    {
    }
    
    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    public void start() 
    {
        this.init();

        boolean quit = false;

        while (!quit) 
        {
            try 
            {
                int menuSelection = this.showMenu();
                switch (menuSelection) 
                {
                    case 1:
                        this.listAllProducts();
                        break;

                    case 2:
                        this.addNewspaper();
                        break;

                    case 3:
                        this.findNewspaperByName();
                        break;

                    case 4:
                        System.out.println("\nThank you for using Application v0.1. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            } 
            catch (InputMismatchException ime) 
            {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }        
        
    }
    
    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything else, an InputMismatchException is thrown. 
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */
    private int showMenu() throws InputMismatchException 
    {
        System.out.println("\n**** Application v0.1 ****\n");
        // Display the menu
        for ( String menuItem : menuItems )
        {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) 
        {
            throw new InputMismatchException();
        }
        return menuSelection;
    }
    
    /**
     * Constructor for objects of class NewspaperOrganizer
     */
    public NewspaperOrganizer()
    {
        this.listOfNewsPapers = new ArrayList<Newspaper>();
    }
    
    /**
     * Initializes the application.
     * Typically you would create the LiteratureRegistrer-instance here
     */
    private void init()
    {
        System.out.println("init() was called");
    }

    /**
     * Lists all the products/literature in the register
     */
    void listAllProducts()
    {
        System.out.println("listAllProducts() was called");
    }


    /**
     * Adds a newspaper to the newspaperorganizer.
     * @param newspaper The newspaper to add
     */
    public void addNewspaper(Newspaper newspaper)
    {
        System.out.print("");
        
    }
    
    /**
     * Removes a newspaper from the list.
     * @param index Index of the newspaper to remove. Remember 0 is the first paper.
     */
    public void removeNewspaper(int index)
    
    {
        this.listOfNewsPapers.remove(index);
    }
       
    /**
     * Find and return the newspaper with a name matching the parameter name.
     * @param name The name of the newspaper to search for.
     */
    public Newspaper findNewspaperByName(String name)
    {
        Newspaper foundNewspaper = null;
        int index = 0;

        while ((null == foundNewspaper) && (index < this.listOfNewsPapers.size()))
        {
            Newspaper n = this.listOfNewsPapers.get(index++);
            if (n.getName().equalsIgnoreCase(name))
            {
                foundNewspaper = n;  
            }
        }
        return foundNewspaper;
    }
    
    /**
     * adds some newspapers to the newspaper list.
     */
    public void addSomePapers() 
    {
        addNewspaper(new Newspaper("Sunnmørsposten", 1, 1, "01/06/1984,", 30));
        addNewspaper(new Newspaper("Sunnmørsposten", 2, 1, "07/06/1984,", 30));
        addNewspaper(new Newspaper("Sunnmørsposten", 3, 1, "14/06/1984,", 30));
        addNewspaper(new Newspaper("Sunnmørsposten", 4, 1, "21/06/1984,", 30));
        addNewspaper(new Newspaper("Sunnmørsposten", 5, 1, "28/06/1984,", 30));
        addNewspaper(new Newspaper("Fride's avis", 1, 1, "05/01/2004,", 7));
        addNewspaper(new Newspaper("Fride's avis", 2, 3, "23/01/2006,", 3));
        addNewspaper(new Newspaper("Fride's avis", 5, 4, "28/06/2007,", 30));
        addNewspaper(new Newspaper("Fride's avis", 6, 6, "28/06/2009,", 23));
        addNewspaper(new Newspaper("Fride's avis", 10, 111, "28/06/2115,", 1));
    }
}
