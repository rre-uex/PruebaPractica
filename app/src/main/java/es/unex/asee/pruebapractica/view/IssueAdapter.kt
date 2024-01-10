package es.unex.asee.pruebapractica.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.unex.asee.pruebapractica.data.model.Issue
import es.unex.asee.pruebapractica.databinding.IssueBinding

class IssueAdapter(private var issues: List<Issue>,
                   private val onItemClick: (issue: Issue) -> Unit,
                   private val context: Context?) : RecyclerView.Adapter<IssueAdapter.IssueViewHolder>() {


    class IssueViewHolder(
        private val binding: IssueBinding,
        private val onClick: (issue: Issue) -> Unit,

        private val context: Context?
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Issue, totalItems: Int) {
            with(binding) {
                numbertv.text = product.number.toString()
                createdtv.text = product.created?.take(10)
                clItem.setOnClickListener {
                    onClick(product)
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IssueViewHolder {
        val binding =
            IssueBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IssueViewHolder(binding, onItemClick, parent.context)
    }

    override fun getItemCount() = issues.size

    override fun onBindViewHolder(holder: IssueViewHolder, position: Int) {
        holder.bind(issues[position], issues.size)
    }

    fun updateData(shows: List<Issue>) {
        this.issues = shows
        notifyDataSetChanged()
    }
}