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
    private Scanner inputScanner;

    /**
     * Constructor for objects of class NewspaperOrganizer
     */
    public NewspaperOrganizer()
    {
        this.listOfNewsPapers = new ArrayList<Newspaper>();
        inputScanner = new Scanner(System.in);
    }

    /**
     * Lists all the products/literature in the register
     */
    public void listAllNewspapers()
    {
        if(this.listOfNewsPapers.size() > 0){
            for(Newspaper n : this.listOfNewsPapers){
                System.out.println("The newspapers in stock are");
                System.out.println(n.getName());
            }
        }
        else {
            System.out.println("There are no newspaper in stock");
        }
    }

    /**
     * Adds a newspaper to the newspaperorganizer.
     * @param newspaper The newspaper to add
     */
    public void addNewspaper()
    {
        System.out.println("Enter the name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter the date of publishing: ");
        String date = inputScanner.nextLine();

        System.out.print("Enter the number of pages in the newpaper: ");
        int numberOfPages = inputScanner.nextInt();

        System.out.println("Enter the issuenumber: ");
        int issueNumber = inputScanner.nextInt();

        listOfNewsPapers.add(new Newspaper(name, issueNumber, date, numberOfPages));
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
    public void findNewspaperByName()
    {
        System.out.println("Enter the name: ");
        String searchString = inputScanner.nextLine();
        System.out.println();
        int index = 0;
        while (index < this.listOfNewsPapers.size())
        {
            Newspaper n = this.listOfNewsPapers.get(index++);
            if (n.getName().equalsIgnoreCase(searchString))
            {
                System.out.println(n.getName());
            }
        }
    }
}
