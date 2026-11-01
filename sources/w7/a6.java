package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.r30;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class a6 {
    public static void a() {
        SharedPreferences.Editor edit = wp.d1().edit();
        for (r30 r30Var : r30.values()) {
            edit.remove(r30Var.a);
        }
        edit.apply();
    }
}
