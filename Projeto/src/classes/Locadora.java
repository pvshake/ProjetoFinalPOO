package classes;

import interfaces.ListarClientes;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Locadora {

    public void criarCliente(Cliente c) throws IOException{

        try {
            
            File arquivoCliente = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\clientes.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCliente, true));
            
            writer.write(c.getCodCli() + ";" + c.getNome() + ";" + c.getRg() + ";" + c.getCpf() + ";" + c.getTelefone() + ";" +
                         c.getEndereco() + ";" + c.geteMail() + System.lineSeparator());
            writer.close();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
            e.printStackTrace();
            
        }

    }
    
    public void atualizarCliente(Cliente c) throws FileNotFoundException, IOException{
        
        File arquivoCliente = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\clientes.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCliente))) {
        
            String line = "";
            
            String newLine = "";
            
            while ((line = br.readLine()) != null) {
                
                if(line.split(";")[0].equals(String.valueOf(c.getCodCli()))){
                    String[] registro  = line.split(";");
                    line = registro[0] + ";" + registro[1] + ";" + registro[2] + ";" + registro[3] + ";" + c.getTelefone() + ";" + c.getEndereco() + ";" + c.geteMail();
                }
                newLine += line + System.lineSeparator();
            }
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCliente, true));
          
            PrintWriter pw = new PrintWriter(arquivoCliente);
            pw.close();
            
            writer.write(newLine);
            
            writer.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    public void deletaCliente(String codigo) throws FileNotFoundException, IOException{
        
        File arquivoCliente = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\clientes.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCliente))) {
        
            String line = "";
            
            String newLine = "";
            
            while ((line = br.readLine()) != null) {
                
                if(!line.split(";")[0].equals(codigo))
                    newLine += line + System.lineSeparator();
                
            }
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCliente, true));
          
            PrintWriter pw = new PrintWriter(arquivoCliente);
            pw.close();
            
            writer.write(newLine);
            
            writer.close();

            JOptionPane.showMessageDialog(null, "Deleteado com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        }        
    }
    
    public void criarVeiculo(Veiculo v) throws IOException{
        
        try {
            
            File arquivoVeiculo = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\veiculos.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoVeiculo, true));
            
            writer.write(v.getMarca() + ";" + v.getModelo() + ";" + v.getPlaca() + ";" + v.getAno() + ";" + v.getPreco() + System.lineSeparator());
            
            writer.close();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
            e.printStackTrace();
            
        }
        
    }
    
    public void atualizarVeiculo(Veiculo v) throws FileNotFoundException, IOException{
        
        File arquivoVeiculo = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\veiculos.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoVeiculo))) {
        
            String line = "";
            
            String newLine = "";
            
            while ((line = br.readLine()) != null) {
                
                if((line.split(";").length > 1) && (line.split(";")[2].equals(v.getPlaca()))){
                    String[] registro  = line.split(";");
                    line = registro[0] + ";" + registro[1] + ";" + registro[2] + ";" + registro[3] + ";" + v.getPreco();
                }
                newLine += line + System.lineSeparator();
            }
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoVeiculo, true));
          
            PrintWriter pw = new PrintWriter(arquivoVeiculo);
            pw.close();
            
            writer.write(newLine);
            
            writer.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    } 
    
    public void deletaVeiculo(String placa) throws FileNotFoundException, IOException{
        
        File arquivoVeiculo = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\veiculos.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoVeiculo))) {
        
            String line = "";
            
            String newLine = "";
            
            while ((line = br.readLine()) != null) {
                
                if(line.split(";").length < 2)
                    newLine += line + System.lineSeparator();
                if(line.split(";").length > 1 && !line.split(";")[2].equals(placa))
                    newLine += line + System.lineSeparator();
                
            }
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoVeiculo, true));
          
            PrintWriter pw = new PrintWriter(arquivoVeiculo);
            pw.close();
            
            writer.write(newLine);
            
            writer.close();

            JOptionPane.showMessageDialog(null, "Deleteado com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    public void criarLocacao(Locacao l) throws IOException{
        
        try {
            
            File arquivoLocacao = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\locacoes.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoLocacao, true));
            
            writer.write(l.getCodLocacao() + ";" + l.getDataInicio() + ";" + l.getDataFinal() + ";" + l.getCodigoCliente() + ";" + l.getVeiculo().getPlaca() + System.lineSeparator());
            
            writer.close();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro na comunicação com o arquivo de dados!", "Falha Encontrada", JOptionPane.OK_OPTION);
            e.printStackTrace();
            
        }
        
    }
    
    public void atualizarLocacao(Locacao l) throws FileNotFoundException, IOException{
        
        File arquivoLocacao = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\locacoes.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoLocacao))) {
        
            String line = "";
            
            String newLine = "";
            
            while ((line = br.readLine()) != null) {
                
                if(line.split(";")[0].equals(String.valueOf(l.getCodLocacao()))){
                    String[] registro  = line.split(";");
                    line = registro[0] + ";" + l.getDataInicio() + ";" + l.getDataFinal() + ";" + registro[3] + ";" + registro[4];
                }
                newLine += line + System.lineSeparator();
            }
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoLocacao, true));
          
            PrintWriter pw = new PrintWriter(arquivoLocacao);
            pw.close();
            
            writer.write(newLine);
            
            writer.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    public void deletaLocacao(String codLoc) throws FileNotFoundException, IOException{
        
        File arquivoLocacao = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\locacoes.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoLocacao))) {
        
            String line = "";
            
            String newLine = "";
            
            while ((line = br.readLine()) != null) {
                
                if(!line.split(";")[0].equals(codLoc))
                    newLine += line + System.lineSeparator();
                
            }
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoLocacao, true));
          
            PrintWriter pw = new PrintWriter(arquivoLocacao);
            pw.close();
            
            writer.write(newLine);
            
            writer.close();

            JOptionPane.showMessageDialog(null, "Deleteado com sucesso!", "Operação Concluída", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    public String[] buscaPlacas() throws FileNotFoundException, IOException{
        
        File arquivoCliente = new File("C:\\Users\\Arthur\\Documents\\UFG\\POO\\codigos-git\\Locadora\\Arquivos\\clientes.txt");       
        
        String placas = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCliente))) {
        
            String line = "";
            
            while ((line = br.readLine()) != null) {
                
                if(!line.equals("Marca,Modelo,Placa,Ano,Valor / Dia"))
                    placas += line.split(";")[2] + System.lineSeparator();
            }
            
        }
        
        return placas.split(System.lineSeparator());
    }
				
}
