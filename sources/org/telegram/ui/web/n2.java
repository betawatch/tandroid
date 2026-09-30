package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class n2 {
    public static n2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static n2 b() {
        if (e == null) {
            e = new n2();
        }
        return e;
    }

    public final m2 a(String str) {
        c();
        m2 m2Var = (m2) this.a.get(str);
        if (m2Var == null) {
            return null;
        }
        m2Var.a = Math.max(m2Var.a, System.currentTimeMillis());
        d();
        return m2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new j2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new j2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new j2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
