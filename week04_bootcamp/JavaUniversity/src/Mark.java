public class Mark{

    private int markTotal;
    private String comment;

    public Mark(int newMarkTotal, String newComment)
    {
        setMarkTotal(newMarkTotal);
        setComment(newComment);
    }

    public Mark(int newMarkTotal)
    {
        setMarkTotal(newMarkTotal);
    }

    public int getMarkTotal()
    {
        return markTotal;
    }

    public void setMarkTotal(int newMarks)
    {
        markTotal = newMarks;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String newComment)
    {
        comment = newComment;
    }


}