package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.z01;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class s3 extends org.telegram.ui.ActionBar.k2 implements vs {
    public final long a;
    public org.telegram.ui.ActionBar.c2 b;
    public v51 c;

    public s3(long j10) {
        super(null);
        this.a = j10;
    }

    public final void Z(ArrayList arrayList, q51 q51Var) {
        rh.p e = rh.r.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = v2.b;
            b51 K = b51.K(v2.class);
            K.G = obj;
            K.r = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(b51.p(29));
            arrayList.add(b51.p(29));
            arrayList.add(b51.p(29));
        }
    }

    public final void a0(b51 b51Var) {
        Object obj = b51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            z2.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.b = c2Var;
        lVar.setBackButtonDrawable(c2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 19));
        a7.i(t6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = t6.G6;
        a7.m(lVar2, 1, i10, null);
        a7.b(this.actionBar, i10, null, true);
        a7.m(this.actionBar, 3, t6.z8, null);
        a7.m(this.actionBar, 5, i10, null);
        this.actionBar.setTitle(dd.L0(2131752471, null));
        vu0 vu0Var = new vu0(context, null);
        v51 v51Var = new v51(this, new n1(this, 2), new wh.b(this, 11), null);
        this.c = v51Var;
        vu0Var.addView(v51Var, b6.e(-1, -1, at.E1));
        this.fragmentView = vu0Var;
        return vu0Var;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == at.K3 && ((Long) objArr[0]).longValue() == this.a && (v51Var = this.c) != null && (v51Var.getAdapter() instanceof q51)) {
            ((q51) this.c.getAdapter()).O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = t6.x0(null, t6.d6, false);
            if (this.actionBar.u()) {
                x02 = t6.x0(null, t6.w8, false);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        at.f(this.currentAccount).c(this, at.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        at.f(this.currentAccount).n(this, at.K3);
        super.onFragmentDestroy();
    }
}
