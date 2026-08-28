package pf;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import kh.s5;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.we1;
import qh.b2;
import yf.k2;
import yf.v2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(((r1) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 1:
                h3 h3Var = ((j3) this.b).b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((qh.v) this.b).a0.b);
                return;
            case 3:
                ((qh.b0) this.b).invalidate();
                return;
            case 4:
                t3 t3Var = (t3) this.b;
                t3Var.c = null;
                t3Var.d = null;
                t3Var.e = null;
                t3Var.f = null;
                t3Var.e(null);
                return;
            case 5:
                ((qh.u1) this.b).invalidateSelf();
                return;
            case 6:
                ((b2) this.b).c();
                return;
            case 7:
                ((sg.b) this.b).invalidate();
                return;
            case 8:
                tg.d dVar = (tg.d) this.b;
                GroupCallMessage groupCallMessage = dVar.D;
                if (groupCallMessage != null) {
                    dVar.a.a(groupCallMessage.isSendDelayed(), true);
                    dVar.b.a(dVar.D.isSendError(), true);
                    return;
                }
                return;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (e6) this.b, Boolean.TRUE, null, -1);
                return;
            case 10:
                we1 we1Var = (we1) this.b;
                if (we1Var.getParentLayout() != null) {
                    we1Var.D = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", we1Var.a);
                    qn qnVar = new qn(bundle);
                    qnVar.fa = true;
                    we1Var.presentFragment(qnVar);
                    return;
                }
                return;
            case 11:
                m5.c0 c0Var = ((xf.p0) this.b).b.a;
                if (c0Var != null) {
                    c0Var.i();
                    return;
                }
                return;
            case 12:
                xf.q0 q0Var = ((xf.p0) this.b).b;
                if (q0Var.d == null) {
                    q0Var.L = null;
                    return;
                }
                int currentColor = q0Var.f.getCurrentColor();
                q0Var.l(q0Var.b, false, false);
                a6.a d = q0Var.d(q0Var.b, currentColor, new RectF(q0Var.h));
                q0Var.b();
                xf.f1 f1Var = q0Var.d;
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
            case 13:
                ((xf.a1) ((ju0) this.b).b).y.a.a();
                return;
            case 14:
                xf.s1 s1Var = ((xf.t1) this.b).a;
                if (s1Var != null) {
                    s1Var.e();
                    return;
                }
                return;
            case 15:
                xg.c cVar = (xg.c) this.b;
                xg.b bVar = cVar.c;
                if (bVar == xg.b.b) {
                    cVar.a(xg.b.a, true);
                    return;
                } else {
                    if (bVar == xg.b.c) {
                        cVar.a(xg.b.d, true);
                        return;
                    }
                    return;
                }
            case 16:
                y3.f fVar = (y3.f) this.b;
                synchronized (fVar.a) {
                    try {
                        if (fVar.l) {
                            return;
                        }
                        long j10 = fVar.k - 1;
                        fVar.k = j10;
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
            case 17:
                s5 s5Var = (s5) this.b;
                s5Var.t0 = true;
                s5Var.s();
                return;
            case 18:
                ((View) this.b).performClick();
                return;
            case 19:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((k2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 20:
                AndroidUtilities.showKeyboard(((v2) this.b).m0);
                return;
            case 21:
                AndroidUtilities.showKeyboard(((yg.c) this.b).a);
                return;
            case 22:
                yg.c cVar2 = (yg.c) ((fh.s) this.b).d;
                org.telegram.ui.Cells.t1 t1Var = cVar2.n;
                if (t1Var == null || t1Var.getDelegate() == null) {
                    return;
                }
                cVar2.n.getDelegate().t1(cVar2.n, false);
                return;
            case 23:
                ((yg.q) this.b).c.U2.N(true);
                return;
            case 24:
                ((yg.p) this.b).a();
                return;
            case 25:
                ((b3.b) this.b).z();
                return;
            case 26:
                zf.j0 j0Var = ((zf.c0) this.b).c;
                j0Var.n.presentFragment(s91.c0(j0Var.s1(), true));
                return;
            case 27:
                pi0 pi0Var = ((zf.p0) this.b).y;
                pi0Var.getAnimatedDrawable().L(0, true, false);
                pi0Var.d();
                return;
            case 28:
                ((zf.v0) this.b).b.y();
                return;
            default:
                zf.o1 o1Var = (zf.o1) this.b;
                int size = 1073741823 - (1073741823 % o1Var.T2.size());
                f2.m0 m0Var = o1Var.U2;
                o1Var.h3 = size;
                m0Var.h1(size, (o1Var.getMeasuredHeight() - o1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                o1Var.w1(null, false);
                return;
        }
    }
}
