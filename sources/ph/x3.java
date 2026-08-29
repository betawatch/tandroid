package ph;

import android.content.Context;
import android.view.View;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.al0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class x3 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.h2 b;
    public u51 c;

    public x3(long j10) {
        super(null);
        this.a = j10;
    }

    public final void U(ArrayList arrayList, k51 k51Var) {
        jh.z e10 = jh.b0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e10.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = z2.a;
            w41 J = w41.J(z2.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e10.h) {
            arrayList.add(w41.n(29));
            arrayList.add(w41.n(29));
            arrayList.add(w41.n(29));
        }
    }

    public final void V(w41 w41Var) {
        Object obj = w41Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            d3.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.b = h2Var;
        lVar.setBackButtonDrawable(h2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 29));
        this.actionBar.setBackgroundColor(g6.w0(null, g6.d6, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = g6.G6;
        lVar2.C(g6.w0(null, i10, false), false);
        this.actionBar.C(g6.w0(null, i10, false), true);
        this.actionBar.B(g6.w0(null, g6.z8, false), false);
        this.actionBar.setTitleColor(g6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        hv0 hv0Var = new hv0(context, null);
        u51 u51Var = new u51(this, new t4(this, 13), new l4.s0(this, 26), null);
        this.c = u51Var;
        hv0Var.addView(u51Var, f6.e(-1, -1, 119));
        this.fragmentView = hv0Var;
        return hv0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (u51Var = this.c) != null && (u51Var.getAdapter() instanceof k51)) {
            ((k51) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = g6.w0(null, g6.d6, false);
            if (this.actionBar.s()) {
                w02 = g6.w0(null, g6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
