node {
    def mvnHome = tool 'M3'
    stage 'checkout'
    git url: 'https://github.com/predic8/simple-jenkins2'
    stage 'building'
    sh "${mvnHome}/bin/mvn compile"
    stage 'unit tests'
    sh "${mvnHome}/bin/mvn test"
    stage 'integration tests'
    sh "${mvnHome}/bin/mvn test"
    stage 'api tests'
    sh "${mvnHome}/bin/mvn test"
    stage 'web tests'
    sh "${mvnHome}/bin/mvn test"
    stage 'acceptance'
    input message: 'Please check the layout approve usabiblity'

    stage 'install'
    sh "${mvnHome}/bin/mvn install"
    echo 'Installedert'
}