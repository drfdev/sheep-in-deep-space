package dev.drf.deep.space.sheep.core.model.money

import java.util.concurrent.atomic.AtomicLong

class Wallet {
    private val money: Map<Currency, AtomicLong> = mapOf(
        Currency.DOT to AtomicLong(0L)
    )

    fun addMoney(currency: Currency, count: Long) {
        money[currency]?.addAndGet(count)
    }

    fun getMoney(currency: Currency): Long? {
        return money[currency]?.get()
    }

    fun checkCurrencyExists(currency: Currency): Boolean {
        return money[currency] != null
    }
}