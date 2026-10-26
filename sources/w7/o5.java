package w7;

import android.content.Context;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class o5 {
    public static s9.a a(String str, String str2) {
        za.a aVar = new za.a(str, str2);
        b2.n0 a2 = s9.a.a(za.a.class);
        a2.b = 1;
        a2.f = new org.telegram.ui.Components.voip.j1(aVar, 10);
        return a2.b();
    }

    public static s9.a b(String str, m4.x0 x0Var) {
        b2.n0 a2 = s9.a.a(za.a.class);
        a2.b = 1;
        a2.a(s9.j.a(Context.class));
        a2.f = new zg1(26, str, x0Var);
        return a2.b();
    }
}
