package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import ci.b6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.oo;
import org.telegram.ui.ta1;
import qg.v2;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nf.f.s(((v0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                g1 g1Var = (g1) this.b;
                Utilities.searchQueue.postRunnable(new in0(g1Var, new ArrayList(g1Var.h.f), g1Var.h.r, 22));
                return;
            case 2:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 3:
                ((org.telegram.ui.Cells.o1) this.b).invalidateSelf();
                return;
            case 4:
                a2 a2Var = (a2) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += a2.Y(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += a2.Y(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new oo(a2Var, length, file3.exists() ? a2.Y(file3, Boolean.TRUE) : 0L, 1));
                return;
            case 5:
                ((boolean[]) this.b)[0] = true;
                return;
            case 6:
                ((p4.e) this.b).k();
                return;
            case 7:
                ((p4.g) this.b).n = -1;
                return;
            case 8:
                ((bl0) this.b).b();
                return;
            case 9:
                l2.g gVar = ((pg.r0) this.b).b.a;
                if (gVar != null) {
                    gVar.V();
                    return;
                }
                return;
            case 10:
                pg.s0 s0Var = ((pg.r0) this.b).b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f.getCurrentColor();
                s0Var.l(s0Var.b, false, false);
                a5.a d = s0Var.d(s0Var.b, currentColor, new RectF(s0Var.h));
                s0Var.b();
                pg.i1 i1Var = s0Var.d;
                RectF rectF = new RectF();
                s0Var.h = rectF;
                i1Var.a(rectF);
                s0Var.p(s0Var.e(i1Var, currentColor, new RectF(s0Var.h)), false);
                s0Var.p(d, false);
                s0Var.e(i1Var, currentColor, null);
                s0Var.d = null;
                s0Var.J = 0.0f;
                s0Var.L = null;
                return;
            case 11:
                ((pg.d1) ((pg.c1) this.b).b).y.a.a();
                return;
            case 12:
                pg.v1 v1Var = ((pg.w1) this.b).a;
                if (v1Var != null) {
                    v1Var.j();
                    return;
                }
                return;
            case 13:
                ph.c cVar = (ph.c) this.b;
                ph.b bVar = cVar.c;
                if (bVar == ph.b.b) {
                    cVar.a(ph.b.a, true);
                    return;
                } else {
                    if (bVar == ph.b.c) {
                        cVar.a(ph.b.d, true);
                        return;
                    }
                    return;
                }
            case 14:
                b6 b6Var = (b6) this.b;
                b6Var.x0 = true;
                b6Var.s();
                return;
            case 15:
                ((View) this.b).performClick();
                return;
            case 16:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((v2) this.b).q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.b).a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((c6) this.b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar2.n;
                if (u1Var == null || u1Var.getDelegate() == null) {
                    return;
                }
                cVar2.n.getDelegate().D1(cVar2.n, false);
                return;
            case 20:
                ((qh.q) this.b).c.f3.N(true);
                return;
            case 21:
                ((qh.p) this.b).a();
                return;
            case 22:
                qi.d dVar = (qi.d) this.b;
                AndroidUtilities.runOnUIThread(new qi.c(dVar.a, dVar.b, 1), 500L);
                return;
            case 23:
                r2.f fVar = (r2.f) this.b;
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                ((s5.g) ((t5.c) sVar.e)).f(new r2.s(sVar, 4));
                return;
            case 25:
                ((cf.c) this.b).s();
                return;
            case 26:
                rg.k0 k0Var = ((rg.d0) this.b).c;
                k0Var.n.presentFragment(ta1.b0(k0Var.s1(), true));
                return;
            case 27:
                nj0 nj0Var = ((rg.q0) this.b).y;
                nj0Var.getAnimatedDrawable().N(0, true, false);
                nj0Var.d();
                return;
            case 28:
                ((rg.w0) this.b).b.y();
                return;
            default:
                rg.q1 q1Var = (rg.q1) this.b;
                int size = 1073741823 - (1073741823 % q1Var.e3.size());
                s4.c0 c0Var = q1Var.f3;
                q1Var.s3 = size;
                c0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.x1(null, false);
                return;
        }
    }
}
