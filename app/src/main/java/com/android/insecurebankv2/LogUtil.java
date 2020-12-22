package com.android.insecurebankv2;

public class LogUtil {
    private static boolean DebugMode = true;

    public static void LogOut(String str)
    {
         if(DebugMode == true)
         {
             System.out.println(str);
         }
    }
}
