package com.gmail.pavlovsv93.testtask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gmail.pavlovsv93.testtask.databinding.FragmentAccountListBinding

class AccountsListFragment : Fragment() {

	private var _binding: FragmentAccountListBinding? = null
	private val binding get() = _binding!!

	companion object {
		fun newInstance() = AccountsListFragment()
	}

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


	}

}