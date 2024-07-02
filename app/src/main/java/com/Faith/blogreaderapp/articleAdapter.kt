package com.Faith.blogreaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class articleAdapter(val articleList: List<Article>):RecyclerView.Adapter<articleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): articleViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.article_item, parent, false)
        return articleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: articleViewHolder, position: Int) {
        val article = articleList[position]
        holder.authorName.text=article.authorName
//        holder.authorProfilePicture.text=article.authorProfilePicture
        holder.title.text=article.title
//        holder.tvlink.text=article.tvlink
        holder.publishDate.text=article.publishDate
        holder.PreviewText.text=article.PreviewText
    }

    override fun getItemCount(): Int {
        return  articleList.size
    }
}


class articleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val authorName:TextView=itemView.findViewById(R.id.tvAuthor)
//    val authorProfilePicture:TextView=itemView.findViewById(R.id.ivAvatar)
    val title: TextView=itemView.findViewById(R.id.tvTitle)
    val publishDate:TextView=itemView.findViewById(R.id.tvDate)
    val PreviewText:TextView=itemView.findViewById(R.id.tvPreview)
//    val tvlink:TextView=itemView.findViewById(R.id.tvLink)

        }