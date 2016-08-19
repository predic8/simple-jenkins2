node {
    def mvnHome = tool 'M3'
    stage 'checkout'
    git url: 'https://github.com/predic8/simple-jenkins2'
    stage 'building'
    sh "${mvnHome}/bin/mvn compile"
    stage 'testing'
    sh "${mvnHome}/bin/mvn test"
    stage 'acceptance'
    input message: 'Please check the layout approve usabiblity', parameters: [choice(choices: [''], description: 'Bitte protokollieren', name: 'Kommentar')]
    stage 'install'
    sh "${mvnHome}/bin/mvn install"
    echo 'Installedert'
}