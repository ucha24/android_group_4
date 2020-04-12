package ge.msda.recyclerview

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ProductAdapter(getProducts())
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recyclerView.layoutManager = GridLayoutManager(this, 4)
        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        }
        recyclerView.adapter = adapter
    }

    private fun getProducts(): List<Product> {

        val Company1 = Product(1, "Apple", "1000K", R.drawable.ic_apple_logo_black)
        val Company2 = Product(2, "Apple", "1000K", R.drawable.ic_apple_logo_black)
        val Company3 = Product(3, "Apple", "1000K", R.drawable.ic_apple_logo_black)
        val Company4 = Product(4, "Apple", "1000K", R.drawable.ic_apple_logo_black)
        val Company5 = Product(5, "Apple", "1000K", R.drawable.ic_apple_logo_black)
        val Company6 = Product(6, "Apple", "1000K", R.drawable.ic_apple_logo_black)
        val Company7 = Product(7, "Apple", "1000K", R.drawable.ic_apple_logo_black)
        val Company8 = Product(8, "Apple", "1000K", R.drawable.ic_apple_logo_black)

        val returnList = ArrayList<Product>()

        returnList.add(Company1)
        returnList.add(Company2)
        returnList.add(Company3)
        returnList.add(Company4)
        returnList.add(Company5)
        returnList.add(Company6)
        returnList.add(Company7)
        returnList.add(Company8)

        return returnList
    }
}