package ge.akikalia.WeatherApp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class ViewPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity){

    var fragmentsList = arrayListOf<Fragment>(OverviewFragment(), TimetableFragment())

    override fun getItemCount(): Int {
        return fragmentsList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentsList.get(position)
    }

}