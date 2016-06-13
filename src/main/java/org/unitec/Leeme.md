# Bienvenidos!
**Este documento esta hecho con mucho cariño para ustedes** 
```java
@Transactional
public interface DAOMensaje extends CrudRepository<Mensaje,Long> {
    public List<Mensaje> findByTitulo(String titulo);
}
```
