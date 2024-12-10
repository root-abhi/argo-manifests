def call(Map config) {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    echo 'Running Build Stage'
                    sh 'gradle build'
                }
            }
            stage('Quality Checks') {
                steps {
                    qualityChecks()
                }
            }
            stage('Release Process') {
                steps {
                    releaseProcess()
                }
            }
            stage('Testing Framework') {
                steps {
                    testingFramework()
                }
            }
        }
    }
}

