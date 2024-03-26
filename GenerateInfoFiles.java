/*
 * INSTITUCION UNIVERSITARIA POLITECNICO GRAMCOLOMBIANO
 * MODULO CONCEPTOS FUNDAMENTALES DE PPROGRAMACION [GRUPO B02]
 * ENTREGA PROYECTO 1 - ESCENARIO 3
 * 
 * INTEGRANTES SUBGRUPO 10
 * ROBINSON AMADO PEÑA - 100273913
 * GABRIELA ALEXANDRA BARÓN BARRETO - 100285411
 * JEFERSON MEDINA GOMEZ - 100289745
 * KAROL MELISSA GOMEZ COLMENARES - 
 * DAVID SANCHEZ - 
 */

public class GenerateInfoFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DATOS VENDEDORES
		String [] nombresVendedores = {"CARLOS ANTONIO", "VERONICA LISNEY","ANDRES"};
		String [] apellidosVendedores = {"CASTRO BERNAL", "CARO BUENO", "SOTO RODRIGUEZ"};
		String [] tipoDocumentos  = {"CC", "CC", "CC"};
		String[] numeroDocumentos = {"1070959820", "1010152330", "1012356427"};
		
		//DATOS DEL PRODUCTO		
		int [] idsProductos = {101,102,103};
		int [][] cantidadesProductos = {
				{12,24,32},
				{2,15,10},
				{20,10,4}
		};
		double [] preciosProductos = {12000000, 67000000, 89000000};
		String [] nombresProductos = {"VEHICULO", "CAMIONETA", "CAMION"};
		
		//ARREGLO PARA ALMACENAR LAS VENTAS TOTALES POR VENDEDOR
		double [] ventasTotalesPorVendedor = new double[nombresVendedores.length];
		
		
		
		//GENERAR DATOS EN FORMATO CSV
		System.out.println("Datos en formato CSV;");
		
		//CALCULAR VENTAS TOTALES POR VENDEDOR
		for (int i = 0; i < nombresVendedores.length; i++) {
			for (int j = 0; j < nombresProductos.length; j++) {
				ventasTotalesPorVendedor[i] += cantidadesProductos[i][j] * preciosProductos[j];
			}
			// Mostrar las ventas totales por vendedor
			System.out.println(nombresVendedores[i] + ";" + apellidosVendedores[i] + ";" + ventasTotalesPorVendedor[i]);
		}
		
        // Encontrar el vendedor que recaudó más dinero
        int indiceVendedorMasVentas = 0;
        double maxVentas = ventasTotalesPorVendedor[0];
        for (int i = 1; i < ventasTotalesPorVendedor.length; i++) {
            if (ventasTotalesPorVendedor[i] > maxVentas) {
                 maxVentas = ventasTotalesPorVendedor[i];
                 indiceVendedorMasVentas = i;
                
			}
			
		}
        // Mostrar el vendedor que recaudó más dinero
        System.out.println("El vendedor que recaudó más dinero es:");
        System.out.println("Nombre: " + nombresVendedores[indiceVendedorMasVentas]);
        System.out.println("Apellido: " + apellidosVendedores[indiceVendedorMasVentas]);
        System.out.println("Tipo de Documento: " + tipoDocumentos[indiceVendedorMasVentas]);
        System.out.println("Número de Documento: " + numeroDocumentos[indiceVendedorMasVentas]);
        System.out.println("Total Recaudado: " + ventasTotalesPorVendedor[indiceVendedorMasVentas]);
		
	}
}
	
	



		


