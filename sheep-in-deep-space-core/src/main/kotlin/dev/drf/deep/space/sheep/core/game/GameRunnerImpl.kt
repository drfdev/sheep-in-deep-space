package dev.drf.deep.space.sheep.core.game

import dev.drf.deep.space.sheep.core.GameConfig
import dev.drf.deep.space.sheep.core.GameRunner

class GameRunnerImpl(val config: GameConfig) : GameRunner {
    override fun runGame() {
        println("Run game...")
    }

}