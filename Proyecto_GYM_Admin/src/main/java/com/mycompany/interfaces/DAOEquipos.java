package com.mycompany.interfaces;

import com.mycompany.models.Equipos;
import java.util.List;


public interface DAOEquipos {
    public void agregar(Equipos equipo) throws Exception;
    public List<Equipos> listar(String nombreEquipo) throws Exception;
    public void modificar(Equipos equipo) throws Exception;
    public Equipos obtenerEquipoPorID(int EquipoID) throws Exception;
}
