public class Mark{

    private int markTotal;
    private String comment;

    public Mark(int newMarkTotal, String newComment)
    {
        setComment(newComment);
        try {
            setMarkTotal(newMarkTotal);
        } catch (Exception e) {
            e.getMessage();
            //e.printStackTrace();
            return;
        }
    }

    public Mark(int newMarkTotal)
    {
        try {
            setMarkTotal(newMarkTotal);
        } catch (Exception e) {
            e.getMessage();
            //e.printStackTrace();
            return;
        }
    }

    public int getMarkTotal()
    {
        return markTotal;
    }

    public void setMarkTotal(int newMarks) throws Exception {
        if (newMarks < 1) {
            throw new Exception("Mark too low");
        }

        if (newMarks > 100) {
            throw new Exception("Mark too high");
        }
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