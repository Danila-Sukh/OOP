import pickle


class SaveToFile:

    @staticmethod
    def saveData(file, settings):
        with open(file, 'wb') as f:
            try:
                pickle.dump(settings, f)
                return True
            except pickle.PickleError:
                return False
