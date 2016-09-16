package liquibase.changelogs.testUser

databaseChangeLog() {
    changeSet(author: "efarina", id: "testUser", context: "dev") {
        sqlFile(path: 'testUser.sql', relativeToChangelogFile:true)
        rollback{
            sqlFile(path: 'testUser-rollback.sql', relativeToChangelogFile:true)
        }
    }
}
