package com.dev.recyclerviewetcardview

import android.os.Parcel
import android.os.Parcelable

data class Gouvernorat(val nom: String, val imageResourceId: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nom)
        parcel.writeInt(imageResourceId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Gouvernorat> {
        override fun createFromParcel(parcel: Parcel): Gouvernorat {
            return Gouvernorat(parcel)
        }

        override fun newArray(size: Int): Array<Gouvernorat?> {
            return arrayOfNulls(size)
        }
    }
}
