package mendoza.acosta.empresarestspringboot.service

import kotlinx.coroutines.flow.Flow
import mendoza.acosta.empresarestspringboot.models.Empleado
import java.util.UUID

interface EmpleadoService {
    suspend fun findAll(): Flow<Empleado>
    suspend fun findByUuid(uuid: UUID): Empleado
    suspend fun findByNombre(nombre: String): Flow<Empleado>
    suspend fun save(empleado: Empleado): Empleado
    suspend fun update(uuid: UUID, empleado: Empleado): Empleado
    suspend fun deleteByUuid(uuid: )
}