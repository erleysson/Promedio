package entidades;

public enum Mensajes {



        MENSAJE_NOTA_SEGUIMIENTO("Ingrese la nota de seguimiento."),
        MENSAJE_NOTA_PARCIAL ("ingrese la nota del parcial."),
        MENSAJE_NOTA_FINAL("Ingrese la nota del final."),
        MENSAJE_NOTA_DEFINITIVA(" La nota defitiva es: "),
        MENSAJE_NOTA1("La primera nota es:  "),
        MENSAJE_NOTA2(" La segunda nota es:  "),
        MENSAJE_NOTA3(" La tercera nota es:  "),
        MENSAJE_D("Nuevamente vuelve a iniciar tus estudios y dedícate."),
        MENSAJE_I("Malas noticias, no cumpliste con el mínimo para avanzar."),
        MENSAJE_A("Te sugerimos comprometerte más con tu estudio."),
        MENSAJE_S("Tu rendimiento es aceptable, pero finalizaste bien."),
        MENSAJE_E( "Excelente, tu rendimiento ha sido el mejor.");

        //atributo

        private String mensaje;

        Mensajes(String s) {
            this.mensaje = s ;
        }

        public String getMensajes() {
            return mensaje;
        }

}
