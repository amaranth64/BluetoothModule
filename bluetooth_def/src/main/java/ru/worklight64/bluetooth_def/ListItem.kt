package ru.worklight64.bluetooth_def

import android.bluetooth.BluetoothDevice

data class ListItem(
    val device: BluetoothDevice,
    var isChecked: Boolean
)
