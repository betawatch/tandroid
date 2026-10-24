package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class g2 {
    public final int a;
    public boolean b;
    public boolean c;
    public String d;
    public float e;
    public boolean f;
    public boolean g;
    public TLRPC.WebPage h;
    public boolean i;
    public TLRPC.TL_webPage j;
    public int k;
    public a2 l;
    public final ArrayList m = new ArrayList();

    public g2(int i10) {
        this.a = i10;
    }

    public final void a() {
        a2 a2Var;
        if (this.c) {
            return;
        }
        this.c = true;
        if (!this.g) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
        }
        if (this.i || (a2Var = this.l) == null) {
            return;
        }
        a2Var.run();
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!SharedConfig.onlyLocalInstantView && (webPage = this.h) != null) {
            return webPage;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
    }

    public final void d(y0 y0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            i2.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = y0Var.getUrl();
        this.e = y0Var.getProgress();
        this.f = y0Var.b;
        a2 a2Var = this.l;
        if (a2Var != null) {
            a2Var.run();
        }
        this.l = i2.e(y0Var, new f2(this, 1));
    }
}
