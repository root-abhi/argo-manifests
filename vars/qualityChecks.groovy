def call() {
    stage('SonarQube Analysis') {
        sh 'sonar-scanner -Dsonar.projectKey=myProject'
    }
    stage('Run Trufflehog') {
        sh 'trufflehog --repo-path .'
    }
    stage('Aqua Security Scan') {
        sh 'aqua scan'
    }
    stage('Nexus IQ Scan') {
        sh 'nexus-iq-cli -app myApp -server-url http://nexus-iq:8070'
    }
}

