package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class o2 {
    public static o2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static o2 b() {
        if (e == null) {
            e = new o2();
        }
        return e;
    }

    public final n2 a(String str) {
        c();
        n2 n2Var = (n2) this.a.get(str);
        if (n2Var == null) {
            return null;
        }
        n2Var.a = Math.max(n2Var.a, System.currentTimeMillis());
        d();
        return n2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new k2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new k2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new k2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
