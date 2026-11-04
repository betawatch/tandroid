package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class s1 {
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
    public d4 l;
    public final ArrayList m = new ArrayList();

    public s1(int i3) {
        this.a = i3;
    }

    public final void a() {
        d4 d4Var;
        if (this.c) {
            return;
        }
        this.c = true;
        if (!this.g) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
        }
        if (this.i || (d4Var = this.l) == null) {
            return;
        }
        d4Var.run();
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!az.w0 && (webPage = this.h) != null) {
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
    }

    public final void d(t0 t0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            u1.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = t0Var.getUrl();
        this.e = t0Var.getProgress();
        this.f = t0Var.b;
        d4 d4Var = this.l;
        if (d4Var != null) {
            d4Var.run();
        }
        this.l = u1.e(t0Var, new r1(this, 1));
    }
}
