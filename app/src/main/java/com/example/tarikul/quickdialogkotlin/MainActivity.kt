package com.example.tarikul.quickdialogkotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.billkainkoom.quickdialog.QuickDialog
import com.billkainkoom.quickdialog.QuickDialogType

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn_open_dialog) as Button

        context= this

        button!!.setOnClickListener{
               // d1(context as MainActivity)
            d2(context as MainActivity)
        }
    }

    fun d1(context: Context) {
        QuickDialog(
            context = this,
            style = QuickDialogType.Message,
            title = "Hello World",
            message = "The quick dialog jumped over the old dialog",
            image = R.drawable.ic_info_outline_black_24dp)
            .overrideButtonNames("OK").overrideClicks({ ->
                Toast.makeText(context, "Clicked on OK", Toast.LENGTH_SHORT).show()
            }).show()
    }

    fun d2(context: Context) {

        QuickDialog(
            context = context,
            style = QuickDialogType.Progress,
            title = "Please wait",
            message = "Walking round the world")
            .show()

    }

}
