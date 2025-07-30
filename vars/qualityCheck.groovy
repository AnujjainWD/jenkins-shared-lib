def call() {
    echo "Running static code analysis..."
    sh './gradlew check' // or mvn verify, etc
}

