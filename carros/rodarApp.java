package dio.exercio.oo.carros;

class rodarApp {
    public static void main(String[] args){
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("saveiro");
        carro1.setCapacidadeTanque(45);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.43));

        Carro carro2 = new Carro("cinza", "Mercedes Benz", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.59));
    }
}
