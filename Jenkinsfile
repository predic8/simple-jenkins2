node {
    def mvnHome = tool 'M3'
    stage 'checkout'
    git url: 'https://github.com/predic8/simple-jenkins2'
    stage 'building'
    sh "${mvnHome}/bin/mvn compile"
    stage 'testing'
    sh "${mvnHome}/bin/mvn test"
    stage 'install'
    sh "${mvnHome}/bin/mvn install"
    echo 'Installed'
}