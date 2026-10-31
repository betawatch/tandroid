package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.tz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.w5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class w1 {
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
    public w5 l;
    public final ArrayList m = new ArrayList();

    public w1(int i10) {
        this.a = i10;
    }

    public final void a() {
        w5 w5Var;
        if (this.c) {
            return;
        }
        this.c = true;
        if (!this.g) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
        }
        if (this.i || (w5Var = this.l) == null) {
            return;
        }
        w5Var.run();
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!tz.w0 && (webPage = this.h) != null) {
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

    public final void d(v0 v0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            y1.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = v0Var.getUrl();
        this.e = v0Var.getProgress();
        this.f = v0Var.b;
        w5 w5Var = this.l;
        if (w5Var != null) {
            w5Var.run();
        }
        this.l = y1.e(v0Var, new u1(this, 1));
    }
}
