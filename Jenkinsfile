node {
    def mvnHome = tool 'M3'
    stage 'checkout'
    echo 'Checking out source code'
    git url: 'https://github.com/predic8/simple-jenkins2'
    stage 'compile'
    sh "${mvnHome}/bin/mvn compile"
    stage 'test'
    sh "${mvnHome}/bin/mvn test"
    stage 'deploy to test env'
    echo 'Deploying out source code'
    stage 'acceptance'
    input message: 'Bitte Useability prüfen'
    stage 'install'
    sh "${mvnHome}/bin/mvn install"
}
