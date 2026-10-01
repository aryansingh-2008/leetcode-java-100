class Solution {
    public int romanToInt(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            int currentValue = 0;
            int nextValue = 0;

            // Current character ki value
            if (current == 'I') {
                currentValue = 1;
            } else if (current == 'V') {
                currentValue = 5;
            } else if (current == 'X') {
                currentValue = 10;
            } else if (current == 'L') {
                currentValue = 50;
            } else if (current == 'C') {
                currentValue = 100;
            } else if (current == 'D') {
                currentValue = 500;
            } else if (current == 'M') {
                currentValue = 1000;
            }

            // Next character ki value
            if (i < s.length() - 1) {

                char next = s.charAt(i + 1);

                if (next == 'I') {
                    nextValue = 1;
                } else if (next == 'V') {
                    nextValue = 5;
                } else if (next == 'X') {
                    nextValue = 10;
                } else if (next == 'L') {
                    nextValue = 50;
                } else if (next == 'C') {
                    nextValue = 100;
                } else if (next == 'D') {
                    nextValue = 500;
                } else if (next == 'M') {
                    nextValue = 1000;
                }
            }

            // Main Roman numeral rule
            if (currentValue < nextValue) {
                result = result - currentValue;
            } else {
                result = result + currentValue;
            }
        }

        return result;
    }
}

//LEET CODE UPLOADED CODE
/*class Solution {
    public int romanToInt(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentValue = 0;

            if (s.charAt(i) == 'I') {
                currentValue = 1;
            } else if (s.charAt(i) == 'V') {
                currentValue = 5;
            } else if (s.charAt(i) == 'X') {
                currentValue = 10;
            } else if (s.charAt(i) == 'L') {
                currentValue = 50;
            } else if (s.charAt(i) == 'C') {
                currentValue = 100;
            } else if (s.charAt(i) == 'D') {
                currentValue = 500;
            } else if (s.charAt(i) == 'M') {
                currentValue = 1000;
            }

            if (i < s.length() - 1) {

                int nextValue = 0;

                if (s.charAt(i + 1) == 'I') {
                    nextValue = 1;
                } else if (s.charAt(i + 1) == 'V') {
                    nextValue = 5;
                } else if (s.charAt(i + 1) == 'X') {
                    nextValue = 10;
                } else if (s.charAt(i + 1) == 'L') {
                    nextValue = 50;
                } else if (s.charAt(i + 1) == 'C') {
                    nextValue = 100;
                } else if (s.charAt(i + 1) == 'D') {
                    nextValue = 500;
                } else if (s.charAt(i + 1) == 'M') {
                    nextValue = 1000;
                }

                if (currentValue < nextValue) {
                    result = result - currentValue;
                } else {
                    result = result + currentValue;
                }

            } else {
                result = result + currentValue;
            }
        }

        return result;
    }
} */