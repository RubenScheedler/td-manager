package dev.hashnode.rubenscheedler.tdmanager.domain.entity

import dev.hashnode.rubenscheedler.tdmanager.domain.value.id.ProductID

class Product(val id : ProductID, var title : String, var description : String, val tdItems : List<TDItem>) {
}
