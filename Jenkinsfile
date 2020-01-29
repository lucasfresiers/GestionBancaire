pipeline {
    agent any

    stages {
       
        
        stage('Build') {
            steps {
				 sh "mvn compile"
			            }
        }
         stage('tests') {
            steps {
				 sh "mvn checkstyle:checkstyle"
                 sh "mvn spotbugs:spotbugs"
                 sh "mvn pmd:pmd"
                 sh "mvn pmd:cpd"

			            }
        }
         stage('package') {
            steps {
				 sh "mvn deploy"
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
