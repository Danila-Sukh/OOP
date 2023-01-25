from Model.Serialize.LoadFromFile import LoadFromFile


class Settings:
    DATA_FILE = "settings.dat"

    def __init__(self):
        self.data = LoadFromFile.loadData(self.DATA_FILE)
        if self.data is not None:
            self.currentColor = self.data.currentColor
            self.currentPicture = self.data.currentPicture
            self.pictureIsLoaded = True
        else:
            self.pictureIsLoaded = False

    def set_current_picture(self, current_picture):
        self.currentPicture = current_picture
        self.pictureIsLoaded = True

    def set_current_color(self, current_color):
        self.currentColor = current_color
