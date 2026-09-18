package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import ci.c6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.ab1;
import org.telegram.ui.ro;
import qg.x2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                Utilities.searchQueue.postRunnable(new gr0(g1Var, new ArrayList(g1Var.h.f), g1Var.h.r));
                return;
            case 2:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 3:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                return;
            case 4:
                z1 z1Var = (z1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += z1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += z1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new ro(z1Var, length, file3.exists() ? z1.Z(file3, Boolean.TRUE) : 0L, 1));
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
                k2.u uVar = ((pg.p0) this.b).b.a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            case 10:
                pg.q0 q0Var = ((pg.p0) this.b).b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f.getCurrentColor();
                q0Var.l(q0Var.b, false, false);
                a5.a d = q0Var.d(q0Var.b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                pg.f1 f1Var = q0Var.d;
                RectF rectF = new RectF();
                q0Var.h = rectF;
                f1Var.a(rectF);
                q0Var.p(q0Var.e(f1Var, currentColor, new RectF(q0Var.h)), false);
                q0Var.p(d, false);
                q0Var.e(f1Var, currentColor, null);
                q0Var.d = null;
                q0Var.J = 0.0f;
                q0Var.L = null;
                return;
            case 11:
                ((pg.a1) ((l7) this.b).b).y.a.a();
                return;
            case 12:
                pg.s1 s1Var = ((pg.t1) this.b).a;
                if (s1Var != null) {
                    s1Var.e();
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
                c6 c6Var = (c6) this.b;
                c6Var.x0 = true;
                c6Var.s();
                return;
            case 15:
                ((View) this.b).performClick();
                return;
            case 16:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.n2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 17:
                AndroidUtilities.showKeyboard(((x2) this.b).q0);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((qh.c) this.b).a);
                return;
            case 19:
                qh.c cVar2 = (qh.c) ((b6) this.b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar2.n;
                if (t1Var == null || t1Var.getDelegate() == null) {
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
                j0Var.n.presentFragment(ab1.d0(j0Var.s1(), true));
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
                o1Var.x1(null, false);
                return;
            default:
                ((rg.q1) this.b).invalidate();
                return;
        }
    }
}
