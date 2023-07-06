package com.belpan.lam.ui.TestFragment.placeholder

import java.util.ArrayList
import java.util.HashMap

/**
 * A placeholder item representing a piece of content.
 */
data class PlaceholderItem(val name: String, val surname: String) {
    override fun toString(): String = "${name} ${surname}"
}