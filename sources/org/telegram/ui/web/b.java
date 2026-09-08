package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.c6;
import java.io.File;
import java.util.ArrayList;
import ji.k5;
import ji.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.bb1;
import org.telegram.ui.so;
import rg.x2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((l) this.b).w.Y2.N(true);
                return;
            case 1:
                j jVar = ((p) this.b).h.e;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            case 2:
                ((zt) this.b).requestFocus();
                return;
            case 3:
                of.f.s(((v0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 4:
                h1 h1Var = (h1) this.b;
                Utilities.searchQueue.postRunnable(new er0(h1Var, new ArrayList(h1Var.h.e), h1Var.h.n));
                return;
            case 5:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 6:
                ((org.telegram.ui.Cells.n1) this.b).invalidateSelf();
                return;
            case 7:
                a2 a2Var = (a2) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += a2.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += a2.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new so(a2Var, length, file3.exists() ? a2.Z(file3, Boolean.TRUE) : 0L, 1));
                return;
            case 8:
                ((boolean[]) this.b)[0] = true;
                return;
            case 9:
                ((p4.e) this.b).k();
                return;
            case 10:
                ((p4.g) this.b).n = -1;
                return;
            case 11:
                ((ok0) this.b).b();
                return;
            case 12:
                u4 u4Var = ((qg.p0) this.b).b.a;
                if (u4Var != null) {
                    u4Var.n();
                    return;
                }
                return;
            case 13:
                qg.q0 q0Var = ((qg.p0) this.b).b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f.getCurrentColor();
                q0Var.l(q0Var.b, false, false);
                a5.a d = q0Var.d(q0Var.b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                qg.f1 f1Var = q0Var.d;
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
            case 14:
                ((qg.a1) ((l7) this.b).b).y.a.a();
                return;
            case 15:
                qg.s1 s1Var = ((qg.t1) this.b).a;
                if (s1Var != null) {
                    s1Var.f();
                    return;
                }
                return;
            case 16:
                qh.c cVar = (qh.c) this.b;
                qh.b bVar = cVar.c;
                if (bVar == qh.b.b) {
                    cVar.a(qh.b.a, true);
                    return;
                } else {
                    if (bVar == qh.b.c) {
                        cVar.a(qh.b.d, true);
                        return;
                    }
                    return;
                }
            case 17:
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
            case 18:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                ((s5.g) ((t5.c) sVar.e)).f(new k5(sVar, 22));
                return;
            case 19:
                c6 c6Var = (c6) this.b;
                c6Var.x0 = true;
                c6Var.s();
                return;
            case 20:
                ((View) this.b).performClick();
                return;
            case 21:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.m2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 22:
                AndroidUtilities.showKeyboard(((x2) this.b).q0);
                return;
            case 23:
                AndroidUtilities.showKeyboard(((rh.c) this.b).a);
                return;
            case 24:
                rh.c cVar2 = (rh.c) ((b6) this.b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar2.n;
                if (t1Var == null || t1Var.getDelegate() == null) {
                    return;
                }
                cVar2.n.getDelegate().w1(cVar2.n, false);
                return;
            case 25:
                ((rh.q) this.b).c.Y2.N(true);
                return;
            case 26:
                ((rh.p) this.b).a();
                return;
            case 27:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 28:
                ((cf.c) this.b).v();
                return;
            default:
                sg.k0 k0Var = ((sg.d0) this.b).c;
                k0Var.n.presentFragment(bb1.d0(k0Var.s1(), true));
                return;
        }
    }
}
