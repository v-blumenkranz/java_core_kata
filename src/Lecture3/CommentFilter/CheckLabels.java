package Lecture3.CommentFilter;

public class CheckLabels {
    public static Label checkLabels(TextAnalyzer[] analyzers, String text){
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                 return (analyzer.processText(text));
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        TextAnalyzer [] checkingAnalyzers = {new NegativeTextAnalyzer(), new SpamAnalyzer(new String[]{"редиска", "нехороший человек"}), new TooLongTextAnalyzer(20)};
        System.out.println(checkLabels(checkingAnalyzers, "редиска"));
        System.out.println(checkLabels(checkingAnalyzers, "Ооооооооочень длииииииинннный тееееееееееееееекст"));
        System.out.println(checkLabels(checkingAnalyzers, ":("));
        System.out.println(checkLabels(checkingAnalyzers, "Все хорошо"));
    }
}
