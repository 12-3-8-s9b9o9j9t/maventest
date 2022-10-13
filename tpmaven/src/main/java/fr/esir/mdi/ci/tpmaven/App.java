package fr.esir.mdi.ci.tpmaven;

import com.pushtorefresh.javac_warning_annotation.Warning;

/**
 * Hello world!
 * Test Javadoc en ligne. 
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
  
  
  public static float sum(float a, float b) {
	  return a+b;
  }
  
  public static boolean estTrie(int[] t) {
	  boolean res = true;
	  int a = t.length == 0 ? 0 : t[0];
	  for (int i=0; i<t.length; i++) {
		  res &= a <= t[i];
		  a = t[i];
	  }
	  return res;
  }
  /**
   * Code mort.
   */
  @Warning("ce code est décédé, il devrait se faire incinérer")
  public int codeMort(double c, char cc) {
      int a = 12;
      int b = 69;
      int z = 3;
      if(b<a) {
          return a*b/(a+b) - b%a;
      }
      int k = a+b;
      if(k<0) {
          if(k>0) {
              if(b<a) {
                  if(a == 12) {
                      return 46;
                  }
              }
              return 0;
          }
      }
      if(k<0) {
          if(k>0) {
              if(b<a) {
                  if(a == 12) {
                      return 46;
                  }
              }
              return 0;
          }
      }
      if(k<0) {
          if(k>0) {
              if(b<a) {
                  if(a == 12) {
                      return 46;
                  }
              }
              return 0;
          }
      }
      if(k<0) {
          if(k>0) {
              if(b<a) {
                  if(a == 12) {
                      return 46;
                  }
              }
              return 0;
          }
      }
      if(k<0) {
          if(k>0) {
              if(b<a) {
                  if(a == 12) {
                      return 46;
                  }
              }
              return 0;
          }
      }
      if(k<0) {
          if(k>0) {
              if(b<a) {
                  if(a == 12) {
                      return 46;
                  }
              }
              return 0;
          }
      }
      if(k<0) {
          if(k>0) {
              if(b<a) {
                  if(a == 12) {
                      return 46;
                  }
              }
              return 0;
          }
      }
      return 13;
  }
}
