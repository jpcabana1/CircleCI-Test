# CircleCI-Test
Test - CircleCI

## Running SonarQube
- ./gradlew composeUp

This will run SonarQube at locahost:9000. The default login is admin/admin, then you will need to set a new password.

## Running a SonarQube scan
Wait for SonarQube to start, then run:
- ./gradlew sonarqube
- ./gradlew sonarqube -PsonarPassword=<admin-password>

## Stopping
- ./gradlew composeDown
