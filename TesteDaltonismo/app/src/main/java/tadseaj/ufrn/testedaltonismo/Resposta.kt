package tadseaj.ufrn.testedaltonismo

class Resposta (var r1:String, var r2:String, var r3:String ){

    fun resuldadoResposta(): String{

        if (r1.equals("") || r2.equals("") || r3.equals("")){
            return "Está faltando alguma resposta"
        }
        if(r1.equals("74") || r2.equals("57") || r3.equals("8")){
            return "Sua visão esta boa"
        }else{

            return "Procure um medico"

        }
    }
}