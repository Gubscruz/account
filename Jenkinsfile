pipeline {
    agent any
    tools {
        maven "MavenJenkins"
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean install'
            }
        }
    }

}