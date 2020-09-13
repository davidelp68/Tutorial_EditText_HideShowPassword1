package com.dm.tutorialedittext10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod  //Importazione della Classe: HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod     //Importazione della Classe: PasswordTransformationMethod
import android.widget.CheckBox                              //Importazione della Classe: CheckBox
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var showPass: CheckBox? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showPass = findViewById(R.id.checkBox)

        //funzione che gestisce il click all'interno della CheckBox
        showPass!!.setOnCheckedChangeListener { _, isChecked ->
            //Se la CheckBox è selezionata
            if (isChecked) {
                // mostra password
                editText.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                // nascondi password
                editText.transformationMethod = PasswordTransformationMethod.getInstance()
            }
            //questa riga di codice serve per impostare il cursore alla fine della password
            editText.setSelection(editText.length())
        }
    }
}
