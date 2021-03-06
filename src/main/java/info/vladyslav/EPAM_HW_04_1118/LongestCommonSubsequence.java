package info.vladyslav.EPAM_HW_04_1118;

/**
 * Task 1
 * Given two strings str1 and str2, return their longest common subsequence.
 * "ace" is a subsequence of "acer" while "bfg" is not). A common subsequence of two strings is
 * a subsequence that is common to both strings.
 * If there is no common subsequence, return “”
 * Program should covered with unit test.
 */


public class LongestCommonSubsequence {

    String substring(String str1, String str2) {
        String longString, shortString, targetSubsequence = "", temporarySubsequence;
        if (str1.equals(str2)) {
            return str1;
        }

        if (str1.length() > str2.length()) {
            longString = str1;
            shortString = str2;
        } else {
            longString = str2;
            shortString = str1;
        }

        for (int i = 0; i <= shortString.length() - 1; i++) {
            for (int j = i + 2; j <= shortString.length(); j++) {
                if (longString.contains(shortString.substring(i, j))) {
                    temporarySubsequence = shortString.substring(i, j);
                    if (temporarySubsequence.length() > targetSubsequence.length()) {
                        targetSubsequence = temporarySubsequence;
                    }
                }
            }
        }
        if (targetSubsequence.length() == 0) {
            return "";
        }
        return targetSubsequence;
    }
}


