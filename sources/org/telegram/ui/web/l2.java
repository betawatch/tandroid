package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class l2 {
    public static l2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static l2 b() {
        if (e == null) {
            e = new l2();
        }
        return e;
    }

    public final k2 a(String str) {
        c();
        k2 k2Var = (k2) this.a.get(str);
        if (k2Var == null) {
            return null;
        }
        k2Var.a = Math.max(k2Var.a, System.currentTimeMillis());
        d();
        return k2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new h2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new h2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new h2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
