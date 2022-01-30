package dev.drf.deep.space.sheep.core

import dev.drf.deep.space.sheep.core.engine.GameLoaderImpl

fun prepareLoader() : GameLoader {
    println("Prepare game loader")
    return GameLoaderImpl()
}

fun loadConfig(loader: GameLoader) : GameConfig {
    println("Loading game configuration")
    return loader.loadConfig()
}

fun loadGameRunner(loader: GameLoader, config: GameConfig) : GameRunner {
    println("Loading game")
    return loader.loadGameRunner(config)
}