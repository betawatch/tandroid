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
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Wallet.l6;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.u91;
import rg.w2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i10) {
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
                ((pl0) this.b).b();
                return;
            case 4:
                ki.t1 t1Var = ((qg.r0) this.b).b.a;
                if (t1Var != null) {
                    t1Var.J();
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
                ((qg.c1) ((m4) this.b).b).y.a.a();
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
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((rg.m2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 15:
                AndroidUtilities.showKeyboard(((w2) this.b).q0);
                return;
            case 16:
                AndroidUtilities.showKeyboard(((rh.c) this.b).a);
                return;
            case 17:
                rh.c cVar3 = (rh.c) ((c6) this.b).d;
                org.telegram.ui.Cells.t1 t1Var2 = cVar3.n;
                if (t1Var2 == null || t1Var2.getDelegate() == null) {
                    return;
                }
                cVar3.n.getDelegate().x1(cVar3.n, false);
                return;
            case 18:
                ((rh.q) this.b).c.Z2.N(true);
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
                j0Var.n.presentFragment(u91.d0(j0Var.w1(), true));
                return;
            case 22:
                bk0 bk0Var = ((sg.p0) this.b).F;
                bk0Var.getAnimatedDrawable().N(0, true, false);
                bk0Var.d();
                return;
            case 23:
                ((sg.w0) this.b).b.B();
                return;
            case 24:
                sg.q1 q1Var = (sg.q1) this.b;
                int size = 1073741823 - (1073741823 % q1Var.Y2.size());
                s4.b0 b0Var = q1Var.Z2;
                q1Var.m3 = size;
                b0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.C1(null, false);
                return;
            case 25:
                ((sg.s1) this.b).invalidate();
                return;
            case 26:
                ((sg.a2) this.b).a();
                return;
            case 27:
                m60 m60Var = (m60) ((l2.f) this.b).b;
                m60Var.p0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = m60Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                FileLog.d(sb2.toString());
                m60Var.t(true);
                m60.l(m60Var);
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
                l6 l6Var = (l6) fVar2;
                m6 m6Var = l6Var.L;
                if (m6Var.d == l6Var) {
                    m6.c(m6Var);
                    return;
                }
                return;
        }
    }
}
