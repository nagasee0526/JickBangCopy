package com.ubis.jickbangcopy.datas

import java.text.NumberFormat
import java.util.*

class room (val price:Int, val address:String, val floor:Int, val description:String) {

    fun getFormattedFloor() : String {
        if(this.floor > 0)  {
            return "${this.floor}층"
        }
        else if( this.floor == 0)   {
            return "반지하"
        }
        else    {
            return "지하 ${-this.floor}층"
        }
    }

    fun getPrice() : String {

        if(this.price > 10000)
        {
            val uk = this.price/10000
            val underuk = this.price%10000


            return "${uk}억 ${NumberFormat.getIntegerInstance(Locale.KOREA).format(underuk)}"
        }
        else if (this.price == 10000) {
            return "1억"
        }
        else
        {
            return  "${NumberFormat.getIntegerInstance(Locale.KOREA).format(this.price)}"
        }
    }
}