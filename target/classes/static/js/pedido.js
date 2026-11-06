function reindexar() {
  document.querySelectorAll("#tabla-detalles tbody tr").forEach((fila, i) => {
    fila.querySelectorAll("input").forEach((campo) => {
      campo.name = campo.name.replace(/\[\d+\]/, "[" + i + "]");
      campo.id = campo.name;
    });
  });
}
 
function agregarProducto() {
  const cuerpo = document.querySelector("#tabla-detalles tbody");
  const fila = cuerpo.rows[0].cloneNode(true);
  fila.querySelectorAll("input").forEach((campo) => (campo.value = ""));
  cuerpo.appendChild(fila);
  reindexar();
}
 
function eliminarFila(boton) {
  const cuerpo = document.querySelector("#tabla-detalles tbody");
  if (cuerpo.rows.length > 1) {
    boton.closest("tr").remove();
    reindexar();
  }
}
