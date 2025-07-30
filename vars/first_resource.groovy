import org.utils.Hello

def call(String name = "Stranger") {
    def message = Hello.greet(name)
    
    def currentTime = new Date().format("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone('IST'))
    def jobName = env.JOB_NAME

    echo "${message}"
    echo " Executed at: ${currentTime}"
    echo " Jenkins Job: ${jobName}"
}
