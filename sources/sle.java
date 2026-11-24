// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class sle {
    public static void a() {
        SharedPreferences.Editor edit = oc7.d1().edit();
        for (jg5 jg5Var : jg5.values()) {
            edit.remove(jg5Var.a);
        }
        edit.apply();
    }
}
