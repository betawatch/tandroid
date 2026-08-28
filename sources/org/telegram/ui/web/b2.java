package org.telegram.ui.web;

import java.util.ArrayList;
import mh.m2;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b2 {
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
    public m2 l;
    public final ArrayList m = new ArrayList();

    public b2(int i9) {
        this.a = i9;
    }

    public final void a() {
        m2 m2Var;
        if (this.c) {
            return;
        }
        this.c = true;
        if (!this.g) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.k, true);
        }
        if (this.i || (m2Var = this.l) == null) {
            return;
        }
        m2Var.run();
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
    }

    public final void d(v0 v0Var) {
        if (this.c) {
            return;
        }
        TLRPC.TL_webPage tL_webPage = this.j;
        if (tL_webPage != null) {
            d2.o(tL_webPage);
            this.j = null;
        }
        this.i = false;
        this.d = v0Var.getUrl();
        this.e = v0Var.getProgress();
        this.f = v0Var.b;
        m2 m2Var = this.l;
        if (m2Var != null) {
            m2Var.run();
        }
        this.l = d2.e(v0Var, new a2(this, 1));
    }
}
