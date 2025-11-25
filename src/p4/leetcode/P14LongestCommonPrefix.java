package p4.leetcode;

public class P14LongestCommonPrefix {

    String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // while (strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    private String mySolution(String[] strs) {
        String firstStr = strs[0];
        String secondStr = strs[1];
        StringBuilder commonPrefix = new StringBuilder();

        if (firstStr.charAt(0) != secondStr.charAt(0)) {
            return "";
        }

        int iteration = 0;
        for (int i = 0; i <= secondStr.length() - 1; i++) {
            if (i != iteration) {
                break;
            }

            if (firstStr.charAt(i) == secondStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
                iteration++;
                continue;
            }
        }

        for (int i = 1; i < strs.length - 1; i++) {
            for (int j = 0; j < commonPrefix.length() - 1; j++) {
                if (strs[i].charAt(j) == commonPrefix.charAt(j)) {
                    continue;
                }
                return "";
            }
        }

        return commonPrefix.toString();
    }
}
