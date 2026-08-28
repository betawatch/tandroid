package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i2 {
    public static i2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static i2 b() {
        if (e == null) {
            e = new i2();
        }
        return e;
    }

    public final h2 a(String str) {
        c();
        h2 h2Var = (h2) this.a.get(str);
        if (h2Var == null) {
            return null;
        }
        h2Var.a = Math.max(h2Var.a, System.currentTimeMillis());
        d();
        return h2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new e2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new e2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new e2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
