(function (ng) {

    var mod = ng.module("mainApp", [
        "ui.router",
        "ngAnimate",
        "ui.bootstrap",
        "itinerarioModule",
        "planDiaModule",
        "multimediaModule",
        "eventoModule",
        "viajeroModule",
        "mapsApp",
        "inicioSesionModule",
        "inicioSesionMock"
    ]);

    mod.config(['$logProvider', function ($logProvider) {
            $logProvider.debugEnabled(true);
        }]);

    mod.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
            $urlRouterProvider.otherwise("/");
            $stateProvider
                    .state('/', {
                        url: '/',
                        controller: 'inicioSesionController',
                        templateUrl: "src/modules/iniciosesion/iniciosesion.tpl.html"
                    })
                    .state('viajero', {
                        url: '/viajero',
                        controller: 'ViajeroC',
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/viajero/viajero.tpl.html"
                    })
                    .state('viajero.itinerario', {
                        views: {
                            "itinerario": {
                                url: '\itinerario',
                                controller: 'ItinerarioController',
                                controllerAs: "ctrl",
                                templateUrl: "src/modules/itinerario/itinerario.tpl.html"
                            }
                        },
                        parent: "viajero"
                    })
                    .state('viajero.multimedia', {
                        views: {
                            "multimedia": {
                                url: '\multimedia',
                                controller: 'multimediaCtrl',
                                templateUrl: "src/modules/multimedia/multimedia.tpl.html"
                            }
                        },
                        parent: "viajero"
                    })
                    .state('viajero.itinerario.plandia', {
                        views: {
                            "plandia": {
                                url: '\plandia',
                                controller: 'PlanDiaController',
                                templateUrl: "src/modules/plandia/plandia.tpl.html"
                            }
                        },
                        parent: "viajero.itinerario"
                    })
                    .state('itinerario', {
                        url: '/itinerario',
                        controller: 'ItinerarioController',
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/itinerario/itinerario.tpl.html",
                    })
                    .state('plandia', {
                        url: '/plandia',
                        templateUrl: "src/modules/plandia/plandia.tpl.html",
                        controller: 'PlanDiaController'
                    })
                    .state('multimedia', {
                        url: '/multimedia',
                        controller: 'multimediaCtrl',
                        templateUrl: "src/modules/multimedia/multimedia.tpl.html"
                    })
                    .state('evento', {
                        url: '/evento',
                        controller: 'EventosController',
                        templateUrl: "src/modules/evento/evento.tpl.html",
                    });
        }]);
})(window.angular);
