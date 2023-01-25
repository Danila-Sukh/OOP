class ConsoleInterface:
    def __init__(self, operations):
        self.operations = operations

    def startMenu(self):
        run = True
        options = {
            1: self.showPicture,
            2: self.choosePicture,
            3: self.choosePictureColor,
            4: self.saveData,
        }
        while run:
            print("1. Вывести изображение на экран")
            print("2. Выбрать изображение")
            print("3. Выбрать цвет изображения")
            print("4. Выйти.")
            run = options.get(int(input()))()

    def saveData(self):
        self.operations.saveSettings()
        return False

    def choosePictureColor(self):
        i = 1
        for key in self.operations.getColorList():
            print("{}. {}".format(i, key))
            i += 1
        self.operations.changeColor(self.operations.getColorList()[int(input()) - 1])
        return True

    def choosePicture(self):
        i = 1
        for pic in self.operations.loadPictureList():
            print("{}. {}".format(i, pic))
            i += 1
        self.operations.changeColor(self.operations.loadPictureList()[int(input()) - 1])
        return True

    def showPicture(self):
        if self.operations.pictureIsLoaded():
            self.operations.showPicture()
        else:
            print("Необходимо выбрать картинку")
        return True
