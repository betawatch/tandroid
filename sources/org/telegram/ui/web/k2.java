package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class k2 {
    public static k2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static k2 b() {
        if (e == null) {
            e = new k2();
        }
        return e;
    }

    public final j2 a(String str) {
        c();
        j2 j2Var = (j2) this.a.get(str);
        if (j2Var == null) {
            return null;
        }
        j2Var.a = Math.max(j2Var.a, System.currentTimeMillis());
        d();
        return j2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new g2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new g2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
