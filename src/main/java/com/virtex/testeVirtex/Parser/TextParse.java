package com.virtex.testeVirtex.Parser;

import com.virtex.testeVirtex.Entities.ONU;
import com.virtex.testeVirtex.Repositories.ONURepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
@Component
@RequiredArgsConstructor
public class TextParse {

    private final ONURepository repository;

    @Transactional
    public void huaweiReader(){
        String nomeArquivo = "C:\\Users\\Usuário\\Documents\\java\\testeVirtex\\src\\main\\resources\\static\\Huawei.txt"; // Substitua pelo caminho completo do seu arquivo.
        int linhaInicial = 9;
        int linhaFinal = 117;

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int numeroLinha = 0;

            while ((linha = leitor.readLine()) != null) {
                numeroLinha++;

                if (numeroLinha >= linhaInicial && numeroLinha <= linhaFinal) {
                    String[] palavras = linha.split("\\s+"); // Divide a linha em palavras com base em espaços em branco.
                    if (palavras.length >= 5) {
                        ONU onu = new ONU();
                        onu.setSlot(palavras[1]);
                        onu.setPort(palavras[2]);
                        onu.setOnt_id(Long.valueOf(palavras[3]));
                        onu.setSn(palavras[4]);
                        onu.setState(palavras[6]);

                        repository.save(onu);
                    }
                }

                if (numeroLinha > linhaFinal) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
