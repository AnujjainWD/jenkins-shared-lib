def call(String message, String color = 'good') {
    slackSend(
        color: color,
        message: "${env.JOB_NAME} - #${env.BUILD_NUMBER} - ${message}"
    )
}
