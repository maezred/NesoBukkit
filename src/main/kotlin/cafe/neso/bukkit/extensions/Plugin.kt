package cafe.neso.bukkit.extensions

import cafe.neso.bukkit.NesoBukkitPlugin.Companion.bukkit

/**
 * Created by moltendorf on 2017-05-09.
 */

inline val plugin get() = bukkit
internal inline val settings get() = plugin.settings
//internal inline val enabled get() = plugin.enabled
//internal inline val database get() = plugin.database
//internal inline val name get() = plugin.provider.name
//internal inline val version get() = plugin.version
