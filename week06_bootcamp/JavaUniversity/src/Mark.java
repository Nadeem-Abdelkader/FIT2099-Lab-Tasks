/**
 * This class is instantiated for every student that is enrolled and it is unit specific
 */
public class Mark{

    private int markTotal;
    private String comment;

    /**
     * constructor for Mark class
     * @param newMarkTotal - new Mark
     * @param newComment - comment on the new mark
     * @throws Exception - if newMarkTotal is greater than 100 or less than 1
     */
    public Mark(int newMarkTotal, String newComment) throws Exception {
        setMarkTotal(newMarkTotal);
        setComment(newComment);
    }

    /**
     * constructor for Mark class
     * @param newMarkTotal - new Mark
     * @throws Exception - if newMarkTotal is greater than 100 or less than 1
     */
    public Mark(int newMarkTotal) throws Exception {
        setMarkTotal(newMarkTotal);
    }

    /**
     * getter function for markTotal
     * @return markTotal
     */
    public int getMarkTotal()
    {
        return markTotal;
    }

    /**
     * setter function for markTotal
     * @param newMarks
     * @throws Exception - if newMarks is greater than 100 or less than 1
     */
    public void setMarkTotal(int newMarks) throws Exception {
        if (newMarks < 1) {
            throw new Exception("Mark too low");
        }
        if (newMarks > 100) {
            throw new Exception("Mark too high");
        }
        markTotal = newMarks;
    }

    /**
     * getter function for comment
     * @return comment
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * setter function for comment
     * @param newComment
     */
    public void setComment(String newComment)
    {
        comment = newComment;
    }


}