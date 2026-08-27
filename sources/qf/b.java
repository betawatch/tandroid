package qf;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import lh.r5;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import rh.b2;
import rh.u1;
import zf.l2;
import zf.v2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
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
                e eVar = (e) this.b;
                eVar.c.U2.N(true);
                eVar.V(true);
                return;
            case 1:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                mc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 2:
                g0 g0Var = (g0) this.b;
                b51 b51Var = g0Var.Z;
                if (b51Var != null) {
                    b51Var.N(true);
                }
                g0Var.T(true);
                return;
            case 3:
                m0 m0Var = (m0) ((o0.b) this.b).b;
                m0Var.c.U2.N(true);
                m0Var.b0();
                return;
            case 4:
                o0 o0Var = (o0) this.b;
                o0Var.c.U2.N(true);
                o0Var.V(true);
                return;
            case 5:
                y0 y0Var = (y0) this.b;
                y0Var.a.U2.N(true);
                y0Var.Y(true);
                return;
            case 6:
                ((cg.e1) this.b).run(Boolean.FALSE);
                return;
            case 7:
                NotificationCenter.getInstance(((q1) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 8:
                e3 e3Var = ((g3) this.b).b;
                e3Var.requestFocus();
                AndroidUtilities.showKeyboard(e3Var);
                return;
            case 9:
                AndroidUtilities.showKeyboard(((rh.v) this.b).a0.b);
                return;
            case 10:
                ((rh.b0) this.b).invalidate();
                return;
            case 11:
                t3 t3Var = (t3) this.b;
                t3Var.c = null;
                t3Var.d = null;
                t3Var.e = null;
                t3Var.f = null;
                t3Var.e(null);
                return;
            case 12:
                ((u1) this.b).invalidateSelf();
                return;
            case 13:
                ((b2) this.b).c();
                return;
            case 14:
                ((tg.b) this.b).invalidate();
                return;
            case 15:
                ug.d dVar = (ug.d) this.b;
                GroupCallMessage groupCallMessage = dVar.D;
                if (groupCallMessage != null) {
                    dVar.a.a(groupCallMessage.isSendDelayed(), true);
                    dVar.b.a(dVar.D.isSendError(), true);
                    return;
                }
                return;
            case 16:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (f6) this.b, Boolean.TRUE, null, -1);
                return;
            case 17:
                we1 we1Var = (we1) this.b;
                if (we1Var.getParentLayout() != null) {
                    we1Var.D = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", we1Var.a);
                    rn rnVar = new rn(bundle);
                    rnVar.fa = true;
                    we1Var.presentFragment(rnVar);
                    return;
                }
                return;
            case 18:
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
            case 19:
                n1.d dVar2 = ((yf.o0) this.b).b.a;
                if (dVar2 != null) {
                    dVar2.C();
                    return;
                }
                return;
            case 20:
                yf.p0 p0Var = ((yf.o0) this.b).b;
                if (p0Var.d == null) {
                    p0Var.L = null;
                    return;
                }
                int currentColor = p0Var.f.getCurrentColor();
                p0Var.l(p0Var.b, false, false);
                b6.a d = p0Var.d(p0Var.b, currentColor, new RectF(p0Var.h));
                p0Var.b();
                yf.e1 e1Var = p0Var.d;
                RectF rectF = new RectF();
                p0Var.h = rectF;
                e1Var.a(rectF);
                p0Var.p(p0Var.e(e1Var, currentColor, new RectF(p0Var.h)), false);
                p0Var.p(d, false);
                p0Var.e(e1Var, currentColor, null);
                p0Var.d = null;
                p0Var.J = 0.0f;
                p0Var.L = null;
                return;
            case 21:
                ((yf.z0) ((mu0) this.b).b).y.a.a();
                return;
            case 22:
                yf.r1 r1Var = ((yf.s1) this.b).a;
                if (r1Var != null) {
                    r1Var.g();
                    return;
                }
                return;
            case 23:
                yg.c cVar = (yg.c) this.b;
                yg.b bVar = cVar.c;
                if (bVar == yg.b.b) {
                    cVar.a(yg.b.a, true);
                    return;
                } else {
                    if (bVar == yg.b.c) {
                        cVar.a(yg.b.d, true);
                        return;
                    }
                    return;
                }
            case 24:
                r5 r5Var = (r5) this.b;
                r5Var.t0 = true;
                r5Var.s();
                return;
            case 25:
                ((View) this.b).performClick();
                return;
            case 26:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((l2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 27:
                AndroidUtilities.showKeyboard(((v2) this.b).m0);
                return;
            case 28:
                AndroidUtilities.showKeyboard(((zg.c) this.b).a);
                return;
            default:
                zg.c cVar2 = (zg.c) ((gh.r) this.b).d;
                org.telegram.ui.Cells.s1 s1Var = cVar2.n;
                if (s1Var == null || s1Var.getDelegate() == null) {
                    return;
                }
                cVar2.n.getDelegate().v1(cVar2.n, false);
                return;
        }
    }
}
