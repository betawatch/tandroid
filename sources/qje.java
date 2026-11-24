// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
