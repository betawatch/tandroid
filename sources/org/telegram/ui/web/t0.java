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
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.no;
import org.telegram.ui.ra1;
import qg.n2;
import qg.x2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nf.f.s(((u0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                f1 f1Var = (f1) this.b;
                Utilities.searchQueue.postRunnable(new fr0(f1Var, new ArrayList(f1Var.h.e), f1Var.h.n));
                return;
            case 2:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 3:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                return;
            case 4:
                y1 y1Var = (y1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += y1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += y1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new no(y1Var, length, file3.exists() ? y1.Z(file3, Boolean.TRUE) : 0L, 1));
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
                ((pk0) this.b).b();
                return;
            case 9:
                k2.u uVar = ((pg.q0) this.b).b.a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            case 10:
                pg.r0 r0Var = ((pg.q0) this.b).b;
                if (r0Var.d == null) {
                    r0Var.L = null;
                    return;
                }
                int currentColor = r0Var.f.getCurrentColor();
                r0Var.l(r0Var.b, false, false);
                a5.a d = r0Var.d(r0Var.b, currentColor, new RectF(r0Var.h));
                r0Var.b();
                pg.g1 g1Var = r0Var.d;
                RectF rectF = new RectF();
                r0Var.h = rectF;
                g1Var.a(rectF);
                r0Var.p(r0Var.e(g1Var, currentColor, new RectF(r0Var.h)), false);
                r0Var.p(d, false);
                r0Var.e(g1Var, currentColor, null);
                r0Var.d = null;
                r0Var.J = 0.0f;
                r0Var.L = null;
                return;
            case 11:
                ((pg.b1) ((l7) this.b).b).y.a.a();
                return;
            case 12:
                pg.t1 t1Var = ((pg.u1) this.b).a;
                if (t1Var != null) {
                    t1Var.e();
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
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((n2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((x2) this.b).q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.b).a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((c6) this.b).d;
                org.telegram.ui.Cells.t1 t1Var2 = cVar2.n;
                if (t1Var2 == null || t1Var2.getDelegate() == null) {
                    return;
                }
                cVar2.n.getDelegate().D1(cVar2.n, false);
                return;
            case 20:
                ((qh.q) this.b).c.Y2.N(true);
                return;
            case 21:
                ((qh.p) this.b).a();
                return;
            case 22:
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
            case 23:
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.b;
                ((s5.g) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 24:
                ((cf.c) this.b).y();
                return;
            case 25:
                rg.j0 j0Var = ((rg.c0) this.b).c;
                j0Var.n.presentFragment(ra1.d0(j0Var.s1(), true));
                return;
            case 26:
                bj0 bj0Var = ((rg.p0) this.b).y;
                bj0Var.getAnimatedDrawable().N(0, true, false);
                bj0Var.d();
                return;
            case 27:
                ((rg.v0) this.b).b.y();
                return;
            case 28:
                rg.o1 o1Var = (rg.o1) this.b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.w1(null, false);
                return;
            default:
                ((rg.q1) this.b).invalidate();
                return;
        }
    }
}
