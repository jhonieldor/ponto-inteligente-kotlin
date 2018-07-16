package com.ultra.pontointeligente.services

import com.ultra.pontointeligente.documents.Empresa

interface EmpresaService {

    fun buscarPorCnpj(cnpj: String): Empresa?

    fun salvar(empresa: Empresa): Empresa
}