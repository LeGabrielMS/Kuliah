package com.example.pertemuan5

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val showButton: Button = findViewById(R.id.showButton)
        showButton.setOnClickListener {
            showAlertDialog()

        }
    }

    private fun showAlertDialog() {
        // Membuat Alert Dialog.
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Warning")
        builder.setMessage("Apakah Anda Ingin Keluar Dari Aplikasi?")
        builder.setPositiveButton("Yes") { dialog, which ->
            finish() // finish() Untuk Apabila User Menekan Yes Maka Akan Keluar Dari Apl.

            // Membuat & Menampilkan Toast Message.
            Toast.makeText(this, "Keluar Dari Aplikasi", Toast.LENGTH_SHORT).show()
        }
        builder.setNegativeButton("No"){dialog, which ->
            dialog.dismiss() // dismiss() Untuk Apabila User Menekan No Maka Tidak Akan Terjadi Apa-apa
        }

        val alertDialog:AlertDialog = builder.create()
        alertDialog.show() // Menampilkan Alert Dialog.
    }
}