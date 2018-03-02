public class Paginacao {

	public static void main(String[] args) {

		int qtdTotalPaginas = 25;

		for (int i = 1; i <= qtdTotalPaginas; i++) {
			paginacao(i, qtdTotalPaginas);
		}

	}

	public static void paginacao(int paginaAtual, int qtdTotalPaginas) {

		int resto = paginaAtual % 10;
		int paginaInicio = 0;

		if (resto == 0)
			paginaInicio = (paginaAtual / 10) * 10 - 9 ;
		else
			paginaInicio = (paginaAtual / 10) * 10 + 1;

		int paginaFimGroup = paginaInicio + 9;
		int paginaFim      = (paginaInicio + 9) > qtdTotalPaginas ? qtdTotalPaginas : (paginaInicio + 9);


		String result = "";

		if (paginaAtual > 1) {
			result += "Primeira  ";
			result += "Anterior  ";
		}

		if ( /*dezena &&*/ paginaAtual > 10 ) {
			result += "[" + (paginaInicio-10) + "-" + (paginaFimGroup-10) +"]  ";
		}

		for (int i = paginaInicio; i <= paginaFim; i++) {

			if (paginaAtual == i)
				result += i + "*  ";
			else
				result += i + "  ";

		}

		if ( /*dezena &&*/ paginaFimGroup < qtdTotalPaginas ) {
			result += "[" + (paginaInicio+10) + "-" + (paginaFimGroup+10) +"]";
		}

		if (paginaAtual < qtdTotalPaginas) {
			result += "  Próxima  ";
			result += "Última";
		}

		System.out.println(result);
	}
	
}