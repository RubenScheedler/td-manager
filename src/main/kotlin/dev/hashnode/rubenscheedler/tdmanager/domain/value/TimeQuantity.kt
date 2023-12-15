package dev.hashnode.rubenscheedler.tdmanager.domain.value

import dev.hashnode.rubenscheedler.tdmanager.domain.Quantity

/**
 * Describes an amount of time expressed in hours and minutes.
 */
data class TimeQuantity(val hours : Int, val minutes : Int) : Quantity
