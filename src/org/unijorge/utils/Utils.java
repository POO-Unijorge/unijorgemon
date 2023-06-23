package org.unijorge.utils;

import java.util.ArrayList;

public class Utils {


    public static class RetornaTipoPokemon{

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
   
}
