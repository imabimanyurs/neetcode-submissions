class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> score = new ArrayDeque<>();
        int sum=0;

        for(int i=0;i<operations.length;i++){
        switch(operations[i]){
        case "+":{
            int latest = score.pop();
            int previous = score.peek();

            score.push(latest);            
            score.push(latest + previous);  
            break;}

        case "D":{
            int n = 2*score.peek();
            score.push(n);
            break;}
            

        case "C":
            score.pop();
            break;

        default:{
            int n = Integer.parseInt(operations[i]);
            score.push(n);
            break;}
    }

            }
           for(int n: score){
            sum+=n;
           }

           return sum;
        }
        
    }
