pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                sh "mvn clean"
            }
        }

        stage('Compile') {
            steps {
                sh "mvn compile"
            }
        }

        stage('Test') {
            steps {
                sh 'mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package -U -Dmaven.cobertura.skip=true -Dmaven.test.failure.ignore=true'
                sh 'mvn org.jacoco:jacoco-maven-plugin:report'
                junit 'target/surefire-reports/**/*.xml'
            }
        }
    }
}
