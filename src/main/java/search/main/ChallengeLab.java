package search.main;

import java.util.ArrayList;
import java.util.Scanner;

import search.enums.MessageEnum;
import search.file.FileSearch;
import search.file.IndexFile;

/**
 * 
 * @author jairmendes
 *
 */
public class ChallengeLab {

	public static void main(String[] args) throws Exception {
		if(args.length > 0) {
			String searchWord = args[0];
			
			Scanner path = new Scanner(System.in);
			System.out.println("Informe o path dos arquivos:");
			
			if(path.hasNext()) {
				
				//INICIAR CARGA DOS ARQUIVOS PARA PROCESSAMENTO
				IndexFile indexFile = new IndexFile(path.next());
				
				long startTime = System.currentTimeMillis();
				
				ArrayList<String> searched = FileSearch.search(indexFile.getMapFile(), searchWord);
				
				long endTime = System.currentTimeMillis();
				
				System.out.printf("%.2f ms%n" , (endTime - startTime) / 1000d);
				System.out.println("Foram encontradas " + FileSearch.getCount() + " ocorrências pelo termo [" + searchWord + "]");
				searched.forEach(System.out::println);
			}else {
				throw new Exception(MessageEnum.PATH_INVALIDO.getMessage());
			}
		}else {
			throw new Exception(MessageEnum.PARAMETRO_INVALIDO.getMessage());
		}
	}
}
