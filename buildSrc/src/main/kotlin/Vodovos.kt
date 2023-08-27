object Vodovos {
    const val appName = "Vodovos"
    const val dimension = "Vodovos"

    object Stage {
        private const val suffix = "stage"
        const val versionNameSuffix = "-$suffix"
        const val applicationIdSuffix = ".$suffix"
        const val resName = "${appName}-$suffix"
        const val vodovosBackend = "\"http://szorinvodovoz.tw1.ru/\""
    }

    object Production {
        private const val suffix = "production"
        const val versionNameSuffix = "-$suffix"
        const val applicationIdSuffix = ".$suffix"
        const val resName = "${appName}"
        const val vodovosBackend = "\"http://szorinvodovoz.tw1.ru/\""
    }
}