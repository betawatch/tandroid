package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class m2 {
    public static m2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static m2 b() {
        if (e == null) {
            e = new m2();
        }
        return e;
    }

    public final l2 a(String str) {
        c();
        l2 l2Var = (l2) this.a.get(str);
        if (l2Var == null) {
            return null;
        }
        l2Var.a = Math.max(l2Var.a, System.currentTimeMillis());
        d();
        return l2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new i2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new i2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new i2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
