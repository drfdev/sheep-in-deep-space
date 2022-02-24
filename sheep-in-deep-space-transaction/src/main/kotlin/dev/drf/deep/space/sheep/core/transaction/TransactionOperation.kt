package dev.drf.deep.space.sheep.core.transaction

interface TransactionOperation<T> {
    fun action(parameter: T): Boolean
    fun rollback(): Boolean
}