package oop_00000126968_lintangbalakosaardhana.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Dapat loot: ${event.item.name} (${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Di zona aman")
        }
    }
}