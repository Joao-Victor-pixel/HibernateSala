package ifc.ibirama.hibernatesalaaula.turmab.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Bombeiro")
public class Bombeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bom_id")
    private Integer id;

    @Column(name = "bom_cpf", length = 11, unique = true, nullable = false)
    private String cpf;

    @Column(name = "bom_data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "bom_nome_completo", nullable = false, length = 45)
    private String nome;

    @Column(name = "bom_nome_guerra", nullable = false, length = 45, unique = true)
    private String guerra;
    
   
/*
    @OneToOne(mappedBy = "bombeiro")
    private Usuario usuario;

    @OneToMany(mappedBy = "bombeiro")
    private Set<TelefoneDeContato> telefone = new HashSet<TelefoneDeContato>();
    @ManyToMany
    @JoinTable(name = "Bombeiro_Has_Patente",
            joinColumns = @JoinColumn(name = "bom_id"),
            inverseJoinColumns = @JoinColumn(name = "pat_id"))
    private Set<Patente> patente = new HashSet<Patente>();
*/
    public Bombeiro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGuerra() {
        return guerra;
    }

    public void setGuerra(String guerra) {
        this.guerra = guerra;
    }

    /*
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<TelefoneDeContato> getTelefone() {
        return telefone;
    }

    public void setTelefone(Set<TelefoneDeContato> telefone) {
        this.telefone = telefone;
    }

    public Set<Patente> getPatente() {
        return patente;
    }

    public void setPatente(Set<Patente> patente) {
        this.patente = patente;
    }

   */ 
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario aux = (Usuario) obj;

            /* if ((aux.getId().equals(this.Id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getLogin().equals(this.cpf))) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}