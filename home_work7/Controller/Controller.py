from Controller.Operations import Operations
from Model.Settings import Settings


class ConsoleInterface:
    pass


class Controller:
    def __init__(self):
        self.settings = Settings()
        self.operations = Operations(self.settings)
        self.consoleInterface = ConsoleInterface(self.operations)

    def run(self):
        self.consoleInterface.startMenu()