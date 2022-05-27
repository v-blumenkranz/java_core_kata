package Lecture3.CommentFilter;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    String[] negativeTextExamples = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return negativeTextExamples;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}

