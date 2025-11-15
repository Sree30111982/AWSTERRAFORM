def call () {
    sh 'echo MAVEN test from Shared Pipeline is working fine'
    sh 'df -hl'
    sh 'uname -a'
}