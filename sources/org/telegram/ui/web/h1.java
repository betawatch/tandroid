package org.telegram.ui.web;

import a8.ng;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.q5;
import java.io.File;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.cf1;
import org.telegram.ui.ko;
import org.telegram.ui.wn;
import org.telegram.ui.y91;
import sg.w2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            case 1:
                ((org.telegram.ui.Cells.m1) this.b).invalidateSelf();
                return;
            case 2:
                y1 y1Var = (y1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += y1.a0(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += y1.a0(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new ko(y1Var, length, file3.exists() ? y1.a0(file3, Boolean.TRUE) : 0L, 1));
                return;
            case 3:
                ((boolean[]) this.b)[0] = true;
                return;
            case 4:
                ((p4.e) this.b).k();
                return;
            case 5:
                ((p4.g) this.b).n = -1;
                return;
            case 6:
                ((ql0) this.b).b();
                return;
            case 7:
                cf1 cf1Var = (cf1) this.b;
                if (cf1Var.getParentLayout() != null) {
                    cf1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", cf1Var.a);
                    wn wnVar = new wn(bundle);
                    wnVar.za = true;
                    cf1Var.presentFragment(wnVar);
                    return;
                }
                return;
            case 8:
                r2.f fVar = (r2.f) this.b;
                synchronized (fVar.a) {
                    try {
                        if (fVar.m) {
                            return;
                        }
                        long j10 = fVar.l - 1;
                        fVar.l = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 < 0) {
                            fVar.c(new IllegalStateException());
                            return;
                        } else {
                            fVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 9:
                e3 e3Var = ((rg.p0) this.b).b.a;
                if (e3Var != null) {
                    e3Var.v0();
                    return;
                }
                return;
            case 10:
                rg.q0 q0Var = ((rg.p0) this.b).b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f.getCurrentColor();
                q0Var.l(q0Var.b, false, false);
                ng d = q0Var.d(q0Var.b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                rg.f1 f1Var = q0Var.d;
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
                ((rg.a1) ((dy0) this.b).b).y.a.a();
                return;
            case 12:
                rg.s1 s1Var = ((rg.t1) this.b).a;
                if (s1Var != null) {
                    s1Var.a();
                    return;
                }
                return;
            case 13:
                rh.c cVar = (rh.c) this.b;
                rh.b bVar = cVar.c;
                if (bVar == rh.b.b) {
                    cVar.a(rh.b.a, true);
                    return;
                } else {
                    if (bVar == rh.b.c) {
                        cVar.a(rh.b.d, true);
                        return;
                    }
                    return;
                }
            case 14:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 15:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.b;
                ((t5.g) ((u5.c) qVar.d)).f(new org.telegram.ui.Components.voip.j1(qVar, 9));
                return;
            case 16:
                q5 q5Var = (q5) this.b;
                q5Var.x0 = true;
                q5Var.s();
                return;
            case 17:
                ((View) this.b).performClick();
                return;
            case 18:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((sg.m2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((w2) this.b).q0);
                return;
            case 20:
                AndroidUtilities.showKeyboard(((sh.c) this.b).a);
                return;
            case 21:
                sh.c cVar2 = (sh.c) ((g6) this.b).d;
                org.telegram.ui.Cells.s1 s1Var2 = cVar2.n;
                if (s1Var2 == null || s1Var2.getDelegate() == null) {
                    return;
                }
                cVar2.n.getDelegate().n1(cVar2.n, false);
                return;
            case 22:
                ((sh.q) this.b).c.g3.O(true);
                return;
            case 23:
                ((sh.p) this.b).a();
                return;
            case 24:
                tg.j0 j0Var = ((tg.c0) this.b).c;
                j0Var.n.presentFragment(y91.c0(j0Var.w1(), true));
                return;
            case 25:
                bk0 bk0Var = ((tg.p0) this.b).F;
                bk0Var.getAnimatedDrawable().N(0, true, false);
                bk0Var.d();
                return;
            case 26:
                ((tg.w0) this.b).b.B();
                return;
            case 27:
                tg.q1 q1Var = (tg.q1) this.b;
                int size = 1073741823 - (1073741823 % q1Var.f3.size());
                s4.c0 c0Var = q1Var.g3;
                q1Var.t3 = size;
                c0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.C1(null, false);
                return;
            case 28:
                ((tg.s1) this.b).invalidate();
                return;
            default:
                ((tg.a2) this.b).a();
                return;
        }
    }
}
