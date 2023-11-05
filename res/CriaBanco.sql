create database BiblioTech

create table autor(
    idAutor int auto_increment,
    nomeAutor VARCHAR(100),
    statusAutor int,
    
    PRIMARY KEY (idAutor)
)

create table editora(
   idEditora int auto_increment,
   nomeEditora VARCHAR(100),
   statusEditora INT,

    PRIMARY KEY (idEditora)
)

create table livros(
    idLivro INT auto_increment,
    titulo VARCHAR(100),
    statusLivro VARCHAR(10),
    idEditora int,
    idAutor int,
    
    PRIMARY KEY (idLivro),
    FOREIGN KEY (idEditora) REFERENCES editora(idEditora),
    FOREIGN KEY (idAutor) REFERENCES autor(idAutor)
)

create table amigos(
    idAmigo INT auto_increment,
    nomeAmigo VARCHAR(100),
    cpfAmigo VARCHAR(20),
    telefoneAmigo VARCHAR(20),
    statusAmigo INT,

    PRIMARY KEY (idAmigo)
)

create table emprestimos(
    idEmprestimo INT auto_increment,
    idAmigos INT,
    descricao VARCHAR(100),
    data date,
    datafim date, 

    
)

    


public class EmprestimoBEAN {
    private int idEmprestimo;
    private int idAmigos;
    private String descricao;
    private Date data = new Date();
    private Date datafim = new Date();
    private String statusEmprestimo;