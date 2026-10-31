package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.y01;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r3 extends org.telegram.ui.ActionBar.k2 implements us {
    public final long a;
    public org.telegram.ui.ActionBar.c2 b;
    public u51 c;

    public r3(long j10) {
        super(null);
        this.a = j10;
    }

    public final void Y(ArrayList arrayList, p51 p51Var) {
        rh.p e = rh.r.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = v2.b;
            a51 K = a51.K(v2.class);
            K.G = obj;
            K.r = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(a51.p(29));
            arrayList.add(a51.p(29));
            arrayList.add(a51.p(29));
        }
    }

    public final void Z(a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            z2.I0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.b = c2Var;
        lVar.setBackButtonDrawable(c2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 19));
        a7.i(t6.d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = t6.G6;
        a7.m(lVar2, 1, i10, null);
        a7.b(this.actionBar, i10, null, true);
        a7.m(this.actionBar, 3, t6.z8, null);
        a7.m(this.actionBar, 5, i10, null);
        this.actionBar.setTitle(cd.L0(2131752471, null));
        uu0 uu0Var = new uu0(context, null);
        u51 u51Var = new u51(this, new n1(this, 2), new wh.b(this, 11), null);
        this.c = u51Var;
        uu0Var.addView(u51Var, b6.e(-1, -1, zs.E1));
        this.fragmentView = uu0Var;
        return uu0Var;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        if (i10 == zs.K3 && ((Long) objArr[0]).longValue() == this.a && (u51Var = this.c) != null && (u51Var.getAdapter() instanceof p51)) {
            ((p51) this.c.getAdapter()).O(true);
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
        zs.f(this.currentAccount).c(this, zs.K3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        zs.f(this.currentAccount).n(this, zs.K3);
        super.onFragmentDestroy();
    }
}
