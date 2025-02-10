package searchtargetinlargedatasetTest;
import org.example.searchtargetinlargedataset.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class SearchTargetTest {
    @Test
    public void linear() {
        int[] arr = {98, 65, 34, 56, 78, 32, 45, 782, 3, 7, 9, 1};
        int actual = SearchTarget.linearSearch(arr, 1);
        int expected = 11;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void binary(){
        int[] arr = {98, 65, 34, 56, 78, 32, 45, 782, 3, 7, 9, 1};
        Arrays.sort(arr);
        int actual = SearchTarget.binarySearch(arr, 782);
        int expected = arr.length-1;
        Assertions.assertEquals(expected, actual);
    }

}
