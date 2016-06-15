#JSON Data Streamer

This application reads in json content from the files, logs_xx.json under /logs folder and transform the logs into a formatted output where it displays all log counts for each unique email address.

## Environment
1. Java Eclipse Project
2. Build Path: gson-2.6.2.jar

## To Dos
- File paths need to be fixed to point logs_xx.son files from DataStreamDriver.java

## Improving steps
1. As for improving the code with OOP principles, LogMessage interface could have been created, and a tally class and globalTally class could use inheritance from the LogMessage.
2. Logging API could have been implemented to create log messages
