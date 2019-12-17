pipeline {
    agent any

    stages {
        stage('tests') {
            steps {
                 bat "mvn clean"
				 bat "mvn checkstyle:checkstyle"
                 bat "mvn spotbugs:spotbugs"
                 bat "mvn pmd:pmd"
                 bat "mvn pmd:cpd"

			            }
        }
        
        stage('Build') {
            steps {
				 bat "mvn install"
			            }
        }
        
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true

            }
        }
         
    }
    post {
            always {
                junit '**/surefire-reports/*.xml'
                recordIssues enabledForFailure: true, tools: [mavenConsole(),java(),javaDoc()]
                recordIssues enabledForFailure: true, tool: checkStyle()
                recordIssues enabledForFailure: true, tool: spotBugs()
                recordIssues enabledForFailure: true, tool: cpd(pattern:'**/target/cpd.xml')
                recordIssues enabledForFailure: true, tool: pmdParser(pattern:'**/target/pmd.xml')
            }
        }
}