// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class vye {
    public static SharedPreferences a;

    public static void a(int i) {
        SharedPreferences sharedPreferences = a;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : a.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static boolean b(int i, long j) {
        return a.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i), Long.valueOf(j)), false);
    }

    public static void c(int i, long j) {
        a.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i), Long.valueOf(j)), true).apply();
    }
}
