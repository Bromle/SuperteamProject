import java.util.ArrayList;
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

    /**
     * Adds a newspaper to the newspaperorganizer.
     * @param newspaper The newspaper to add
     */
    public void addnewspaper(Newspaper newspaper)
    {
        this.listOfNewsPapers.add(newspaper);
    }
    
    /**
     * 
     */
    public void removeNewspaper(int index)
    
    {
        
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
            if (n.getName().equals(name))
            {
                foundNewspaper = n;  
            }

        }
        return foundNewspaper;
    }
}
