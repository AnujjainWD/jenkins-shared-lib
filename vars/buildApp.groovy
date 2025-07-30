def call(String project) {
    echo "[BUILD] Building ${project}"
    sh "echo Compiling ${project}..."
}
