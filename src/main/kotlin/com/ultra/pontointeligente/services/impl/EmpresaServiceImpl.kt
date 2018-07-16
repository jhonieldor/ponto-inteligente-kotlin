package com.ultra.pontointeligente.services.impl

import com.ultra.pontointeligente.documents.Empresa
import com.ultra.pontointeligente.repositories.EmpresaRepository
import com.ultra.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun salvar(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}