/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

public class ManageAccess {
    private AccessLog[] completeLog;

    public ManageAccess(String[] logFile) throws IllegalArgumentException {
        completeLog = new AccessLog[logFile.length];
        for (int i = 0; i < logFile.length; i++) {
            var logLine = new AccessLog(logFile[i]);
            completeLog[i] = logLine;
        }
    }

    public AccessLog getLogLine(int i) throws IllegalArgumentException {
        if (i >= 0 && i < 10) {
            return completeLog[i];
        }
        throw new IllegalArgumentException("Array only holds 0-9");
    }
}


