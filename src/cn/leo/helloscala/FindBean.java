package cn.leo.helloscala;

//import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator.
 * 2015/9/8 22:19
 */
public class FindBean {

    public static List<String> scanClazz(String packageName) {
        List<String> classes = new ArrayList<>();
//        Reflections reflections = new Reflections(packageName);
//        Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
//        allClasses.forEach(e -> classes.add(e.getClass().getName()));
        return classes;
    }

    public static List<String> sameBeans() {
        List<String> javaBeans = scanClazz("java.lang.*");
        System.out.println(javaBeans.size());
        List<String> scalaBeans = scanClazz("scala.*");
        System.out.println(scalaBeans.size());
        List<String> sameBeans = new ArrayList<>();
        javaBeans.forEach(e -> {
            scalaBeans.contains(e);
            sameBeans.add(e);
        });
        return sameBeans;
    }

    public static void main(String[] args) {
        sameBeans().forEach(e -> {
            System.out.print(e);
        });
    }
}
