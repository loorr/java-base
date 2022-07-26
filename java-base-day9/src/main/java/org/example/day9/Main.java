package org.example.day9;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String className = args[i];
            try {
                Class<?> clazz =  Class.forName(className);
                Action obj = (Action) clazz.newInstance();
                obj.solution();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
