'use strict';

app.factory('ContactService',['$http', '$q', function($http, $q){
	
	return {
		fetchAllItems: function(category) {
			console.log('fetchAllItems');
			return $http.get('contacts')
				.then(
						function(response){
							return response.data;
						},
						function(errResponse){
							console.error("Error in fetchAllItems");
							return $q.reject(errResponse);
						}
				);
		},
		
		getContact: function(firstName) {
			console.log('getContact');
			return $http.get('contact/' + firstName)
				.then(
						function(response){
							return response.data;
						},
						function(errResponse){
							console.error("Error in fetchAllItems");
							return $q.reject(errResponse);
						});
		}
	
	};
}]);