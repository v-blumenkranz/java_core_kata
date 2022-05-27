package Lecture2;

public class PrintRemarks {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder output = new StringBuilder();
        for (String role : roles) {
            output.append(role).append(":").append('\n');
            Integer index = 1;
            for (String textLine : textLines) {
                if (textLine.startsWith(role.concat(":"))){
                    textLine = textLine.replaceFirst(role.concat(":"),"");
                    output.append(index.toString()).append(")").append(textLine).append('\n');
                }
                index++;
            }
            output.append('\n');
        }
        output.append('\n');
        return output.toString();
    }










    public static void main(String[] args) {
        System.out.println(printTextPerRole(new String[] {"Городничий", "Александр Александрыч", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Сергей Сергеич"}, new String [] {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор??", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем. Лука: ОК.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"}));
    }
}
