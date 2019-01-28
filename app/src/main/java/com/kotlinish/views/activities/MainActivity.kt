package com.kotlinish.views.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.kotlinish.R
import com.kotlinish.dummy.DummyContent
import com.kotlinish.views.fragments.CurrentListFragment

class MainActivity : AppCompatActivity(), CurrentListFragment.OnListFragmentInteractionListener {

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        findNavController(R.id.nav_host_fragment).navigate(R.id.fragmentListtoDetails)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp() = findNavController(R.id.nav_host_fragment).navigateUp()

}
