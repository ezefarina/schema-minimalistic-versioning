# Schema Minimalistic Versioning

This project is meant to be a good start point for a database versioning in an atomic way, by producing a versioned artifact with incremental changes.

### Handling multiple environments

**db.properties** is the place to define connection parameters and some liquibase configs

This properties file is looked up in the following places, being the last location found the one that overrides the previous ones. More locations could be added if needed but having just two levels is more than enough to handle multiple environments

* **classpath**: This will always be found as it's packed in the jar/war or whatever the package method is. It will contain the default values
* **$HOME**: This would be considered optional, and it may contain environment specific properties such as the DB connection url, production profile, etc.
* **propertiesLocation sys var**: If properties location is specified, gradle will read that file in order to override default values. i.e.: **gradle update -DpropertiesLocation=/opt/schema/db.properties**

Consider changing the **liquibase.contexts** property in db.properties for the different environments

### Database & Liquibase handling

* **Gradle Plugin**: You can run the liquibase plugin tasks through gradle. Run **gradle tasks** for further reference on each task

i.e.: **gradle update** will run the update task from the plugin, which will run pending changelogs.
