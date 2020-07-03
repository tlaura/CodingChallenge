import java.util.*;
import java.util.stream.Collectors;

public class SecondLowestFrequency {
    public int secondLowest(int[] array) {
        Map<Integer, Integer> counterMap = arrayToFrequencyMap(array);

        Set<Integer> values = new HashSet<>(counterMap.values());
        int secondLowestValue = Collections.min(values);
        values.remove(secondLowestValue);
        if (!values.isEmpty()) {
            secondLowestValue = Collections.min(values);
        }

        int filteredValue = secondLowestValue;
        List<Integer> secondLowestKeys = counterMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(filteredValue))
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        Collections.rotate(secondLowestKeys, -1);
        return secondLowestKeys.get(0);
    }

    private static Map<Integer, Integer> arrayToFrequencyMap(int[] array) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int num : array) {
            if (counterMap.containsKey(num)) {
                counterMap.put(num, counterMap.get(num) + 1);
            } else {
                counterMap.put(num, 1);
            }
        }
        return counterMap;
    }
}
