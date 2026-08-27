package org.telegram.ui.web;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j2 {
    public static j2 e;
    public HashMap a;
    public boolean b;
    public boolean c;
    public boolean d;

    public static j2 b() {
        if (e == null) {
            e = new j2();
        }
        return e;
    }

    public final i2 a(String str) {
        c();
        i2 i2Var = (i2) this.a.get(str);
        if (i2Var == null) {
            return null;
        }
        i2Var.a = Math.max(i2Var.a, System.currentTimeMillis());
        d();
        return i2Var;
    }

    public final void c() {
        if (this.b || this.c) {
            return;
        }
        this.c = true;
        if (this.a == null) {
            this.a = new HashMap();
        }
        Utilities.globalQueue.postRunnable(new f2(this, 1));
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(new f2(this, 0));
        if (this.d) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f2(this, 0), BuildVars.DEBUG_PRIVATE_VERSION ? 1L : 1000L);
    }
}
