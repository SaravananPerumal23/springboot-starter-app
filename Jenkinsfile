pipeline {
    agent any
//     triggers {
//         pollSCM '* * * * *'
//     }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Publish') {
            steps {
                sh 'echo "Publishing will Start!!"'
            }
        }
    }
}
