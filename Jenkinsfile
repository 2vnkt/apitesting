pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
               

                // Run Maven on a Unix agent.
                
                bat "mvn clean verify"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                always {
            		// Send email notification
            		emailext subject: "Build Notification",
                     		body: "Build status: ${currentBuild.currentResult}",
                     		to: "vannamaneni@qastile.com",
                     		from: "qastiles@gmail.com"
                  }
            }
        }
    }
}
