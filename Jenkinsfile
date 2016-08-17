node {
    stage 'Testing'
    echo 'Hello World 1'
    stage 'Stage 2'
    def mvnHome = tool 'M3'
    sh "${mvnHome}/bin/mvn -B verify"
    echo 'Hello World 2'
}