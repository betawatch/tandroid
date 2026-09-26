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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.mo;
import org.telegram.ui.sa1;
import qg.v2;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((cu) this.b).requestFocus();
                return;
            case 1:
                nf.f.s(((u0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                f1 f1Var = (f1) this.b;
                Utilities.searchQueue.postRunnable(new cn0(f1Var, new ArrayList(f1Var.h.e), f1Var.h.n, 22));
                return;
            case 3:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 4:
                ((org.telegram.ui.Cells.o1) this.b).invalidateSelf();
                return;
            case 5:
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
                AndroidUtilities.runOnUIThread(new mo(z1Var, length, file3.exists() ? z1.Z(file3, Boolean.TRUE) : 0L, 1));
                return;
            case 6:
                ((boolean[]) this.b)[0] = true;
                return;
            case 7:
                ((p4.e) this.b).k();
                return;
            case 8:
                ((p4.g) this.b).n = -1;
                return;
            case 9:
                ((zk0) this.b).b();
                return;
            case 10:
                n2.e eVar = ((pg.r0) this.b).b.a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            case 11:
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
            case 12:
                ((pg.d1) ((pg.c1) this.b).b).y.a.a();
                return;
            case 13:
                pg.v1 v1Var = ((pg.w1) this.b).a;
                if (v1Var != null) {
                    v1Var.e();
                    return;
                }
                return;
            case 14:
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
            case 15:
                b6 b6Var = (b6) this.b;
                b6Var.x0 = true;
                b6Var.s();
                return;
            case 16:
                ((View) this.b).performClick();
                return;
            case 17:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((qg.l2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                AndroidUtilities.showKeyboard(((v2) this.b).q0);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((qh.c) this.b).a);
                return;
            case 20:
                qh.c cVar2 = (qh.c) ((c6) this.b).d;
                org.telegram.ui.Cells.u1 u1Var = cVar2.n;
                if (u1Var == null || u1Var.getDelegate() == null) {
                    return;
                }
                cVar2.n.getDelegate().D1(cVar2.n, false);
                return;
            case 21:
                ((qh.q) this.b).c.Y2.N(true);
                return;
            case 22:
                ((qh.p) this.b).a();
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
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.b;
                ((s5.h) ((t5.c) tVar.e)).f(new r5.d(tVar, 2));
                return;
            case 25:
                ((cf.c) this.b).z();
                return;
            case 26:
                rg.j0 j0Var = ((rg.c0) this.b).c;
                j0Var.n.presentFragment(sa1.d0(j0Var.s1(), true));
                return;
            case 27:
                lj0 lj0Var = ((rg.p0) this.b).y;
                lj0Var.getAnimatedDrawable().N(0, true, false);
                lj0Var.d();
                return;
            case 28:
                ((rg.v0) this.b).b.y();
                return;
            default:
                rg.o1 o1Var = (rg.o1) this.b;
                int size = 1073741823 - (1073741823 % o1Var.X2.size());
                s4.c0 c0Var = o1Var.Y2;
                o1Var.l3 = size;
                c0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.w1(null, false);
                return;
        }
    }
}
