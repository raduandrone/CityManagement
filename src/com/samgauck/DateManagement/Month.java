package com.samgauck.DateManagement;

/**
 * A three-letter enum representation of a month.
 */
public enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

    @Override
    public String toString() {
        return super.toString().substring(0, 1).toUpperCase() + super.toString().substring(1).toLowerCase();
    }
}
