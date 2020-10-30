function factorial(n){
  var result = n;
  if(n < 0)
    {
      return null;
    }
  
  else if (n==0 || n==1)
    {
      return '1';
    }
  
  while(n > 1)
    {
      n--;
      result = result * n;
    }
  console.log(result.toString())
  return result.toString();
}