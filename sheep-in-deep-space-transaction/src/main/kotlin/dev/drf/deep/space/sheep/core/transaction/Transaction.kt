package dev.drf.deep.space.sheep.core.transaction

interface Transaction<in T : TransactionOperation> {
    fun action(operation: T): Boolean
    fun rollback(): Boolean
}