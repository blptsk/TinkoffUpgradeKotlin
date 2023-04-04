package intensive_2.lambdas

class ButtonCounter {
    var clicks = 0

    fun tryToCountButtonClicks(button: Button): Int {
        button.onClick { clicks++ }
        return clicks
    }
}

class Button{
    fun onClick(lambda : () -> Unit) {}
}

