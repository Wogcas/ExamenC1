package mx.edu.itson.examenc1

import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var contador: Int = 0
        val tabla = findViewById<TableLayout>(R.id.tabla)
        val nombreTxt = findViewById<TextView>(R.id.txtNombre)
        val cantidadTxt = findViewById<TextView>(R.id.txtCantidad)
        val precioTxt = findViewById<TextView>(R.id.txtPrecio)
        val agregar = findViewById<Button>(R.id.btnAgregar)
        val subtotalTxt = findViewById<TextView>(R.id.txtSubtotal)
        val IVATxt = findViewById<TextView>(R.id.txtIVA)
        val totalTxt = findViewById<TextView>(R.id.txtTotal)
        val elemento1 = findViewById<TextView>(R.id.r1e1)
        val elemento2 = findViewById<TextView>(R.id.r2e1)
        val elemento3 = findViewById<TextView>(R.id.r3e1)
        val producto1 = findViewById<TextView>(R.id.r1e2)
        val producto2 = findViewById<TextView>(R.id.r2e2)
        val producto3 = findViewById<TextView>(R.id.r3e2)
        val precio1 = findViewById<TextView>(R.id.r1e3)
        val precio2 = findViewById<TextView>(R.id.r2e3)
        val precio3 = findViewById<TextView>(R.id.r3e3)

        agregar.setOnClickListener {
            val nombre = nombreTxt.text.toString()
            val cantidad = cantidadTxt.text.toString().toIntOrNull()
            val precio = precioTxt.text.toString().toDoubleOrNull()

            if (nombre.isEmpty() || nombre.isBlank() ){
                nombreTxt.setText("Ingresa el nombre del producto").toString()
                return@setOnClickListener
            }
            if (cantidad == null || cantidad <= 0){
                cantidadTxt.setText("Ingresa la cantidad").toString()
                return@setOnClickListener
            }
            if (precio == null || precio <= 0){
                precioTxt.setText("Ingresa el precio del producto").toString()
                return@setOnClickListener
            }


            when {
                contador == 0 -> {
                    elemento1.setText("1").toString()
                    producto1.setText(nombre).toString()
                    val precioSumado = cantidad * precio
                    val contador = 1
                }
                contador == 1 -> {
                    elemento2.setText("2").toString()
                    producto2.setText(nombre).toString()
                    val precioSumado = cantidad * precio
                    val contador = 2
                }
                contador == 2 -> {
                    elemento3.setText("3").toString()
                    producto3.setText(nombre).toString()
                    val precioSumado = cantidad * precio
                    val contador = 3
                } else -> {
                    val subtotal =
                    subtotalTxt
                }

            }

        }



    }
}