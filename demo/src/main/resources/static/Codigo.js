var app = new Vue({
    el: '#app',
    data: {
        titulo: 'Asignación de cursos',
        Profesor:[
            {nombre: 'Docu A', cantidad: 5},
            {nombre: 'Docente B', cantidad: 0},
            {nombre: 'Dol C', cantidad: 8}
        ],
        profesor_asignado: '',
        Curso:[
          {nombre: 'Curso 1', seccion: 'A', horarioI:'8', horarioF: '12'},
          {nombre: 'Curso 2', seccion: 'B', horarioI:'13', horarioF: '15'},
          {nombre: 'Curso 3', seccion: 'C', horarioI:'18', horarioF: '20'}
        ],
        Curso_asignado:'',
        Secciones:[
          {seccion: 'A'},
          {seccion: 'B'},
          {seccion: 'C'},
        ],
        seccion_asignada:'',
        Horario:[
          {id:'1', HorarioI:'16', HorarioF:'18'},
          {id:'2',HorarioI:'20', HorarioF:'22'},
          {id:'3',HorarioI:'8', HorarioF:'12'}
        ],
        horario_asignado:'',
    },
    computed: {
        computedList: function () {
          var vm = this
          return this.Profesor.filter(function (item) {
            return item.nombre.toLowerCase().indexOf(vm.profesor_asignado.toLowerCase()) !== -1
          })
        },
        computedList2: function () {
          var vm2 = this
          return this.Curso.filter(function (item) {
            return item.nombre.toLowerCase().indexOf(vm2.Curso_asignado.toLowerCase()) !== -1
          })
        },
        computedList3: function () {
          var vm3 = this
          return this.Secciones.filter(function (item) {
            return item.seccion.toLowerCase().indexOf(vm3.seccion_asignada.toLowerCase()) !== -1
          })
        },
        computedList4: function () {
          var vm = this
          return this.Horario.filter(function (item) {
            return item.id.toLowerCase().indexOf(vm.horario_asignado.toLowerCase()) !== -1
          })
        },
      },
  })