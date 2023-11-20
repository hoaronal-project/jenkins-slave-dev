def activeChoices = load('getActiveChoices.groovy')

pipeline {
    agent any
    parameters {
        choice(name: 'programmingLanguage', choices: activeChoices, description: 'Choose a programming language')
    }
    stages {
        stage('Build') {
            steps {
                echo "Selected programming language: \${params.programmingLanguage}"
            }
        }
    }
}
