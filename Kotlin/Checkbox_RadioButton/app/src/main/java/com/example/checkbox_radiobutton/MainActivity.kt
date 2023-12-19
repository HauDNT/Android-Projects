package com.example.checkbox_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.checkbox_radiobutton.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addEvents()
    }

    private fun addEvents() {
        // Xử lý sự kiện khi click vào button Choose:
        binding.btnChoose.setOnClickListener {
            chooseHobbies();
        }

        // Xử lý sự kiện khi click vào button Confirm:
        binding.btnCf.setOnClickListener {
            confirm();
        }
    }

    private fun confirm() {
        var s:String = ""
        if (binding.rdbNam.isChecked)
            s = binding.rdbNam.text.toString()
        else if(binding.rdbNu.isChecked)
            s = binding.rdbNu.text.toString()

        if (s == "")
            Toast.makeText(this, "You didn't choose a gender", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "You chose gender: " + s, Toast.LENGTH_SHORT).show()
    }

    private fun chooseHobbies() {
        var s:String = ""
        if (binding.chkNN.isChecked)
            s += binding.chkNN.text.toString() + "\n"
        if (binding.chkDL.isChecked)
            s += binding.chkDL.text.toString() + "\n"
        if (binding.chkDS.isChecked)
            s += binding.chkDS.text.toString() + "\n"
        if (binding.chkDN.isChecked)
            s += binding.chkDN.text.toString() + "\n"
        if (binding.chkTT.isChecked)
            s += binding.chkTT.text.toString() + "\n"

        // Gán vào ô edtHobbies:
        binding.edtHobbies.setText(s)
    }
}