properties([
    parameters([
        choice(
            choiceType: 'ET_ORDERED_LIST',
            choices: ['ONE', 'TWO'], 
            name: 'PARAMETER_01'
        ),
        booleanParam(
            defaultValue: false, 
            description: '', 
            name: 'ALL'
        ),
        booleanParam(
            defaultValue: false, 
            description: '', 
            name: 'BOSS'
        ),
        booleanParam(
            defaultValue: false, 
            description: '', 
            name: 'SFMWEB'
        ),
        booleanParam(
            defaultValue: false, 
            description: '', 
            name: 'TAS'
        ),
        booleanParam(
            defaultValue: false, 
            description: '', 
            name: 'ODE'
        ),
        booleanParam(
            defaultValue: false, 
            description: '', 
            name: 'RES'
        ),
        booleanParam(
            defaultValue: false, 
            description: '', 
            name: 'OMR'
        ),
        text(
            defaultValue: '''
            this is a multi-line 
            string parameter example
            ''', 
             name: 'MULTI-LINE-STRING'
        ),
        string(
            defaultValue: 'scriptcrunch', 
            name: 'STRING-PARAMETER', 
            trim: true
        )
    ])
])
pipeline {
    agent any
    stages {
        stage('Setup parameters') {
            steps {
                script { 
                    if (params.ALL) {
                        echo "ALL: " + params.ALL
                    }
                    echo "BOSS: " + params.BOSS
                    echo "SFMWEB: " + params.SFMWEB
                    echo "OMR: " + params.OMR
                }
            }
        }
    }   
}
