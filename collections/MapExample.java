package collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>(10, 0.5f);
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> map = new TreeMap<>();

        System.out.println(map.put("975568", "Alek"));
        System.out.println(map.put("088879", "Tomek"));
        System.out.println(map.put("356684", "Paweł"));

        System.out.println(map);

        System.out.println(map.get("088879"));
        System.out.println(map.get("08889"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("975568"));
        System.out.println(map.containsKey("Tomek"));
        System.out.println(map.containsValue("Tomek"));
        System.out.println(map.remove("088879"));
        System.out.println(map);
        System.out.println(map.remove("975568", "Alek"));
        System.out.println(map);

        System.out.println(map.put("975568", "Alek"));
        System.out.println(map.put("088879", "Tomek"));
        System.out.println(map.put("088878", "Tomek"));


        final Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":   " + entry.getValue());
        }

        System.out.println();
        final Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println();
        final Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }

        Map<DayOfWeek, String> dayOfWeekActivityMap = new EnumMap<>(DayOfWeek.class);
        dayOfWeekActivityMap.put(DayOfWeek.MONDAY, "Work hard");
        dayOfWeekActivityMap.put(DayOfWeek.TUESDAY, "Work hard");
        dayOfWeekActivityMap.put(DayOfWeek.WEDNESDAY, "Work");
        dayOfWeekActivityMap.put(DayOfWeek.THURSDAY, "Work");
        dayOfWeekActivityMap.put(DayOfWeek.FRIDAY, "Party");
        dayOfWeekActivityMap.put(DayOfWeek.SATURDAY, "Party");
        dayOfWeekActivityMap.put(DayOfWeek.SUNDAY, "Hangover");


        System.out.println("Ordinal: " + DayOfWeek.SATURDAY.ordinal());

        System.out.println(dayOfWeekActivityMap.get(DayOfWeek.FRIDAY));

        System.out.println();

        dayOfWeekActivityMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().isWorkingDay())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        final Iterator<Map.Entry<DayOfWeek, String>> iterator = dayOfWeekActivityMap.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<DayOfWeek, String> next = iterator.next();
            System.out.println(next.getKey());
        }


    }


    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            final String aValue = map.get("a");
            map.put("b", aValue);
            map.put("a", "");
        }
        return map;
    }
}

