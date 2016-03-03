import java.util.Arrays;

public class Matrix {
  private int[][] matrix;
  private int row;
  private int column;

  public Matrix(int row,int column) {
    this.matrix = new int[row][column];
    this.row = row;
    this.column = column;
  }

  public boolean isEqual(int[][] expected){
    return Arrays.deepEquals(this.matrix,expected);
  };

  public void initiateValue(int row,int column,int value){
      this.matrix[row][column] = value;
  };

  public int valueAt(int row, int column){
    return this.matrix[row][column];
  };

  public String toString(){
    String matrix = "\n";
    for(int i = 0 ; i < this.row ; i++){
      String column = "";
      for(int j = 0 ; j < this.column ; j++){
        column +="  "+ this.matrix[i][j];
      }
      matrix += column+"\n";
    }
    return matrix;
  }

  public Matrix addMatrix(Matrix another){
    Matrix result = new Matrix(this.row,this.column);
    int value;
    for(int i=0;i<this.row;i++){
      for(int j=0;j<this.column;j++){
        value = this.valueAt(i,j) + another.valueAt(i,j);
        result.initiateValue(i,j,value);
      }
    }
    return result;
  };

  public Matrix multiplyTwoMatrix(Matrix another){
    Matrix result = new Matrix(this.row,another.column);
    int sum = 0;
    if(this.row == another.column){
      for (int c = 0 ; c < this.row ; c++ ){
          for (int d = 0 ; d < another.column ; d++ ){
             for (int k = 0 ; k < another.row ; k++ ){
                sum = sum + this.valueAt(c,k)*another.valueAt(k,d);
             }
             result.initiateValue(c,d,sum);
             sum = 0;
          }
       }
    }
    return result;
  }

  private Matrix subMatrix(int index){
    int rowPosition = 0,columnPosition = 0;
    Matrix x = new Matrix(this.row-1,this.column-1);
    for(int i=1;i<this.row;i++,rowPosition++,columnPosition=0){
      for(int j=0;j<this.column;j++){
        if(j != index){
          x.initiateValue(rowPosition,columnPosition,this.valueAt(i,j));
          columnPosition++;
        }
      }
    }
    return x;
  }

  private int getSign(int number){
    return number%2==0?1:(-1);
  }

  public int determinant(){
    int result = 0;
    if(this.row == 2 && this.column == 2){
      return (this.valueAt(0,0)*this.valueAt(1,1)) - (this.valueAt(1,0)*this.valueAt(0,1));
    }
    if(this.row == this.column){
      for(int r=0;r<this.row;r++){
        Matrix x = this.subMatrix(r);
        int value = x.determinant();
        result += getSign(r)*this.valueAt(0,r)*value;
      }
    }
    return result;
  }
}
