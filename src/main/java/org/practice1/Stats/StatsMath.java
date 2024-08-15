package org.practice1.Stats;

public class StatsMath {
    private String operator;
    private String line;
    private String column;
    private String occurrence;

    public StatsMath(String operator, String line, String column, String occurrence) {
        this.operator = operator;
        this.line = line;
        this.column = column;
        this.occurrence = occurrence;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(String occurrence) {
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "StatsMath{" +
                "operator='" + operator + '\'' +
                ", line='" + line + '\'' +
                ", column='" + column + '\'' +
                ", occurrence='" + occurrence + '\'' +
                '}';
    }
}
