package cafe.neso.bukkit

import cafe.neso.core.Neso
import cafe.neso.core.logging.NesoLogger
import cafe.neso.core.settings.SettingsInterface
import org.bukkit.plugin.java.JavaPlugin

class NesoBukkitCore: Neso {
  override fun getLogger(): NesoLogger {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onLoad() {

  }

  override fun onEnable() {
    super.onEnable()
  }

  override fun onDisable() {
    super.onDisable()
  }

  companion object {
    operator fun invoke(settings: SettingsInterface): NesoBukkitCore {
      return NesoBukkitCore()
    }
  }
}
