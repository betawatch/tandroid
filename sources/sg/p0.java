package sg;

import android.graphics.Bitmap;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
import org.telegram.ui.oj0;
import org.telegram.ui.q31;
import yh.q2;
import zh.h8;
import zh.l7;
import zh.x2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        f6 f6Var;
        switch (this.a) {
            case 0:
                aj0 aj0Var = ((r0) this.b).y;
                aj0Var.getAnimatedDrawable().L(0, true, false);
                aj0Var.d();
                break;
            case 1:
                ((y0) this.b).b.y();
                break;
            case 2:
                s1 s1Var = (s1) this.b;
                int size = 1073741823 - (1073741823 % s1Var.X2.size());
                s4.c0 c0Var = s1Var.Y2;
                s1Var.l3 = size;
                c0Var.h1(size, (s1Var.getMeasuredHeight() - s1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                s1Var.v1(null, false);
                break;
            case 3:
                ((u1) this.b).invalidate();
                break;
            case 4:
                ((c2) this.b).a();
                break;
            case 5:
                ((sf.b) ((com.google.android.gms.internal.cast.p) this.b).c).a(false);
                break;
            case 6:
                CharSequence charSequence = (CharSequence) this.b;
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    break;
                }
                break;
            case 7:
                ((ug.z) this.b).run(null);
                break;
            case 8:
                ((oj0) this.b).run(Collections.EMPTY_LIST);
                break;
            case 9:
                ((ug.w) this.b).run(null);
                break;
            case 10:
                ug.d0 d0Var = ((ug.c0) this.b).r;
                n2 n2Var = d0Var.n;
                i10 = ((f3) d0Var).currentAccount;
                f6Var = ((f3) d0Var).resourcesProvider;
                o1 o1Var = new o1(n2Var, i10, null, null, null, f6Var);
                o1Var.J0 = true;
                o1Var.c0 = true;
                d0Var.n.showDialog(o1Var);
                break;
            case 11:
                ((f3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new q31(15), 220L);
                break;
            case 12:
                ((uh.f) this.b).d0.N(true);
                break;
            case 13:
                xh.m mVar = (xh.m) this.b;
                mVar.f();
                mVar.e(true);
                break;
            case 14:
                try {
                    ((Bitmap) this.b).recycle();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                yf.n nVar = (yf.n) this.b;
                long j3 = nVar.b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    nVar.b = j10;
                    nVar.a.c(j10);
                }
                if (nVar.b <= 0) {
                    nVar.c = false;
                }
                if (nVar.c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    break;
                }
                break;
            case 16:
                ((yg.b) this.b).f();
                break;
            case 17:
                yh.m mVar2 = (yh.m) this.b;
                mVar2.h0.setTranslationX(mVar2.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                break;
            case 18:
                ((yh.c0) this.b).onBackPressed();
                break;
            case 19:
                v51 v51Var = ((yh.p1) this.b).Y;
                if (v51Var != null) {
                    v51Var.N(false);
                    break;
                }
                break;
            case 20:
                ((yh.e1) this.b).c();
                break;
            case 21:
                yh.m1 m1Var = (yh.m1) this.b;
                h8 h8Var = m1Var.e;
                if (h8Var != null) {
                    h8Var.d();
                    m1Var.invalidateSelf();
                    break;
                }
                break;
            case 22:
                ((q2) this.b).o();
                break;
            case 23:
                zh.a aVar = (zh.a) this.b;
                aVar.getClass();
                new l7(aVar.getContext(), aVar.b).show();
                break;
            case 24:
                zh.f fVar = (zh.f) this.b;
                fVar.getClass();
                try {
                    ll0 currentListView = fVar.x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 25:
                new dw0(((zh.s) this.b).getContext()).show();
                break;
            case 26:
                AndroidUtilities.showKeyboard(((zh.a0) this.b).d0);
                break;
            case 27:
                AndroidUtilities.showKeyboard(((zh.e0) this.b).h);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((zh.i0) this.b).c);
                break;
            default:
                x2 x2Var = (x2) this.b;
                x2Var.h0 = false;
                x2Var.j0 = false;
                x2Var.a(x2Var.W, x2Var.a0, x2Var.b0, x2Var.c0);
                break;
        }
    }
}
