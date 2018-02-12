
/**
 * Store details of a newspaper,
 * such as name, date/year, pages, newspaperNumber, vintage
 *
 * @author (Geir Kvenseth)
 * @version (a version number or a date)
 */
public class Newspaper
{
    // instance variables - replace the example below with your own
    private String name;
    private int issueNumber;
    private int vintage;
    private String date;
    private int numberOfPages;

    /**
     * Constructor for objects of class Newspaper
     * @param name The newspapers name.
     * @param issueNumber The number of the paper.
     * @param vintage Total year number since first published.
     * @param dateAndYear Date and year published.
     * @param numberOfPages Number of pages in the newspaper.
     */
    public Newspaper(String name, int issueNumber, 
                        int vintage, String date, int numberOfPages)
    {
        this.name = name;
        this.issueNumber = issueNumber;
        this.vintage = vintage;
        this.date = date;
        this.numberOfPages = numberOfPages;
    }

    /**
     * Constructor for objects of class Newspaper
     * @param name The newspapers name.
     * @param issueNumber The number of the paper.
     * @param dateAndYear Date and year published.
     */
        public Newspaper(String name, int issueNumber, 
                        String date)
    {
        this.name = name;
        this.issueNumber = issueNumber;
        this.date = date;
    }
    
     /**
     * Sets all information about the newspaper.
     * @param name The newspapers name.
     * @param issueNumber The number of the paper.
     * @param vintage Total year number since first published.
     * @param dateAndYear Date and year published.
     * @param numberOfPages Number of pages in the newspaper.
     */
    private void setAllParam(String name, int issueNumber, 
                        int vintage, String date, int numberOfPages)
    {
        this.name = name;
        this.issueNumber = issueNumber;
        this.vintage = vintage;
        this.date = date;
        this.numberOfPages = numberOfPages;
    }
        
    /**
     * Return name
     * @return the name of the paper
     */
    private String getname()
    {
        return this.name;
    }
}
