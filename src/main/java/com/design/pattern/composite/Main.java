package com.design.pattern.composite;

public class Main {
    public static void main(String[] args) {
        FileSystem relatorio = new File("relatorio_mensal.pdf", 120);
        FileSystem planilha = new File("orçamento.xlsx", 250);
        FileSystem imagem = new File("logo_empresa.png", 50);
        FileSystem notas = new File("notas.txt", 10);

        Folder folderDocuments = new Folder("Documentos");
        Folder folderImages = new Folder("Imagens");
        Folder folderRoot = new Folder("Meu Drive");

        folderDocuments.addFile(relatorio);
        folderDocuments.addFile(planilha);

        folderImages.addFile(imagem);

        folderRoot.addFile(folderDocuments);
        folderRoot.addFile(folderImages);
        folderRoot.addFile(notas);

        folderRoot.printTree();
        System.out.println("================");
        folderRoot.removeFile(folderDocuments);
        folderRoot.printTree();
    }
}
