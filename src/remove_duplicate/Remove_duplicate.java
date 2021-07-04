/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remove_duplicate;

/**
 *
 * @author TEDDY
 */
public class Remove_duplicate {

    public static void main(String[] args) {
        remove_adjacent("abbacd");
    }
    
    private static void remove_adjacent(String str1)
{

  int i = 0;
  do
  {
    int j = i + 1;
    if (str1.charAt(i) == str1.charAt(j)) {
      str1 = str1.substring(0, i) + str1.substring(j + 1, str1.length());
      if (i > 0) i--;
    } else {
      i++;
    }
  }
  while (i < str1.length() - 1);

  System.out.println(str1);
}
}
