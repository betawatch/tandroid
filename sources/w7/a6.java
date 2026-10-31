package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.r30;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a6 {
    public static void a() {
        SharedPreferences.Editor edit = vp.d1().edit();
        for (r30 r30Var : r30.values()) {
            edit.remove(r30Var.a);
        }
        edit.apply();
    }
}
