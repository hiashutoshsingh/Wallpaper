package com.example.wall_i.data

import com.example.wall_i.model.ListDataModel

class DataSource {
    //Store the Data from the Api here and the use it EveryWhere
    companion object {
        fun createDataSet(list:ArrayList<ListDataModel>): ArrayList<ListDataModel> {
            var createData= ArrayList<ListDataModel>()
            createData.addAll(list)

            return createData
        }
    }
}