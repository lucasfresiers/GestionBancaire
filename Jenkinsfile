pipeline {
    agent any

    stages {
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
            }
        }
}