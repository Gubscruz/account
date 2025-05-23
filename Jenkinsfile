pipeline {
    agent any
    tools {
        maven "MavenJenkins"
        jdk "JenkinsJDK"
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean install'
            }
        }
    }

}