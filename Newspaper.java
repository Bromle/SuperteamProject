
/**
 * Store details of a newspaper,
 * such as name, date/year, pages, newspaperNumber.
 *
 * @author Geir Kvenseth, Fride frøland, Helene Rasmussen
 * @version (12.02.2018)
 */
public class Newspaper
{
    // instance variables - replace the example below with your own
    private String name;
    private int issueNumber;
    private String date;
    private int numberOfPages;

    /**
     * Constructor for objects of class Newspaper
     * @param name The newspapers name.
     * @param issueNumber The number of the paper.
     * @param dateAndYear Date and year published.
     * @param numberOfPages Number of pages in the newspaper.
     */
    public Newspaper(String name, int issueNumber, 
     String date, int numberOfPages)
    {
        this.name = name;
        this.issueNumber = issueNumber;
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
        this.numberOfPages = 0;
    }

    /**
     * Returns the name.
     * @returns name The name of the paper.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Returns the issueNumber.
     * @returns issueNumber The Newspaper number.
     */
    public int getIssueNumber()
    {
        return this.issueNumber;
    }

    /**
     * Return date.
     * @return date The newspaper date.
     */
    public String getDate()
    {
        return this.date;
    }
    
    /**
     * Return number of pages in the newspaper.
     * @return numberOfPages The number of pages.
     */
    public int getNumberOfPages()
    {
        return this.numberOfPages;
    }
    
    public String getInfoAsString()
    {
        return getName() + getIssueNumber() + getDate() + getNumberOfPages();
    }
    
    /**
     * Sets the name of the paper.
     * @param name The name of the paper.
     */
    private void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Sets the issuenumber.
     * @param issuenumber The issue number.
     */
    private void setIssueNumber(int issueNumber)
    {
        this.issueNumber = issueNumber;
    }
    
    /**
     * Sets the date.
     * @param date The date of the paper.
     */
    private void setDate(String date)
    {
        this.date = date;
    }
    
    /**
     * Sets the number of pages.
     * @param numberOfPages The number of pages.
     */
    private void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }
    
    public String toString()
    {
        String returnString = name;
        returnString += "\nIssuenumber: " + issueNumber;
        returnString += "\nDate: " + date;
        returnString += "\nPages: " + numberOfPages;
        return returnString;
    }
}









