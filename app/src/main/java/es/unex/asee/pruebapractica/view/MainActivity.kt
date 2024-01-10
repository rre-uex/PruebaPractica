package es.unex.asee.pruebapractica.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import es.unex.asee.pruebapractica.api.getNetworkService
import es.unex.asee.pruebapractica.data.toIssue
import es.unex.asee.pruebapractica.databinding.MainBinding
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private lateinit var binding: MainBinding
    private lateinit var adapter: IssueAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()

        lifecycleScope.launch {
            val response = getNetworkService().getIssues()
            Log.v("MainViewModel", "init: ${response}")
            val _issues = response.map { it.toIssue() }
            adapter.updateData(_issues)
        }
    }

    fun setUpRecyclerView() {

        val tcontext = this
        adapter = IssueAdapter (
            issues = emptyList(),
            onItemClick = { issue ->
                navigateToWebsite(issue.number)
            },
            context = tcontext
        )

        with(binding) {
            rv.layoutManager = LinearLayoutManager(tcontext)
            rv.adapter = adapter
        }
    }

    private fun navigateToWebsite(number: Int?) {
        Log.v("MainActivity", "navigateToWebsite: ${number}")
        if(number != null){

            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://git.eclipse.org/r/$number"))
            startActivity(webIntent)
        }
    }
}

