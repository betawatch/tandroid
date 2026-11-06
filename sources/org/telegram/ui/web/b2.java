package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class b2 {
    public static b2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static b2 b() {
        if (e == null) {
            e = new b2();
        }
        return e;
    }

    public final a2 a(String str) {
        c();
        a2 a2Var = (a2) this.a.get(str);
        if (a2Var == null) {
            return null;
        }
        a2Var.a = Math.max(a2Var.a, System.currentTimeMillis());
        d();
        return a2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.e.c(new x1(this, 1));
    }

    public final void d() {
        int i7 = 0;
        org.telegram.messenger.g0.r(new x1(this, i7));
        if (this.d) {
            return;
        }
        x1 x1Var = new x1(this, i7);
        boolean z9 = r2.a;
        org.telegram.messenger.g0.i3(x1Var, 1000L);
    }
}
