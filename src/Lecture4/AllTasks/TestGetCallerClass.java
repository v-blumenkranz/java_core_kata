package Lecture4.AllTasks;

public class TestGetCallerClass {
    public static void main(String[] args) {
        //System.out.println(getCallerClassAndMethodName());
        //anotherMethod();
        printMethodsInTheStackTrace();

    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void oneMoreMethod() {
          System.out.println(getCallerClassAndMethodName());
    }


    private static void anotherNewMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void someAnotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void someAnotherNewMethod() {
        System.out.println(getCallerClassAndMethodName());
    }


    public static String getCallerClassAndMethodName() {
        StackTraceElement [] stackTraceElements = new Throwable().getStackTrace();
        return (stackTraceElements.length <= 2) ?  null : stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
    }

    public static void printMethodsInTheStackTrace() {
        StackTraceElement [] stackTraceElements = new Throwable().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.println(stackTraceElement.getMethodName());
        }
        for (int i = 0; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i]);
        }
    }
}