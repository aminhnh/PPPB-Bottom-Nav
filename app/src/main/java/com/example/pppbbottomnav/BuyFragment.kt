package com.example.pppbbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.pppbbottomnav.databinding.FragmentBuyBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BuyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BuyFragment : Fragment() {
    private var _binding : FragmentBuyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBuyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            val adapterClass = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.ticket_class_array,
                androidx.transition.R.layout.support_simple_spinner_dropdown_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears.
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner.
                spinner.adapter = adapter
            }


//            spinner.adapter = adapterClass
//
//            spinner.onItemClickListener =
//                object: AdapterView.OnItemSelectedListener {
//                    override fun onItemSelected(
//                        parent: AdapterView<*>?,
//                        view: View?,
//                        position: Int,
//                        id: Long
//                    ) {
//                        val selectedTicket = parent?.getItemAtPosition(position).toString()
//                    }
//
//                    override fun onNothingSelected(parent: AdapterView<*>?) {
//                        TODO("Not yet implemented")
//                    }
//                }

            btnBuy.setOnClickListener{
                findNavController().navigateUp()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}