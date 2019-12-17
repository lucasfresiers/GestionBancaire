pipeline {
    agent any

    stages {
       
        
        stage('Build') {
            steps {
				 bat "mvn compile"
			            }
        }
         stage('tests') {
            steps {
				 bat "mvn checkstyle:checkstyle"
                 bat "mvn spotbugs:spotbugs"
                 bat "mvn pmd:pmd"
                 bat "mvn pmd:cpd"

			            }
        }
         stage('package') {
            steps {
				 bat "mvn package"
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