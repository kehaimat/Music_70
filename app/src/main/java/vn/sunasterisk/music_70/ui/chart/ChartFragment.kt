package vn.sunasterisk.music_70.ui.chart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import vn.sunasterisk.music_70.R
import vn.sunasterisk.music_70.base.BaseFragment

class ChartFragment : BaseFragment(){

    override val getContentViewId = R.layout.fragment_chart

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun initComponents() {
    }

    override fun registerListeners() {
    }

    override fun unregisterListeners() {
    }

    companion object {
        fun newInstance() = ChartFragment()
    }
}
