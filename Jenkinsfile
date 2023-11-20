node("jenkins-slave-dev") {
    properties([
        parameters([
            string(name: 'CR_ID', description: 'CR ID', trim: true),
            choice(name: 'ACTION', choices: ['CHECK', 'STOP', 'START', 'DEPLOY', 'ROLLBACK'], description: 'Action'),
            choice(name: 'MODULE', choices: ['ALL', 'BO1', 'SFM1', 'T1', 'O1', 'R1', 'O1'], description: 'Module')
        ])
    ])
}
