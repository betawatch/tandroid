package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p2 {
    public static p2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static p2 b() {
        if (e == null) {
            e = new p2();
        }
        return e;
    }

    public final o2 a(String str) {
        c();
        o2 o2Var = (o2) this.a.get(str);
        if (o2Var == null) {
            return null;
        }
        o2Var.a = Math.max(o2Var.a, System.currentTimeMillis());
        d();
        return o2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new l2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new l2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new l2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
