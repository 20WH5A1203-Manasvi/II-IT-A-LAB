public class QuickSort {
private int array[];
private int length;
public void sort(int[] inputArr) {
if (inputArr == null || inputArr.length == 0) {
return;
}
this.array = inputArr;
length = inputArr.length;
quickSort(0, length - 1);
}
private void quickSort(int lowerIndex, int higherIndex) {
int i = lowerIndex;
int j = higherIndex;
int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
while (i <= j) {
while (array[i] < pivot) {
i++;
}
while (array[j] > pivot) {
j--;
}
if (i <= j) {
exchangeNumbers(i, j);
i++;
j--;
}
}
if (lowerIndex < j)
quickSort(lowerIndex, j);
if (i < higherIndex)
quickSort(i, higherIndex);
}
private void exchangeNumbers(int i, int j) {
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}
public static void main(String a[]){
QuickSort sorter = new QuickSort();
int[]input= {84,92,64,20,6,75,2,52,94,55,1};
sorter.sort(input);
for(int i:input){
System.out.print(i);
System.out.print(" ");
}
}
}
