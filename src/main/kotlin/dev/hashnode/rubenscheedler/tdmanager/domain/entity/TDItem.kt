package dev.hashnode.rubenscheedler.tdmanager.domain.entity

import dev.hashnode.rubenscheedler.tdmanager.domain.Quantity
import dev.hashnode.rubenscheedler.tdmanager.domain.value.Status
import dev.hashnode.rubenscheedler.tdmanager.domain.value.TDItemCode
import dev.hashnode.rubenscheedler.tdmanager.domain.value.id.TDItemID
import java.time.Instant

/**
 * Represents a piece of technical debt. Besides identification, description and reference properties
 * a technical debt has two main properties. The principal and interest costs.
 */
class TDItem(
    /**
     * Unique identifier of this item, used in technical identification. Not meant as human readable.
     */
    val id: TDItemID,
    /**
     * Human-readable identifier for this TDItem.
     */
    val code: TDItemCode,
    /**
     * Brief description of the piece of technical debt.
     */
    var title: String,
    /**
     * Long description of this piece of technical debt.
     */
    var description: String,
    /**
     * The cost of having to resolve this technical debt item.
     */
    var principalCost: Quantity,
    /**
     * List of interest items caused by this TDitem.
     */
    val interest: List<Interest>,
    /**
     * The moment since when this piece of technical debt exists. This does not have to be the same
     * moment as the time it is reported: it can, with hindsight, be placed in the past.
     */
    var existsSince: Instant,
    /**
     * Optional. The moment when this piece of technical debt was resolved.
     */
    var resolvedAt: Instant?,
    /**
     * The product in which this piece of technical occurs.
     */
    var product: Product,
    /**
     * The (workflow-)status of this piece of technical debt.
     */
    var status: Status,
    /**
     * Users that are working on resolving this piece of technical debt.
     */
    var assignees: List<User>,
    /**
     * List of other pieces of technical debt which together caused this piece of technical debt.
     */
    var causedBy: List<TDItemID>,
)

