# Sample Java App to demonstrate connecting with Azure SQL using Azure Managed Identity

This is implemented by following the instructions in the following 
[Microsoft documentation](https://learn.microsoft.com/en-us/sql/connect/jdbc/connecting-using-azure-active-directory-authentication?view=sql-server-ver16
).

## Running the sample
- Setting up the Azure SQL Database
- Close the repository
- Update the Main.java with relevant details
- Build using maven (`mvn clean install`)
- Run the jar file (`java -jar target/azure-managed-identity-sample-java-app-1.0-jar-with-dependencies.jar`)

## Preparing dependencies for WSO2 Identity Server
- Close the repository
- Execute the command: `mvn dependency:copy-dependencies`
- Copy all the files found in `target\dependencies` directory to `<IS_HOME>\repository\components\lib` directory.
