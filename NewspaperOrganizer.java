import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
/**
 * Represents a collections of newspapers.
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (12.02.2018)
 */
public class NewspaperOrganizer
{
    // An Arraylist for storing objects of class Newspaper.
    private ArrayList<Newspaper> listOfNewsPapers;

    /**
     * Constructor for objects of class NewspaperOrganizer
     */
    public NewspaperOrganizer()
    {
        this.listOfNewsPapers = new ArrayList<Newspaper>();
    }
    
    public Iterator<Newspaper> iterator()
    {
        return listOfNewsPapers.iterator();
    }
    
    public int listOfNewspapersSize()
    {
        return this.listOfNewsPapers.size();
    }
    
    /**
     * Adds a newspaper to the newspaperorganizer.
     * @param newspaper The newspaper to add
     */
    public void addNewspaper(String name, int issueNumber, String date,
                                int numberOfPages)
    {
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
}
