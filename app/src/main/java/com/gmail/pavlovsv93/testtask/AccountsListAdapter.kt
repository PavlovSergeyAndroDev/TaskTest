package com.gmail.pavlovsv93.testtask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.gmail.pavlovsv93.testtask.databinding.FragmentAccountListRvItemBinding
import com.gmail.pavlovsv93.testtask.entities.AccountEntity
import com.squareup.picasso.Picasso

class AccountsListAdapter(val onClickAccount: AccountsListFragment.OnClickAccount) : RecyclerView.Adapter<AccountsListAdapter.AccountListViewHolder>() {
	private val listAccounts: MutableList<AccountEntity> = mutableListOf()

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountListViewHolder =
		AccountListViewHolder(
			LayoutInflater.from(parent.context)
				.inflate(R.layout.fragment_account_list_rv_item, parent, false) as View
		)

	override fun onBindViewHolder(holder: AccountListViewHolder, position: Int) {
		holder.bind(listAccounts[position])
	}

	override fun getItemCount(): Int = listAccounts.size
	inner class AccountListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		fun bind(account: AccountEntity) {
			FragmentAccountListRvItemBinding.bind(itemView).apply {
				Picasso.with(itemView.context)
					.load(account.avatar)
					.centerCrop()
					.placeholder(R.drawable.ic_baseline_person_24)
					.into(ivAvatar)
				mtvName.text = account.name
				mtvDescription.text = account.description
				cvItemAccountsList.setOnClickListener {
					onClickAccount.onClickAccount(account)
				}
			}
		}
	}
}