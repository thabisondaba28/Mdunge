package za.ac.iie.mdunge



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.screensmart.databinding.ActivityDetailedViewBinding

class DetailedViewActivity : AppCompatActivity() {

    private lateinit var binding: DetailedViewActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Logic to display data and calculate average
    }
}
