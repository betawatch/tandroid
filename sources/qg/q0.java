package qg;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import bi.u6;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.nj0;
import wh.q2;
import xh.l8;
import xh.p7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        f6 f6Var;
        switch (this.a) {
            case 0:
                kj0 kj0Var = ((s0) this.b).y;
                kj0Var.getAnimatedDrawable().N(0, true, false);
                kj0Var.d();
                return;
            case 1:
                ((y0) this.b).b.y();
                return;
            case 2:
                q1 q1Var = (q1) this.b;
                int size = 1073741823 - (1073741823 % q1Var.X2.size());
                s4.c0 c0Var = q1Var.Y2;
                q1Var.l3 = size;
                c0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.v1(null, false);
                return;
            case 3:
                ((s1) this.b).invalidate();
                return;
            case 4:
                ((a2) this.b).a();
                return;
            case 5:
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
            case 6:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                ((s5.g) ((t5.c) sVar.e)).f(new org.telegram.tgnet.j(sVar, 22));
                return;
            case 7:
                ((u6) this.b).z();
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 9:
                ((rf.b) ((com.google.android.gms.internal.cast.p) this.b).c).a(false);
                return;
            case 10:
                CharSequence charSequence = (CharSequence) this.b;
                wc X = wc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 11:
                ((sg.y) this.b).run(null);
                return;
            case 12:
                ((nj0) this.b).run(Collections.EMPTY_LIST);
                return;
            case 13:
                ((sg.v) this.b).run(null);
                return;
            case 14:
                sg.c0 c0Var2 = ((sg.b0) this.b).r;
                p2 p2Var = c0Var2.n;
                i10 = ((h3) c0Var2).currentAccount;
                f6Var = ((h3) c0Var2).resourcesProvider;
                m1 m1Var = new m1(p2Var, i10, null, null, null, f6Var);
                m1Var.J0 = true;
                m1Var.c0 = true;
                c0Var2.n.showDialog(m1Var);
                return;
            case 15:
                ((h3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(8), 220L);
                return;
            case 16:
                ((sh.f) this.b).d0.N(true);
                return;
            case 17:
                vh.o oVar = (vh.o) this.b;
                oVar.f();
                oVar.e(true);
                return;
            case 18:
                ((wg.b) this.b).f();
                return;
            case 19:
                wh.m mVar = (wh.m) this.b;
                mVar.h0.setTranslationX(mVar.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 20:
                ((wh.d0) this.b).onBackPressed();
                return;
            case 21:
                j61 j61Var = ((wh.p1) this.b).Y;
                if (j61Var != null) {
                    j61Var.N(false);
                    return;
                }
                return;
            case 22:
                ((wh.e1) this.b).c();
                return;
            case 23:
                wh.m1 m1Var2 = (wh.m1) this.b;
                l8 l8Var = m1Var2.e;
                if (l8Var != null) {
                    l8Var.d();
                    m1Var2.invalidateSelf();
                    return;
                }
                return;
            case 24:
                ((q2) this.b).o();
                return;
            case 25:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                xf.n nVar = (xf.n) this.b;
                long j10 = nVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    nVar.b = j11;
                    nVar.a.h(j11);
                }
                if (nVar.b <= 0) {
                    nVar.c = false;
                }
                if (nVar.c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    return;
                }
                return;
            case 27:
                xh.a aVar = (xh.a) this.b;
                aVar.getClass();
                new p7(aVar.getContext(), aVar.b).show();
                return;
            case 28:
                xh.g gVar = (xh.g) this.b;
                gVar.getClass();
                try {
                    vl0 currentListView = gVar.x0.F.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            default:
                new pw0(((xh.t) this.b).getContext()).show();
                return;
        }
    }
}
