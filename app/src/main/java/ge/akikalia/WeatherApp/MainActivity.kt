package ge.akikalia.WeatherApp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var buttons: ArrayList<Button>
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout : TabLayout

    private var fragment1 = OverviewFragment()
    private var fragment2 = TimetableFragment()

    //create tab bar reference, get it by id and show appropriate fragment using viewpager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = ViewPagerAdapter(this)

        tabLayout = findViewById(R.id.tabLayout)
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
//        TabLayoutMediator(tabLayout, viewPager){tab, position ->
//            tab.text = "${position + 1}"
//        }.attach()

//        viewPager.addOnLayoutChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
//        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        viewPager.addOnLayoutChangeListener(View.OnLayoutChangeListener{
            tabLayout.selectTab(tabLayout.getTabAt(viewPager.currentItem))
        })
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.setCurrentItem(tab.position, true)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

//        viewpager.setCurrentItem()

        buttons.add(findViewById(R.id.imageButton))
        buttons.add(findViewById(R.id.imageButton2))
        buttons.add(findViewById(R.id.imageButton3))
        for ((index, btn) in buttons.withIndex()) {
            btn.setOnClickListener {

            }
        }
    }
}