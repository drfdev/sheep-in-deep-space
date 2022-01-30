package dev.drf.deep.space.sheep.core

interface GameLoader {
    fun loadConfig() : GameConfig

    fun loadGameRunner(config : GameConfig) : GameRunner
}