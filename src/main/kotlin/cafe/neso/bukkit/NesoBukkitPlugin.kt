package cafe.neso.bukkit

import cafe.neso.core.settings.SettingsInterface
import org.bukkit.plugin.java.JavaPlugin
import shadow.kotlin.reflect.KClass

/**
 * Created by moltendorf on 2017-05-09.
 */

class NesoBukkitPlugin(val settings: KClass<SettingsInterface>): JavaPlugin() {
  override fun onEnable() {
    bukkit = this
  }

  companion object {
    lateinit var bukkit: NesoBukkitPlugin
  }
}


