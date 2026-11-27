// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
