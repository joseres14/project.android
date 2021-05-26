package com.example.myproyect10
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ToDoFragment: Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter:RecyclerView.Adapter<*>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       val root=inflater.inflate(R.layout.fragment_to_do,container,false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val fap=activity?.findViewById<FloatingActionButton>(R.id.fab)
        fap?.setOnClickListener {  }

        var myDatasetTask:ArrayList<String> = ArrayList()

        myDatasetTask.add("Go to supermarket")
        myDatasetTask.add("Go to supermarket")
        myDatasetTask.add("Go to supermarket")
        myDatasetTask.add("Go to supermarket")
        myDatasetTask.add("Go to supermarket")
        myDatasetTask.add("Go to supermarket")
        myDatasetTask.add("Go to supermarket")
        myDatasetTask.add("Go to supermarket")


        viewAdapter=MyListAdapter(myDatasetTask)

        recyclerView=requireView().findViewById(R.id.recycler_view_todo)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=viewAdapter
        recyclerView.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }



}



