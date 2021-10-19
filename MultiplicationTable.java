package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if (isValid(start, end)) {
            return generateTable(start, end);
        } else {
            return null;
        }
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && 1000 >= number;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (i <= end - 1) {
                table.append(generateLine(start, i));
                table.append("\n");
            } else {
                table.append(generateLine(start, i));
            }
        }
        return table.toString();
    }

    public String generateLine(int start, int row) {
        StringBuilder line = new StringBuilder();
        for (int i = start; i <= row; i++) {
            line.append(generateSingleExpression(i, row)).append("  ");
        }
        return line.toString().trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand * multiplier;
    }
}
