            tempNum /= 10;
        }
        int n = arr.size();
        //System.out.println("Length of string: " + n);
        
        for(int i = 0; i < n; i++){
        //System.out.println("Value of i: " + i + " ; " + arr.get(n-1-i));
            if(arr.get(i) == arr.get(n-1-i))
              continue;
            arr.add(tempNum % 10);
            else
              return false;
        }
        return true;
    }
}
        while(tempNum > 0 ) {