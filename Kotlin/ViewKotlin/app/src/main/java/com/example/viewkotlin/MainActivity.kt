package com.example.viewkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtA = findViewById<EditText>(R.id.edtA);
        val edtB = findViewById<EditText>(R.id.edtB);
        val edtResult = findViewById<EditText>(R.id.edtResult);
        val btnPlus = findViewById<Button>(R.id.btnPlus);
        val btnReset = findViewById<Button>(R.id.btnReset);
        val btnMul = findViewById<Button>(R.id.btnMul);
        val btnDiv = findViewById<Button>(R.id.btnDiv);
        val btnLong = findViewById<Button>(R.id.btnLong);
        val btnExit = findViewById<Button>(R.id.btnExit);

//        btnPlus.setOnClickListener {
//            val A = edtA.text.toString().toInt();
//            val B = edtB.text.toString().toInt();
//            val result = A + B;
//            edtResult.setText(result.toString());
//        }

        btnReset.setOnClickListener {
            edtA.setText("")
            edtB.setText("")
            edtResult.setText("")
            Toast.makeText(this, "All data were deleted!", Toast.LENGTH_LONG).show()
        }

        // Tạo sự kiện chia sẻ: 1 bến có thể chia sẻ sự kiện cho 2 view
        var shareEvent: View.OnClickListener? = null
        shareEvent = View.OnClickListener {
            if (it == btnPlus) {
                val A = edtA.text.toString().toInt()
                val B = edtB.text.toString().toInt()
                val result = A + B
                edtResult.setText(result.toString())
            }
            else if (it == btnMul) {
                val A = edtA.text.toString().toInt()
                val B = edtB.text.toString().toInt()
                val result = A * B
                edtResult.setText(result.toString())
            }
            else if (it == btnDiv) {
                val A = edtA.text.toString().toDouble()
                val B = edtB.text.toString().toDouble()
                val result = A / B
                edtResult.setText(result.toString())
            }
            else if (it == btnReset) {
                edtA.setText("")
                edtB.setText("")
                edtResult.setText("")
                Toast.makeText(this, "All data were deleted!", Toast.LENGTH_LONG).show()
            }
        }
        btnMul.setOnClickListener(shareEvent)
        btnDiv.setOnClickListener(shareEvent)

        // Sự kiện nhấn lâu:
        var longClickEvent: View.OnLongClickListener? = null;
        longClickEvent = View.OnLongClickListener {
            if (it == btnLong) {
                Toast.makeText(this, "Long click detected!", Toast.LENGTH_SHORT).show();
                btnLong.visibility = View.GONE;
            }
            true;
        };

        btnLong.setOnLongClickListener(longClickEvent);

        // Sự kiện thoát khỏi chương trình:
        btnExit.setOnClickListener {
            Toast.makeText(this, "You will exit", Toast.LENGTH_SHORT).show();
            finish()
        }
    }
}