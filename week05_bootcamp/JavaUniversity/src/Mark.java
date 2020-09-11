public class Mark{

    private int markTotal;
    private String comment;

    public Mark(int newMarkTotal, String newComment) throws Exception {
        if (newMarkTotal < 1) {
            throw new Exception("Mark too low");
        }
        if (newMarkTotal > 100) {
            throw new Exception("Mark too high");
        }
        setMarkTotal(newMarkTotal);
        setComment(newComment);
    }

    public Mark(int newMarkTotal) throws Exception {
        if (newMarkTotal < 1) {
            throw new Exception("Mark too low");
        }
        if (newMarkTotal > 100) {
            throw new Exception("Mark too high");
        }
        setMarkTotal(newMarkTotal);
    }

    public int getMarkTotal()
    {
        return markTotal;
    }

    public void setMarkTotal(int newMarks){
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