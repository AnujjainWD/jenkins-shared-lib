package org.example.utils

class StringHelper {
    static String capitalizeWords(String input) {
        input.split(' ').collect { it.capitalize() }.join(' ')
    }
}
