import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatrixTest {

    @Test
    public void populate_matrix_3_3() {
        Matrix matrix = new Matrix(3, 3);
        int[][] expected = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        assertTrue(matrix.isEqual(expected));
    }


  @Test
  public void initialize_value_in_matrix_3_3(){
    Matrix matrix = new Matrix(3,3);
    int[][] expected = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
    int value = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrix.initiateValue(i,j,value++);
      }
    }
    assertTrue(matrix.isEqual(expected));
  }
  @Test
  public void initialize_value_as_per_position_in_matrix_3_3(){
    Matrix matrix = new Matrix(3,3);
    int[][] expected = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
    int value = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrix.initiateValue(i,j,value++);
      }
    }
    assertTrue(matrix.isEqual(expected));
  }
  @Test
  public void Checking_valueAt_For_a_Pericular_position(){
    Matrix matrix = new Matrix(3,3);
    int value = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrix.initiateValue(i,j,value++);
      }
    }
    assertEquals(matrix.valueAt(0,0),1);
  }
  @Test
  public void add_two_matrix_2_2(){
    Matrix matrixA = new Matrix(2,2);
    Matrix matrixB = new Matrix(2,2);
    int[][] expected = {{6,8},
                        {10,12}};
    int value = 1;
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        matrixA.initiateValue(i,j,value++);
      }
    }
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        matrixB.initiateValue(i,j,value++);
      }
    }
    Matrix actual = matrixA.addMatrix(matrixB);
    assertEquals(actual.isEqual(expected),true);
  }
  @Test
  public void add_two_matrix_3_3(){
    Matrix matrixA = new Matrix(3,3);
    Matrix matrixB = new Matrix(3,3);
    int[][] expected = {{11,13,15},
                        {17,19,21},
                        {23,25,27}};
    int value = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrixA.initiateValue(i,j,value++);
      }
    }
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrixB.initiateValue(i,j,value++);
      }
    }
    Matrix actual = matrixA.addMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }
  @Test
  public void multiplt_two_matrix_2_2(){
    Matrix matrixA = new Matrix(2,2);
    Matrix matrixB = new Matrix(2,2);
    int[][] expected = {{19,22},
                        {43,50}};
    int value = 1;
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        matrixA.initiateValue(i,j,value++);
      }
    }
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        matrixB.initiateValue(i,j,value++);
      }
    }
    Matrix actual = matrixA.multiplyTwoMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }
  @Test
  public void multiplt_two_matrix_2_2_and_3_3_will_not_multiply(){
    Matrix matrixA = new Matrix(2,2);
    Matrix matrixB = new Matrix(3,3);
    int[][] expected = {{0,0,0},
                        {0,0,0}};
    int value = 1;
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        matrixA.initiateValue(i,j,value++);
      }
    }
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrixB.initiateValue(i,j,value++);
      }
    }
    Matrix actual = matrixA.multiplyTwoMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }
  @Test
  public void multiplt_two_matrix_2_3_and_3_2(){
    Matrix matrixA = new Matrix(2,3);
    Matrix matrixB = new Matrix(3,2);
    int[][] expected = {{22,28},
                        {49,64}};
    int valueA = 1;
    for(int i=0;i<2;i++){
      for(int j=0;j<3;j++){
        matrixA.initiateValue(i,j,valueA++);
      }
    }
    int valueB = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        matrixB.initiateValue(i,j,valueB++);
      }
    }
    Matrix actual = matrixA.multiplyTwoMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }
  @Test
  public void multiply_two_matrix_3_3(){
    Matrix matrixA = new Matrix(3,3);
    Matrix matrixB = new Matrix(3,3);
    int[][] expected = {{84,90,96},
                        {201,216,231},
                        {318,342,366}};
    int value = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrixA.initiateValue(i,j,value++);
      }
    }
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrixB.initiateValue(i,j,value++);
      }
    }
    Matrix actual = matrixA.multiplyTwoMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }
  @Test
  public void multiply_two_matrix_5_5_only_0(){
    Matrix matrixA = new Matrix(5,5);
    Matrix matrixB = new Matrix(5,5);
    int[][] expected = {{0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0}};
    Matrix actual = matrixA.multiplyTwoMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }
  @Test
  public void multiply_two_matrix_3_3_only_for_few_value(){
    Matrix matrixA = new Matrix(3,3);
    Matrix matrixB = new Matrix(3,3);
    int[][] expected = {{25,0,0},
                        {0,25,0},
                        {0,0,25}};
    matrixA.initiateValue(0,0,5);
    matrixA.initiateValue(1,1,5);
    matrixA.initiateValue(2,2,5);
    matrixB.initiateValue(0,0,5);
    matrixB.initiateValue(1,1,5);
    matrixB.initiateValue(2,2,5);

    Matrix actual = matrixA.multiplyTwoMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }
  @Test
  public void multiply_two_matrix_3_3_and_2_2_return_0_0(){
    Matrix matrixA = new Matrix(3,3);
    Matrix matrixB = new Matrix(2,2);
    int[][] expected = {{0,0},
                        {0,0},
                        {0,0}};
    matrixA.initiateValue(0,0,5);
    matrixA.initiateValue(1,1,5);
    matrixA.initiateValue(2,2,5);
    matrixB.initiateValue(0,0,5);
    matrixB.initiateValue(1,1,5);

    Matrix actual = matrixA.multiplyTwoMatrix(matrixB);
    assertTrue(actual.isEqual(expected));
  }

  @Test
  public void determinant_of_A_matrix_returns_one_integer_if_its_square_matrix_of_2by2(){
    Matrix matrixA = new Matrix(2,2);
    int value = 1;
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        matrixA.initiateValue(i,j,value++);
      }
    }
    int result = matrixA.determinant();
    int expected = -2;
    assertEquals(result,expected);
  }

  @Test
  public void determinant_of_A_matrix_returns_one_integer_if_its_square_matrix_of_3by3(){
    Matrix matrixA = new Matrix(3,3);
    int value = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrixA.initiateValue(i,j,value);
      }
    }
    int result = matrixA.determinant();
    int expected = 0;
    assertEquals(result,expected);
  }

  @Test
  public void determinant_of_A_matrix_returns_one_integer_if_its_square_matrix_of_10by10(){
    Matrix matrixA = new Matrix(10,10);
    int value = 1;
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        matrixA.initiateValue(i,j,value);
      }
    }
    int result = matrixA.determinant();
    int expected = 0;
    assertEquals(result,expected);
  }

  @Test
  public void determinant_of_A_matrix_returns_one_integer_if_its_square_matrix_of_3by3_with_1to_9_value(){
    Matrix matrixA = new Matrix(3,3);
    int value = 1;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        matrixA.initiateValue(i,j,value++);
      }
    }
    int result = matrixA.determinant();
    int expected = 0;
    assertEquals(expected,result);
  }

   @Test
  public void determinant_of_A_matrix_returns_one_integer_if_its_square_matrix_of_5by5_different_value(){
    Matrix matrixA = new Matrix(5,5);
    int value = 1;
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        matrixA.initiateValue(i,j,value++);
        if(value == 8) value = 1;
      }
    }
    int result = matrixA.determinant();
    int expected = 343;

    assertEquals(result,expected);
  }

}
