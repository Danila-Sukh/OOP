class ColorSwitcher:
    COLORS = {
        "BLACK": "\u001B[30m",
        "RED": "\u001B[31m",
        "GREEN": "\u001B[32m",
        "YELLOW": "\u001B[33m",
        "BLUE": "\u001B[34m",
        "CYAN": "\u001B[36m",
        "WHITE": "\u001B[37m",
    }

    def __init__(self, settings):
        self.settings = settings

    def getColors(self):
        return self.COLORS.keys()

    def setColor(self, color):
        if color in self.COLORS:
            self.settings.set_current_color(color)
