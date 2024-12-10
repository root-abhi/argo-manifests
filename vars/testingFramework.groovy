def call() {
    stage('Integration Tests') {
        sh './gradlew integrationTest'
    }
    stage('End-to-End Tests') {
        sh './gradlew e2eTest'
    }
}

