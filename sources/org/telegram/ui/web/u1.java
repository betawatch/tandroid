package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class u1 {
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
    public m5 l;
    public final ArrayList m = new ArrayList();

    public u1(int i7) {
        this.a = i7;
    }

    public final void a() {
        m5 m5Var;
        if (this.c) {
            return;
        }
        this.c = true;
        if (!this.g) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
        }
        if (this.i || (m5Var = this.l) == null) {
            return;
        }
        m5Var.run();
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!iz.w0 && (webPage = this.h) != null) {
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
    }

    public final void d(u0 u0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            w1.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = u0Var.getUrl();
        this.e = u0Var.getProgress();
        this.f = u0Var.b;
        m5 m5Var = this.l;
        if (m5Var != null) {
            m5Var.run();
        }
        this.l = w1.e(u0Var, new t1(this, 1));
    }
}
