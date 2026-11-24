// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class qje {
    public static void a() {
        SharedPreferences.Editor edit = na7.c1().edit();
        for (le5 le5Var : le5.values()) {
            edit.remove(le5Var.a);
        }
        edit.apply();
    }
}
