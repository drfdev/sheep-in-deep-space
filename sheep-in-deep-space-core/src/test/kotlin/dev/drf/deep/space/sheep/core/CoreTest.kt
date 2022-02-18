package dev.drf.deep.space.sheep.core

import dev.drf.deep.space.sheep.core.model.Sheep
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class CoreTest {
    @Test
    fun shouldCorrectCreateSheet() {
        // arrange - act
        val sheep = assertDoesNotThrow { Sheep() }

        // assert
        assertNotNull(sheep);
    }
}