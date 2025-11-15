def call () {
    sh 'echo MAVEN test from Shared Pipeline Library'
}

def call1 () {
    sh 'df -hl'
    sh 'uname -a'
}