'use strict';

var app = angular.module('app',['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider
        .when('/contacts', {
            templateUrl: 'views/contacts.html',
            controller : "ContactController as ctrl",
            resolve: {
                async: ['ContactService', function(ContactService) {
                    return ContactService.fetchAllItems('contacts');
                }]
            }
        })
        .when('/contact/ivan', {
        	 templateUrl: 'views/contacts.html',
             controller : "ContactController as ctrl",
             resolve: {
                 async: ['ContactService', function(ContactService) {
                     return ContactService.getContact('ivan');
                 }]
             }
        })
		.otherwise({redirectTo: '/'});
}]);