package com.carlosabrahammenndezilhuicatzisapplication.app.modules.calculadoraderiesgo.`data`.model

import com.carlosabrahammenndezilhuicatzisapplication.app.R
import com.carlosabrahammenndezilhuicatzisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CalculadoraDeRiesgoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCalculadorade: String? =
      MyApp.getInstance().resources.getString(R.string.msg_calculadora_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMarcalasenfer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_marca_las_enfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiabetes: String? = MyApp.getInstance().resources.getString(R.string.lbl_diabetes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPresinarteria: String? =
      MyApp.getInstance().resources.getString(R.string.msg_presi_n_arteria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInsuficienciac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_insuficiencia_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnfermedadeshe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enfermedades_he)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnfermedadesre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enfermedades_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTratamientosde: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tratamientos_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAceptar: String? = MyApp.getInstance().resources.getString(R.string.lbl_aceptar)

)
