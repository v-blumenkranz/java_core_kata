package Lecture3.CommentFilter;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String [] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
        String [] checkedKeywords = getKeywords();
        for (String checkedKeyword : checkedKeywords) {
            if (text.contains(checkedKeyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
