package com.gmail.pavlovsv93.testtask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.gmail.pavlovsv93.testtask.databinding.FragmentAccountListBinding
import com.gmail.pavlovsv93.testtask.entities.AccountEntity

class AccountsListFragment : Fragment() {

	private var _binding: FragmentAccountListBinding? = null
	private val binding get() = _binding!!

	interface OnClickAccount {
		fun onClickAccount(account: AccountEntity)
	}

	companion object {
		fun newInstance() = AccountsListFragment()
	}

	private val adapterAccountsList: AccountsListAdapter =
		AccountsListAdapter(object : OnClickAccount {
			override fun onClickAccount(account: AccountEntity) {
				TODO("Not yet implemented")
			}
		})

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		_binding = FragmentAccountListBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val recyclerView = binding.rvAccountList
		recyclerView.layoutManager =
			LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
		recyclerView.adapter = adapterAccountsList

	}

}