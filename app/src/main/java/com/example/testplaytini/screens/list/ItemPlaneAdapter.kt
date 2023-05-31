package com.example.testplaytini.screens.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testplaytini.databinding.ItemListMainBinding
import com.example.testplaytini.entity.PlaneItem
import com.example.testplaytini.entity.createPLaneList
import com.example.testplaytini.utils.setImage

class ItemPlaneAdapter : RecyclerView.Adapter<ItemPlaneAdapter.VH>() {

    private val listItem = createPLaneList()

    var callbackOnItemClick: ((PlaneItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemListMainBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = listItem.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        val plane = listItem[position]
        holder.feelItem(plane)
        holder.binding.root.setOnClickListener { callbackOnItemClick?.invoke(plane) }
    }

    class VH(val binding: ItemListMainBinding) : RecyclerView.ViewHolder(binding.root) {
        fun feelItem(planeItem: PlaneItem) {
            with(binding) {
                ivImage.setImage(planeItem.image)
                tvMainTitle.text = planeItem.title
                tvYear.text = planeItem.year.toString()
            }
        }
    }
}