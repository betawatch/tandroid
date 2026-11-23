package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class t1 {
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
    public ai.s l;
    public final ArrayList m = new ArrayList();

    public t1(int i7) {
        this.a = i7;
    }

    public final void a() {
        ai.s sVar;
        if (this.c) {
            return;
        }
        this.c = true;
        if (!this.g) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
        }
        if (this.i || (sVar = this.l) == null) {
            return;
        }
        sVar.run();
    }

    public final TLRPC.WebPage b() {
        TLRPC.WebPage webPage;
        if (!cz.w0 && (webPage = this.h) != null) {
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

    public final void d(s0 s0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            v1.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = s0Var.getUrl();
        this.e = s0Var.getProgress();
        this.f = s0Var.b;
        ai.s sVar = this.l;
        if (sVar != null) {
            sVar.run();
        }
        this.l = v1.e(s0Var, new s1(this, 1));
    }
}
