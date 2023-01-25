from Model.Render import Render


class Picture:
    def __init__(self, settings):
        self.settings = settings
        self.render = Render(settings.getCurrentPicture())
