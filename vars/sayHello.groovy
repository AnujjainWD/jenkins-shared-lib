def call(String name) {
    echo "Original name: ${name}"
    def upper = org.example.utils.StringHelper.toUpper(name)
    echo "Uppercase: ${upper}"
}
