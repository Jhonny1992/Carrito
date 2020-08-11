<!DOCTYPE html">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html lang="esS">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="../resources/css/dropodwnestilo.css">
<link rel="stylesheet" href="../resources/css/estilos.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css" type="text/css"/>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" type="text/css"/>


  <title>Ventas</title>
</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  			<a class="navbar-brand" href="/JhonnySusaya/web/">TecnoProductos</a>
  			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    			<span class="navbar-toggler-icon"></span>
  			</button>
  			<div class="collapse navbar-collapse" id="navbarSupportedContent">
    			<ul class="navbar-nav mr-auto">
      				<li class="nav-item active">
        			<a class="nav-link" href="/JhonnySusaya/web/">Inicio <span class="sr-only"></span></a>
      				</li>
      			<div class="navbar1">
  					<div class="dropdown1">
    					<a class="dropbtn nav-link dropdown-toggle" href="/JhonnySusaya/web/tipoproductocat"  role="button">Productos 
      						<i class="fa fa-caret-down"></i>
    					</a>
    					<div class="dropdown-content">
      						<a class="dropdown-item" href="subtipprod?codigosubtipo=1" > Monitores </a>
      						<a class="dropdown-item" href="subtipprod?codigosubtipo=2" > Disco Duros</a>
      						<a class="dropdown-item" href="subtipprod?codigosubtipo=3" > Fuentes de Poder</a>
      						<a class="dropdown-item" href="subtipprod?codigosubtipo=4" > Procesadores</a>
      						<a class="dropdown-item" href="subtipprod?codigosubtipo=5" > Memorias RAM</a>
    					</div>
  					</div> 
				</div>
      
      			<li class="nav-item">
        			<a class="nav-link " href="#" tabindex="-1" aria-disabled="true">Carrito de Compras</a>
      			</li>
      			<li class="nav-item">
        			<a class="nav-link " href="" tabindex="-1" aria-disabled="true">Agregar Productos</a>
      			</li>
      			<li class="nav-item">
        			<a class="nav-link " href="#" tabindex="-1" aria-disabled="true">Nueva Venta</a>
      			</li>
    		</ul>
    		<form class="form-inline my-2 my-lg-0">
      			<input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
      				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
    		</form>
    		<ul class="navbar-nav">
    	<li class="nav-item dropdown">
        	<button id="registra-usu" class="button sm has-shadow" onclick="mostrarVentana()">
				Regístrate
			</button>
        <li class="nav-item dropdown">
        <button id="Login-usu" class="button light sm has-shadow" >
						Iniciar Sesión
		</button>
    </ul>
    
    
    <!--<div class="navbar1">
  <div class="dropdown1">
    <a class="dropbtn nav-link dropdown-toggle" href="#"  role="button">Inicio Sesión 
      <i class="fa fa-caret-down"></i>
    </a>
    <div class="dropdown-content">
      			<a class="dropdown-item" href="#" > Direccion</a>
      			<a class="dropdown-item" href="#" > Email</a>
      			<a class="dropdown-item" href="#" > Salir</a>
    </div>
  </div> 
</div>-->
			</div>
		</nav>
		
		
		
		<div class="modal fade bd-example-modal-lg" id="idModalRegistrar" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
				<!-- Modal content-->
				<div class="modal-content">
				<div class="modal-header" style="padding: 5px 20px">
					Actualizar Datos Postulante<button type="button" class="close" data-dismiss="modal" aria-label="Close">
          				<span aria-hidden="true">&times;</span>
       				   </button>
				</div>
				<div class="modal-body" style="padding: 20px 20px;">
					<form id="idActualiza" accept-charset="UTF-8" action="updatePostulante" 
													class="form-horizontal" method="post" data-toggle="validator" role="form">						
		                   					<input type="hidden" id="idPostulanteM" name="codigo">
		                   					
		                                    <div class="form-row">
			                                    <div class="form-group col-md-6">
			                                        <label for="staticEmail">Nombre</label>
														<input class="form-control" id="idNombreM" name="nombre" placeholder="Ingrese nombre"/>
			                                    </div>
			                                    <div class="form-group col-md-6">
			                                        <label for="staticEmail">Apellidos</label>
														<input class="form-control" id="idPaternoM" name="paterno" placeholder="Ingrese apellido paterno"/>
			                                    </div>
			                                </div> 		                                
		                                    <div class="form-row">
			                                    <div class="form-group col-md-6">
			                                        <label for="staticEmail">Email</label>
														<input class="form-control" id="idDniM" name="dni" placeholder="Ingrese DNI"/>
			                                    </div>
			                                    <div class="form-group col-md-6">
			                                        <label for="staticEmail">Contraseña</label>
														<input class="form-control" id="idFechaM" name="fecha" placeholder="Ingrese Fecha Nacimiento"/>
			                                    </div>
			                                </div> 			                                
		                                    
                        				<div class="modal-footer">
									        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
									        <button type="submit" class="btn btn-primary">Actualizar</button>
									    </div>
		            </form>      
				</div>
			</div>
		</div>
  </div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script   src="http://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>

<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>



<script >
function mostrarVentana(){
	$("#idModalRegistrar").modal("show");
}
</script>





</body>
</html>