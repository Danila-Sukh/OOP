import os


class Loader:
    def __init__(self, settings):
        self.picture_list = self.get_picture_list()
        self.settings = settings

    @staticmethod
    def get_picture_list():
        with os.scandir('pic') as list_of_entries:
            file_list = [entry.name for entry in list_of_entries if entry.is_file()]
        return file_list

    def set_picture(self, picture):
        self.settings.set_current_picture(picture)
