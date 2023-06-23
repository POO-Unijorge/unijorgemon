package org.unijorge.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {


    public static class RetornaInterfaces{

        public static ArrayList<Class<?>> getImplementedInterfaces(Class<?> clazz){

        ArrayList<Class<?>> interfaces = new ArrayList<>();

        while (clazz != null) {
            Class<?>[] implementedInterfaces = clazz.getInterfaces();
            for (Class<?> iface : implementedInterfaces) {
                interfaces.add(iface);
            }
            clazz = clazz.getSuperclass();
        }

        return interfaces;
        }
    }

    public static String removerUltimaPalavraAposUltimoPonto(String texto) {
        Pattern pattern = Pattern.compile("(?<=\\.)\\w+(?=\\W*$)");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            return matcher.group();
        }

        return texto;
    }
   
}
