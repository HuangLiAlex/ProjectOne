pipeline {
    agent any
    tools {
        maven: 'Maven'
    }
    stages {
        stage('build') {
            steps {
                echo 'building stage'
                sh 'mvn clean install'
            }
        }
        stage('test') {
            steps {
                echo 'testing stage'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploying stage'
            }
        }
    }
}