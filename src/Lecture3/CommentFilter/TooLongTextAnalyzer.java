package Lecture3.CommentFilter;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    public TooLongTextAnalyzer(int length) {
        this.maxLength = length;
    }

    public Label getLabel(){
        return Label.TOO_LONG;
    }

    public Label processText(String text) {
        if (text.length() > maxLength) {
            return getLabel();
        } else return Label.OK;
    }
}
