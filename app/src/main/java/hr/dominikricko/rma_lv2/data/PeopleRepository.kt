package hr.dominikricko.rma_lv2.data

import hr.dominikricko.rma_lv2.model.InspiringPerson

object PeopleRepository {
    var people : MutableList<InspiringPerson> = mutableListOf()

    fun addNewPerson(person : InspiringPerson){
        people.add(person)
    }

    fun removePerson(person : InspiringPerson){
        people.remove(person)
    }

    fun getAt(index : Int) : InspiringPerson {
        return people[index]
    }
}