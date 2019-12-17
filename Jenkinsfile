pipeline {
    agent any

    stages {
        stage('checkstyle') {
            steps {
				 bat "mvn checkstyle:checkstyle"
			            }
        }
        
        stage('Build') {
            steps {
				 bat "mvn clean install"
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
                recordIssues enabledForFailure: true, tools: checkstyle()
                recordIssues enabledForFailure: true, tools: spotBugs()
                recordIssues enabledForFailure: true, tools: cpd(pattern:'**/target/cpd.xml')
                recordIssues enabledForFailure: true, tools: pmdParser(pattern:'**/target/pmd.xml')
            }
        }
}