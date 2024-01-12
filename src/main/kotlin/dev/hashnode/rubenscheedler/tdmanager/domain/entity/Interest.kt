package dev.hashnode.rubenscheedler.tdmanager.domain.entity

import dev.hashnode.rubenscheedler.tdmanager.domain.Quantity
import dev.hashnode.rubenscheedler.tdmanager.domain.value.id.InterestID

class Interest(val id: InterestID, val quantity: Quantity, val description : String)
