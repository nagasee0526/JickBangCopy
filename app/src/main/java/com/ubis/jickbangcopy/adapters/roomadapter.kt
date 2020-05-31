package com.ubis.jickbangcopy.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.ubis.jickbangcopy.R
import com.ubis.jickbangcopy.datas.room
import kotlinx.android.synthetic.main.roomlistview.view.*

class roomadapter(context: Context, resId: Int, list:List<room>) : ArrayAdapter<room>(context, resId, list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.roomlistview, null)
        }
        val row = tempRow!!

        val  data = mList.get(position)

        val priceTxt = row.findViewById<TextView>(R.id.price)
        val addressTxt = row.findViewById<TextView>(R.id.adressAndFloor)
        val descTxt = row.findViewById<TextView>(R.id.descTxt)

        addressTxt.text = "${data.address}, ${data.getFormattedFloor()}"
        descTxt.text = data.description

        return row
    }

}