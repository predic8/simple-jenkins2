node {
    def mvnHome = tool 'M3'
    stage 'checkout'
    git url: 'https://github.com/predic8/simple-jenkins2'
    stage 'compile'
    sh "${mvnHome}/bin/mvn compile"
}
