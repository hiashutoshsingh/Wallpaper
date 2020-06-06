package com.example.wall_i.Data

import com.example.wall_i.model.ListDataModel

class DataSource {
    //Store the Data from the Api here and the use it EveryWhere
    companion object {
        fun createDataSet(): ArrayList<ListDataModel> {
            var createData= ArrayList<ListDataModel>()
            createData.add(
                ListDataModel(
                "",
                ""
            )
            )

            return createData
        }
    }
}