package org.telegram.ui.web;

import a8.xa;
import android.graphics.RectF;
import android.os.Bundle;
import fi.l7;
import java.io.File;
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.b51;
import org.telegram.ui.bn;
import org.telegram.ui.vp0;
import org.telegram.ui.w91;
import tg.g2;
import tg.q2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 1:
                ((n6) this.b).invalidateSelf();
                return;
            case 2:
                n1 n1Var = (n1) this.b;
                File databasePath = org.telegram.messenger.t0.b.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = org.telegram.messenger.t0.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += n1.e0(file, Boolean.FALSE);
                }
                File file2 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += n1.e0(file2, null);
                }
                File file3 = new File(org.telegram.messenger.t0.b.getApplicationInfo().dataDir, "app_webview");
                org.telegram.messenger.g0.g3(new ai.c0(n1Var, length, file3.exists() ? n1.e0(file3, Boolean.TRUE) : 0L, 3));
                return;
            case 3:
                q2.d dVar = (q2.d) this.b;
                if (dVar.c) {
                    return;
                }
                q2.g gVar = dVar.b;
                if (gVar != null) {
                    gVar.c(dVar.a);
                }
                dVar.d.y.remove(dVar);
                dVar.c = true;
                return;
            case 4:
                ((q2.b) this.b).c(null);
                return;
            case 5:
                w91 w91Var = (w91) this.b;
                if (w91Var.getParentLayout() != null) {
                    w91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", w91Var.a);
                    bn bnVar = new bn(bundle);
                    bnVar.Ga = true;
                    w91Var.presentFragment(bnVar);
                    return;
                }
                return;
            case 6:
                ((aa) this.b).H2();
                return;
            case 7:
                rz rzVar = (rz) this.b;
                rh.b bVar = (rh.b) rzVar.c;
                if (bVar == rh.b.b) {
                    rzVar.a(rh.b.a, true);
                    return;
                } else {
                    if (bVar == rh.b.c) {
                        rzVar.a(rh.b.d, true);
                        return;
                    }
                    return;
                }
            case 8:
                ((s4.e) this.b).k();
                return;
            case 9:
                ((s4.g) this.b).n = -1;
                return;
            case 10:
                ((l5) this.b).i();
                return;
            case 11:
                nd0 nd0Var = ((sg.g0) this.b).b.a;
                if (nd0Var != null) {
                    nd0Var.p();
                    return;
                }
                return;
            case 12:
                sg.h0 h0Var = ((sg.g0) this.b).b;
                if (h0Var.d == null) {
                    h0Var.L = null;
                    return;
                }
                int currentColor = h0Var.f.getCurrentColor();
                h0Var.l(h0Var.b, false, false);
                xa d = h0Var.d(h0Var.b, currentColor, new RectF(h0Var.h));
                h0Var.b();
                sg.w0 w0Var = h0Var.d;
                RectF rectF = new RectF();
                h0Var.h = rectF;
                w0Var.a(rectF);
                h0Var.p(h0Var.e(w0Var, currentColor, new RectF(h0Var.h)), false);
                h0Var.p(d, false);
                h0Var.e(w0Var, currentColor, null);
                h0Var.d = null;
                h0Var.J = 0.0f;
                h0Var.L = null;
                return;
            case 13:
                ((sg.r0) ((o5) this.b).b).E.a.h();
                return;
            case 14:
                sg.i1 i1Var = ((sg.j1) this.b).a;
                if (i1Var != null) {
                    i1Var.v();
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.I3(((sh.b) this.b).a);
                return;
            case 16:
                sh.b bVar2 = (sh.b) ((bi.u) this.b).f2;
                org.telegram.ui.Cells.r1 r1Var = bVar2.n;
                if (r1Var == null || r1Var.getDelegate() == null) {
                    return;
                }
                bVar2.n.getDelegate().F1(bVar2.n, false);
                return;
            case 17:
                ((sh.n) this.b).c.g3.O(true);
                return;
            case 18:
                ((sh.m) this.b).a();
                return;
            case 19:
                tg.b0 b0Var = ((vp0) this.b).K1;
                if (b0Var != null) {
                    b0Var.O0();
                    return;
                }
                return;
            case 20:
                hi.l5 l5Var = (hi.l5) this.b;
                l5Var.z0 = true;
                l5Var.s();
                return;
            case 21:
                ri.d0(i10.t0).d(2, null, ((g2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 22:
                org.telegram.messenger.g0.I3(((q2) this.b).s0);
                return;
            case 23:
                u2.f fVar = (u2.f) this.b;
                synchronized (fVar.a) {
                    try {
                        if (fVar.m) {
                            return;
                        }
                        long j3 = fVar.l - 1;
                        fVar.l = j3;
                        if (j3 > 0) {
                            return;
                        }
                        if (j3 < 0) {
                            fVar.c(new IllegalStateException());
                            return;
                        } else {
                            fVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 24:
                ab.c0 c0Var = (ab.c0) this.b;
                ((v5.g) ((w5.c) c0Var.e)).f(new tg.s(c0Var, 9));
                return;
            case 25:
                ug.k0 k0Var = ((ug.d0) this.b).c;
                k0Var.s1.presentFragment(b51.g0(k0Var.o1(), true));
                return;
            case 26:
                qh0 qh0Var = ((ug.r0) this.b).G;
                qh0Var.getAnimatedDrawable().N(0, true, false);
                qh0Var.d();
                return;
            case 27:
                ((ug.y0) ((l7) this.b).c).J0();
                return;
            case 28:
                ug.m1 m1Var = (ug.m1) this.b;
                int size = 1073741823 - (1073741823 % m1Var.f3.size());
                v4.c0 c0Var2 = m1Var.g3;
                m1Var.t3 = size;
                c0Var2.h1(size, (m1Var.getMeasuredHeight() - m1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                m1Var.z1(null, false);
                return;
            default:
                ((ug.o1) this.b).invalidate();
                return;
        }
    }
}
