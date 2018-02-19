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
    public void addNewspaper(Newspaper newspaper)
    {
        this.listOfNewsPapers.add(newspaper);
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
