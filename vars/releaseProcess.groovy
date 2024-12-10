def call() {
    stage('Version Bump') {
        sh 'bumpversion patch'
    }
    stage('Tag Release') {
        sh 'git tag -a v$(cat version.txt) -m "Release $(cat version.txt)"'
        sh 'git push origin v$(cat version.txt)'
    }
}

