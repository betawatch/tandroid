package sh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ll0;
import qh.c4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class x3 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.i2 b;
    public h61 c;

    public x3(long j10) {
        super(null);
        this.a = j10;
    }

    public final void U(ArrayList arrayList, w51 w51Var) {
        mh.y e6 = mh.a0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e6.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = z2.a;
            h51 J = h51.J(z2.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e6.h) {
            arrayList.add(h51.n(29));
            arrayList.add(h51.n(29));
            arrayList.add(h51.n(29));
        }
    }

    public final void V(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            d3.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.b = i2Var;
        kVar.setBackButtonDrawable(i2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 29));
        this.actionBar.setBackgroundColor(k6.w0(null, k6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        kVar2.C(k6.w0(null, i10, false), false);
        this.actionBar.C(k6.w0(null, i10, false), true);
        this.actionBar.B(k6.w0(null, k6.z8, false), false);
        this.actionBar.setTitleColor(k6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        pv0 pv0Var = new pv0(context, null);
        h61 h61Var = new h61(this, new c4(this, 13), new sf.h(this, 3), null);
        this.c = h61Var;
        pv0Var.addView(h61Var, c6.e(-1, -1, 119));
        this.fragmentView = pv0Var;
        return pv0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h61 h61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (h61Var = this.c) != null && (h61Var.getAdapter() instanceof w51)) {
            ((w51) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = k6.w0(null, k6.d6, false);
            if (this.actionBar.s()) {
                w02 = k6.w0(null, k6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
