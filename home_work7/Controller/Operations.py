from Model.ColorSwitcher import ColorSwitcher
from Model.Loader import Loader
from Model.Picture import Picture
from Model.Serialize.SaveToFile import SaveToFile
from ui.Output import Output


class Operations:
    def __init__(self, settings):
        self.output = None
        self.settings = settings
        self.loader = Loader(settings)
        self.colorSwitcher = ColorSwitcher(self.settings)

    def getColorList(self):
        return self.colorSwitcher.getColors()

    def changeColor(self, color):
        self.colorSwitcher.setColor(color)

    def pictureIsLoaded(self):
        return self.settings.pictureIsLoaded

    def showPicture(self):
        pic = Picture(self.settings)
        self.output = Output(pic)
        self.output.showPicture()

    def loadPictureList(self):
        return self.loader.get_picture_list()

    def choosePicture(self, pic):
        self.loader.set_picture(pic)

    def saveSettings(self):
        SaveToFile.saveData(self.settings.DATA_FILE, self.settings)