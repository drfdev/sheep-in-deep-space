package dev.drf.deep.space.sheep.core.engine

import dev.drf.deep.space.sheep.core.GameConfig
import dev.drf.deep.space.sheep.core.GameLoader
import dev.drf.deep.space.sheep.core.GameRunner
import dev.drf.deep.space.sheep.core.config.GameConfigImpl
import dev.drf.deep.space.sheep.core.game.GameRunnerImpl

class GameLoaderImpl : GameLoader {
    override fun loadConfig(): GameConfig {
        println("Build configuration...")
        return GameConfigImpl()
    }

    override fun loadGameRunner(config: GameConfig): GameRunner {
        println("Build game...")
        return GameRunnerImpl(config)
    }
}