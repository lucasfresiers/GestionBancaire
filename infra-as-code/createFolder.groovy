String name = "GestionBancaire"
folder(name) {
    description 'Voici le dossier contenant tous les jobs du projet Gestion bancaire'
}
listView(name) {
columns {
buildButton()
disableProject(boolean icon = false)
lastBuildConsole()
lastDuration()
lastFailure()
lastSuccess()
name()
progressBar()
releaseButton()
status()
}
}
