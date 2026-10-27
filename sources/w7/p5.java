package w7;

import android.content.Context;
import org.telegram.ui.bh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class p5 {
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
        a2.a(s9.k.a(Context.class));
        a2.f = new bh1(26, str, x0Var);
        return a2.b();
    }
}
