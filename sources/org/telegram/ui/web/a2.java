package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class a2 {
    public static a2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static a2 b() {
        if (e == null) {
            e = new a2();
        }
        return e;
    }

    public final z1 a(String str) {
        c();
        z1 z1Var = (z1) this.a.get(str);
        if (z1Var == null) {
            return null;
        }
        z1Var.a = Math.max(z1Var.a, System.currentTimeMillis());
        d();
        return z1Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.e.c(new w1(this, 1));
    }

    public final void d() {
        int i7 = 0;
        org.telegram.messenger.g0.r(new w1(this, i7));
        if (this.d) {
            return;
        }
        w1 w1Var = new w1(this, i7);
        boolean z10 = s2.a;
        org.telegram.messenger.g0.h3(w1Var, 1000L);
    }
}
