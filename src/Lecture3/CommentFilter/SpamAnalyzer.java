package Lecture3.CommentFilter;

public class SpamAnalyzer extends KeywordAnalyzer{

    private String[] keywords;

    public SpamAnalyzer(String [] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}
