package com.example.wall_i

import android.os.Bundle
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class SearchActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)

        searchEditText?.setOnEditorActionListener { _, actionId, _ ->

            if (actionId == EditorInfo.IME_ACTION_GO || actionId == EditorInfo.IME_ACTION_NEXT || actionId == EditorInfo.IME_ACTION_GO || actionId == EditorInfo.IME_ACTION_SEND) {
                if (searchEditText.text.toString().isNotBlank() || searchEditText.text.toString()
                        .isNotEmpty()
                ) openActivity(searchEditText.text.toString())
                true
            } else {
                if (searchEditText.text.toString().isNotBlank() || searchEditText.text.toString()
                        .isNotEmpty()
                ) {
                    Toast.makeText(
                        this, "else" + searchEditText.text.toString(), Toast.LENGTH_SHORT
                    ).show()
                    openActivity(searchEditText.text.toString())
                }
                false
            }
        }

    }

    private fun openActivity(searchedText: String) {
        //todo
        //val intent = Intent(this, ProfileActivity::class.java)
        // intent.putExtra("Username", "John Doe")
        // startActivity(intent)
    }
}