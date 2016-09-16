package liquibase

databaseChangeLog() {
    include(file:'changelogs/baseline.groovy', relativeToChangelogFile:true)
    include(file:'changelogs/testUser/testUser.groovy', relativeToChangelogFile:true)
}
