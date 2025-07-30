import org.utils.Hello

def call(String name = "Stranger") {
    def message = Hello.greet(name)
    echo message
}
