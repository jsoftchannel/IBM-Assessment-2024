IBM Test/Realtime Assessment 2023|2024
===============================================
Answer for the question No.1
===============================================
class Result{

		public static List<String> getResponses(List<String> valid_auth_tokens, List<List<String>> requests){
			//write your code here
			List<String> responses = new ArrayList<>();
			for(List<String> request : requests){
				
				String authToken = request.get(0);
				if(valid_auth_tokens.contains(authToken)){
					String response = processRequest(request);
					responses.add(response);
				}
				else{
					responses.add("Invalid Token");
				}
			}
		return responses;
		private Static String processRequest(List<String> request){
				return "Processed: " + String.join(", ", request);
			}

		}
}

===============================================
Answer for the question No.2
===============================================

//complete the countNumbers function below. 
static void countNumbers(List<List<Integer>> arr){
	Map<Integer,Integer> frequencyMap = new HashMap<>();
	
	for(List<Integer> row : arr){
		for(Integer number : row){
			frequencyMap.put(number, frequencyMap.getOrDefault(number,0) +1);			
		}		
	}
	for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
		System.out.println(entry.getKey() + " " + entry.getValue());
	}
}






















































