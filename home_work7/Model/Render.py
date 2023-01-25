class Render:
    ANSI_RESET = '[0m'

    def __init__(self, data_file):
        self.data_file = data_file

    def load_picture(self):
        file_name = 'pic/' + self.data_file
        with open(file_name, 'r') as file:
            content = file.read()
        return content

    def set_color(self, data, color):
        return color + data + self.ANSI_RESET
