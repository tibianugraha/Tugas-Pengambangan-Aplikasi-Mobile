package lat.pam.droidcafe

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    private lateinit var citySpinner: Spinner
    private lateinit var notesEditText: EditText
    private var selectedCity: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        // Setup Spinner untuk City
        setupCitySpinner()

        // Inisialisasi Notes EditText
        notesEditText = findViewById(R.id.notes_text)
    }

    private fun setupCitySpinner() {
        citySpinner = findViewById(R.id.city_spinner)

        // Create adapter using string array
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.cities,
            android.R.layout.simple_spinner_item
        )

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        citySpinner.adapter = adapter

        // Set spinner listener
        citySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                selectedCity = parent.getItemAtPosition(position).toString()
                if (position > 0) { // Skip "Pilih Kota"
                    displayToast("Kota dipilih: $selectedCity")
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do nothing
            }
        }
    }

    fun onRadioButtonClicked(view: View) {
        // Is the button now checked?
        val checked = (view as RadioButton).isChecked
        when (view.id) {
            R.id.sameday -> if (checked) // Same day service
                displayToast(getString(R.string.same_day_messenger_service))

            R.id.nextday -> if (checked) // Next day delivery
                displayToast(getString(R.string.next_day_ground_delivery))

            R.id.pickup -> if (checked) // Pick up
                displayToast(getString(R.string.pick_up))

            else -> {}
        }
    }

    private fun displayToast(message: String) {
        Toast.makeText(
            applicationContext, message,
            Toast.LENGTH_SHORT
        ).show()
    }

    // Optional: Tambahkan method untuk proses order lengkap
    private fun processCompleteOrder() {
        val name = findViewById<EditText>(R.id.name_text).text.toString()
        val address = findViewById<EditText>(R.id.address_text).text.toString()
        val phone = findViewById<EditText>(R.id.phone_text).text.toString()
        val notes = notesEditText.text.toString()

        // Validasi
        if (selectedCity == "Pilih Kota" || selectedCity.isEmpty()) {
            displayToast("Silakan pilih kota tujuan")
            return
        }

        if (name.isEmpty() || address.isEmpty() || phone.isEmpty()) {
            displayToast("Silakan lengkapi semua data")
            return
        }

        // Tampilkan summary order
        val summary = """
            Order Summary:
            Nama: $name
            Alamat: $address
            Kota: $selectedCity
            Telepon: $phone
            Catatan: ${if (notes.isNotEmpty()) notes else "Tidak ada catatan"}
        """.trimIndent()

        displayToast("Pesanan berhasil!\n$summary")
    }
}