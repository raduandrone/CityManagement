package com.samgauck.CityManagement;

/**
 * A enum that represents a job (profession).
 */
public enum Profession {
    FARMER, BLACKSMITH, JOBLESS;

    /**
     * Returns the job as a string, capitalized (e.g. Jobless).
     *
     * @return A correctly capitalized string representation of a job.
     */
    @Override
    public String toString() {
        return Utilities.capitailze(super.toString());
    }
}