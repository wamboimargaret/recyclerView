package megan.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class NamesRvAdapter(private val numbs:List<Int>): Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.names_list_item,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val currentName =numbs.get(position)
        holder.tvname.text=currentName
    }

}
class NamesViewHolder(itemView: View):ViewHolder(itemView){
    var tvname = itemView.findViewById<TextView>(R.id.tvNames)
}