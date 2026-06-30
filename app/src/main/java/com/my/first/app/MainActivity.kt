package com.my.first.app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
// El package name se ve como un dominio.
// Los lenguajes que se suelen usar son kotlin y Java.
// Se ouede ver cuales sn las plataformas de android mas utilzadas para saber que api usar.
// Despues de crear el proyecto a la izquierda se ve el explorador de proyectos,
// a la derecha donde se trabajan  los archivos y abajo el panel de mensajes.
// Apenas se crea el proyecto da un archivo xml y kt los cuales al correros mostraran un "Hola mundo".
// Partes de un proyecto base: en la parte superior izquierda donde dice project se puede cambiar la vista, ayudara a ver de otra manera los archivos.
// En el App esta el proyecto como tal (archivos que conforman el proyecto).
// En el directorio de JAva se puede ver el archivo que se genero.
// Dentro de res estara drawable: para meter imagenes (los recursos). layout: las interfaces. Mipmap: las imagenes pero normalmente el icono. values: donde normalmente se guardaran distintos valores (colors, strings y styles).
// Manifest se encuentra dentro de App, es importante porque es casi la columna del proyecto, dentro de este podemos ver el package, la configuracion en Application.
// Para provar la app se usa un emulador. Este se puede ver en el AVD Manager, dentro de este se muestran los emuladores definidos por defecto pero tambien se puede elejir otros.
// Activity: es un consepto (2 archivos), son la base para trabajar una aplicasion.
// Fragmenst: es una porción de la interfas, es para cambiar una pequeña parte y no all. Se sigue utilizando porque nos permite cambiar las interfaces, se suele ver más en el pastado visual.
// Gradle: en si es una tecnologia, es un sistema que nos permite trabajar en archivos que nos permitiran configurar la compilasion que queremos. Antes del resultado.
// Hay 2 archivos llamados gradel script (perspectiva android), el primero hace referencia al proyecto y el segundo hace referencia al modulo.
// Drawable solo mantendran una version de la imagen mientras que mipmap no importa cuantas versiones tenga, este las mantendra por eso dejan los iconos ahi.