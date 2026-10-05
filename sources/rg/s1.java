package rg;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ft;
import org.telegram.ui.n21;
import xh.s2;
import yh.l8;
import yh.p7;
import yh.y2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        d6 d6Var;
        switch (this.a) {
            case 0:
                ((t1) this.b).invalidate();
                break;
            case 1:
                ((b2) this.b).a();
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    break;
                }
                break;
            case 3:
                ((rf.b) ((com.google.android.gms.internal.cast.p) this.b).c).a(false);
                break;
            case 4:
                CharSequence charSequence = (CharSequence) this.b;
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    break;
                }
                break;
            case 5:
                ((tg.y) this.b).run(null);
                break;
            case 6:
                ((ft) this.b).run(Collections.EMPTY_LIST);
                break;
            case 7:
                ((tg.v) this.b).run(null);
                break;
            case 8:
                tg.c0 c0Var = ((tg.b0) this.b).r;
                n2 n2Var = c0Var.n;
                i10 = ((f3) c0Var).currentAccount;
                d6Var = ((f3) c0Var).resourcesProvider;
                m1 m1Var = new m1(n2Var, i10, null, null, null, d6Var);
                m1Var.J0 = true;
                m1Var.c0 = true;
                c0Var.n.showDialog(m1Var);
                break;
            case 9:
                ((f3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new n21(16), 220L);
                break;
            case 10:
                ((th.f) this.b).d0.N(true);
                break;
            case 11:
                wh.m mVar = (wh.m) this.b;
                mVar.f();
                mVar.e(true);
                break;
            case 12:
                ((xg.b) this.b).f();
                break;
            case 13:
                xh.m mVar2 = (xh.m) this.b;
                mVar2.h0.setTranslationX(mVar2.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                break;
            case 14:
                ((xh.c0) this.b).onBackPressed();
                break;
            case 15:
                w61 w61Var = ((xh.q1) this.b).Y;
                if (w61Var != null) {
                    w61Var.N(false);
                    break;
                }
                break;
            case 16:
                ((xh.f1) this.b).c();
                break;
            case 17:
                xh.n1 n1Var = (xh.n1) this.b;
                l8 l8Var = n1Var.e;
                if (l8Var != null) {
                    l8Var.d();
                    n1Var.invalidateSelf();
                    break;
                }
                break;
            case 18:
                ((s2) this.b).o();
                break;
            case 19:
                try {
                    ((Bitmap) this.b).recycle();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 20:
                yf.n nVar = (yf.n) this.b;
                long j3 = nVar.b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    nVar.b = j10;
                    nVar.a.e(j10);
                }
                if (nVar.b <= 0) {
                    nVar.c = false;
                }
                if (nVar.c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    break;
                }
                break;
            case 21:
                yh.a aVar = (yh.a) this.b;
                aVar.getClass();
                new p7(aVar.getContext(), aVar.b).show();
                break;
            case 22:
                yh.g gVar = (yh.g) this.b;
                if (gVar.isAttachedToWindow() && !gVar.c.canScrollVertically(1)) {
                    gVar.a();
                    break;
                }
                break;
            case 23:
                new bx0(((yh.t) this.b).getContext()).show();
                break;
            case 24:
                AndroidUtilities.showKeyboard(((yh.b0) this.b).d0);
                break;
            case 25:
                AndroidUtilities.showKeyboard(((yh.f0) this.b).h);
                break;
            case 26:
                AndroidUtilities.showKeyboard(((yh.j0) this.b).c);
                break;
            case 27:
                ((yh.t0) this.b).onBackPressed();
                break;
            case 28:
                y2 y2Var = (y2) this.b;
                y2Var.h0 = false;
                y2Var.j0 = false;
                y2Var.a(y2Var.W, y2Var.a0, y2Var.b0, y2Var.c0);
                break;
            default:
                ((yh.n2) this.b).invalidateSelf();
                break;
        }
    }
}
