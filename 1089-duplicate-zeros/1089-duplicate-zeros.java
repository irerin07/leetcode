class Solution {
  public void duplicateZeros(int[] arr) {
    List <Integer> ll = new ArrayList();

    int index=0;

    for(int i=0; i<arr.length; i++) {
      if(arr[i]==0) {
        ll.add(index++,arr[i]);      
        ll.add(index++,0);          
      } else { 
        ll.add(index++,arr[i]); 
      }

      arr[i]=ll.get(i);
    }
  }
}