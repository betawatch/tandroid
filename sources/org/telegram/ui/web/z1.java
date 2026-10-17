package org.telegram.ui.web;

import android.graphics.RectF;
import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.z5;
import ei.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Wallet.o6;
import org.telegram.ui.Wallet.p6;
import org.telegram.ui.r91;
import rg.v2;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                ((boolean[]) this.b)[0] = true;
                return;
            case 1:
                ((p4.e) this.b).k();
                return;
            case 2:
                ((p4.g) this.b).n = -1;
                return;
            case 3:
                ((ll0) this.b).b();
                return;
            case 4:
                le.b bVar = ((qg.r0) this.b).b.a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            case 5:
                qg.s0 s0Var = ((qg.r0) this.b).b;
                if (s0Var.d == null) {
                    s0Var.L = null;
                    return;
                }
                int currentColor = s0Var.f.getCurrentColor();
                s0Var.l(s0Var.b, false, false);
                a5.a d = s0Var.d(s0Var.b, currentColor, new RectF(s0Var.h));
                s0Var.b();
                qg.h1 h1Var = s0Var.d;
                RectF rectF = new RectF();
                s0Var.h = rectF;
                h1Var.a(rectF);
                s0Var.p(s0Var.e(h1Var, currentColor, new RectF(s0Var.h)), false);
                s0Var.p(d, false);
                s0Var.e(h1Var, currentColor, null);
                s0Var.d = null;
                s0Var.J = 0.0f;
                s0Var.L = null;
                return;
            case 6:
                ((qg.c1) ((p4.s0) this.b).b).y.a.a();
                return;
            case 7:
                qg.u1 u1Var = ((qg.v1) this.b).a;
                if (u1Var != null) {
                    u1Var.e();
                    return;
                }
                return;
            case 8:
                qh.c cVar = (qh.c) this.b;
                qh.b bVar2 = cVar.c;
                if (bVar2 == qh.b.b) {
                    cVar.a(qh.b.a, true);
                    return;
                } else {
                    if (bVar2 == qh.b.c) {
                        cVar.a(qh.b.d, true);
                        return;
                    }
                    return;
                }
            case 9:
                qi.c cVar2 = (qi.c) this.b;
                AndroidUtilities.runOnUIThread(new qi.b(cVar2.a, cVar2.b, 1), 500L);
                return;
            case 10:
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
            case 11:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.b;
                ((s5.g) ((t5.c) rVar.e)).f(new qg.g0(rVar, 5));
                return;
            case 12:
                r5 r5Var = (r5) this.b;
                r5Var.x0 = true;
                r5Var.s();
                return;
            case 13:
                ((View) this.b).performClick();
                return;
            case 14:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.k2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 15:
                AndroidUtilities.showKeyboard(((v2) this.b).q0);
                return;
            case 16:
                AndroidUtilities.showKeyboard(((rh.c) this.b).a);
                return;
            case 17:
                rh.c cVar3 = (rh.c) ((b6) this.b).d;
                org.telegram.ui.Cells.u1 u1Var2 = cVar3.n;
                if (u1Var2 == null || u1Var2.getDelegate() == null) {
                    return;
                }
                cVar3.n.getDelegate().x1(cVar3.n, false);
                return;
            case 18:
                ((rh.q) this.b).c.W2.N(true);
                return;
            case 19:
                ((rh.p) this.b).a();
                return;
            case 20:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 21:
                sg.j0 j0Var = ((sg.c0) this.b).c;
                j0Var.n.presentFragment(r91.d0(j0Var.t1(), true));
                return;
            case 22:
                xj0 xj0Var = ((sg.p0) this.b).y;
                xj0Var.getAnimatedDrawable().N(0, true, false);
                xj0Var.d();
                return;
            case 23:
                ((sg.v0) this.b).b.A();
                return;
            case 24:
                sg.p1 p1Var = (sg.p1) this.b;
                int size = 1073741823 - (1073741823 % p1Var.V2.size());
                s4.b0 b0Var = p1Var.W2;
                p1Var.j3 = size;
                b0Var.h1(size, (p1Var.getMeasuredHeight() - p1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                p1Var.x1(null, false);
                return;
            case 25:
                ((sg.r1) this.b).invalidate();
                return;
            case 26:
                ((sg.z1) this.b).a();
                return;
            case 27:
                l60 l60Var = (l60) ((l2.f) this.b).b;
                l60Var.p0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = l60Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                FileLog.d(sb2.toString());
                l60Var.t(true);
                l60.l(l60Var);
                return;
            case 28:
                ((z5) this.b).A();
                return;
            default:
                tg.f fVar2 = ((tg.d) this.b).d;
                fVar2.s = false;
                fVar2.v = null;
                Choreographer.getInstance().removeFrameCallback(fVar2);
                fVar2.F = 0L;
                o6 o6Var = (o6) fVar2;
                p6 p6Var = o6Var.L;
                if (p6Var.d == o6Var) {
                    p6.c(p6Var);
                    return;
                }
                return;
        }
    }
}
