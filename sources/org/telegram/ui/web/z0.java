package org.telegram.ui.web;

import a8.xa;
import android.graphics.RectF;
import android.os.Bundle;
import fi.l7;
import hi.a5;
import java.io.File;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.y91;
import tg.d2;
import tg.n2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                ((m6) this.b).invalidateSelf();
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
                org.telegram.messenger.g0.g3(new ai.g0(n1Var, length, file3.exists() ? n1.e0(file3, Boolean.TRUE) : 0L, 3));
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
                y91 y91Var = (y91) this.b;
                if (y91Var.getParentLayout() != null) {
                    y91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", y91Var.a);
                    bn bnVar = new bn(bundle);
                    bnVar.Ga = true;
                    y91Var.presentFragment(bnVar);
                    return;
                }
                return;
            case 6:
                ((qf) this.b).v0();
                return;
            case 7:
                uz uzVar = (uz) this.b;
                rh.b bVar = (rh.b) uzVar.c;
                if (bVar == rh.b.b) {
                    uzVar.a(rh.b.a, true);
                    return;
                } else {
                    if (bVar == rh.b.c) {
                        uzVar.a(rh.b.d, true);
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
                ((k5) this.b).i();
                return;
            case 11:
                jn jnVar = ((sg.g0) this.b).b.a;
                if (jnVar != null) {
                    jnVar.l();
                    return;
                }
                return;
            case 12:
                sg.i0 i0Var = ((sg.g0) this.b).b;
                if (i0Var.d == null) {
                    i0Var.L = null;
                    return;
                }
                int currentColor = i0Var.f.getCurrentColor();
                i0Var.l(i0Var.b, false, false);
                xa d = i0Var.d(i0Var.b, currentColor, new RectF(i0Var.h));
                i0Var.b();
                sg.x0 x0Var = i0Var.d;
                RectF rectF = new RectF();
                i0Var.h = rectF;
                x0Var.a(rectF);
                i0Var.p(i0Var.e(x0Var, currentColor, new RectF(i0Var.h)), false);
                i0Var.p(d, false);
                i0Var.e(x0Var, currentColor, null);
                i0Var.d = null;
                i0Var.J = 0.0f;
                i0Var.L = null;
                return;
            case 13:
                ((sg.s0) ((s4.s0) this.b).b).E.a.j();
                return;
            case 14:
                sg.j1 j1Var = ((sg.k1) this.b).a;
                if (j1Var != null) {
                    j1Var.u();
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
                a5 a5Var = (a5) this.b;
                a5Var.y0 = true;
                a5Var.s();
                return;
            case 20:
                si.d0(k10.t0).d(2, null, ((d2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 21:
                org.telegram.messenger.g0.I3(((n2) this.b).r0);
                return;
            case 22:
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
            case 23:
                ab.c0 c0Var = (ab.c0) this.b;
                ((v5.g) ((w5.c) c0Var.e)).f(new tg.o1(c0Var, 7));
                return;
            case 24:
                ug.k0 k0Var = ((ug.d0) this.b).c;
                k0Var.s1.presentFragment(c51.g0(k0Var.o1(), true));
                return;
            case 25:
                rh0 rh0Var = ((ug.r0) this.b).G;
                rh0Var.getAnimatedDrawable().N(0, true, false);
                rh0Var.d();
                return;
            case 26:
                ((ug.y0) ((l7) this.b).c).J0();
                return;
            case 27:
                ug.m1 m1Var = (ug.m1) this.b;
                int size = 1073741823 - (1073741823 % m1Var.f3.size());
                v4.c0 c0Var2 = m1Var.g3;
                m1Var.t3 = size;
                c0Var2.h1(size, (m1Var.getMeasuredHeight() - m1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                m1Var.z1(null, false);
                return;
            case 28:
                ((ug.o1) this.b).invalidate();
                return;
            default:
                ((ug.w1) this.b).a();
                return;
        }
    }
}
