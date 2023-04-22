package ca.evilterabite.jeremycoin

import ca.evilterabite.jeremycoin.gui.GUIHandler
import org.bukkit.plugin.java.JavaPlugin

class JeremyCoin : JavaPlugin() {

    override fun onEnable() {
        instance = this
        guiHandler = GUIHandler()
    }

    override fun onDisable() {

    }

    companion object {
        lateinit var instance: JeremyCoin
            private set
        lateinit var guiHandler: GUIHandler
            private set
    }
}