import pickle


class LoadFromFile:
    @staticmethod
    def loadData(file_name):
        with open(file_name, 'rb') as f:
            try:
                data = pickle.load(f)
                return data
            except pickle.UnpicklingError:
                return None
