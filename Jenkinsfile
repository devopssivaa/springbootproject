pipeline {
    agent any
    tools {
               maven "MAVEN"
    }
    stages {
        stage('Code-Checkout') {
            steps {
                git 'https://github.com/jglick/simple-maven-project-with-tests.git'
                }
        }
    }
}
