package com.example.callcontentprovider

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.telecom.Call
import android.widget.ListView
import android.widget.SearchView
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    var cols = arrayOf(
        ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
        ContactsContract.CommonDataKinds.Phone.NUMBER,
        ContactsContract.CommonDataKinds.Phone._ID
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addcall :FloatingActionButton = findViewById(R.id.addcall)
        val searchcall : SearchView = findViewById(R.id.search_call)


            addcall.setOnClickListener {
            val intent = Intent(Intent.ACTION_INSERT)
            intent.data = ContactsContract.RawContacts.CONTENT_URI
            startActivity(intent)
            onRestart()

            }

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_CONTACTS), 111)
        }
        else {
            readcontact()
        }

        searchcall.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                readcontact(newText)
                return false
            }
        })

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 111 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            readcontact()
    }

    @SuppressLint("Range")
    private fun readcontact(query: String? = null) {

        val selection = if (query.isNullOrEmpty()) null else "${ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME} LIKE ?"
        val selectionArgs = if (query.isNullOrEmpty()) null else arrayOf("%$query%")

        var rs = contentResolver.query(
            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
            cols,
            selection,
            selectionArgs,
            ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME
        )

        var adapter = SimpleCursorAdapter(
            applicationContext, android.R.layout.simple_list_item_2, rs, cols,
            intArrayOf(android.R.id.text1, android.R.id.text2), 0
        )

        var listView: ListView = findViewById(R.id.listview)
        listView.adapter = adapter


        listView.setOnItemClickListener { _, _, position, _ ->
            rs?.let {
                if (it.moveToPosition(position)) {
                    val phoneNumber =
                        it.getString(it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                    if (!phoneNumber.isNullOrEmpty()) {
                        val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                            data = Uri.parse("tel:$phoneNumber")
                        }
                        startActivity(dialIntent)
                    }
                }
            }
        }
    }

    override fun onRestart() {
        super.onRestart()
        readcontact()
    }
}

