package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class d2 {
    public static d2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static d2 b() {
        if (e == null) {
            e = new d2();
        }
        return e;
    }

    public final c2 a(String str) {
        c();
        c2 c2Var = (c2) this.a.get(str);
        if (c2Var == null) {
            return null;
        }
        c2Var.a = Math.max(c2Var.a, System.currentTimeMillis());
        d();
        return c2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.e.c(new z1(this, 1));
    }

    public final void d() {
        int i10 = 0;
        org.telegram.messenger.i0.r(new z1(this, i10));
        if (this.d) {
            return;
        }
        z1 z1Var = new z1(this, i10);
        boolean z10 = v2.a;
        org.telegram.messenger.i0.h3(z1Var, 1000L);
    }
}
