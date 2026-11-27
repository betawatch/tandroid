// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
