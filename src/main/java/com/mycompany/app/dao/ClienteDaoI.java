/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.app.dao;

import com.mycompany.app.modelo.ClienteTO;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ClienteDaoI {

    public int create(ClienteTO d);

    public int update(ClienteTO d);

    public int delete(String id) throws Exception;

    public List<ClienteTO> listCmb(String filter);

    public List listarClientes();

    public ClienteTO buscarClientes(String dni);

    public void reportarCliente();

}
