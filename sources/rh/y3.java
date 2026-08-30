package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.jl0;
import ph.d4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y3 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final long a;
    public org.telegram.ui.ActionBar.i2 b;
    public g61 c;

    public y3(long j10) {
        super(null);
        this.a = j10;
    }

    public final void U(ArrayList arrayList, w51 w51Var) {
        lh.z e = lh.b0.g(this.currentAccount).e(this.a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = a3.a;
            i51 J = i51.J(a3.class);
            J.G = obj;
            J.r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
        }
    }

    public final void V(i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            e3.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.a, this.resourceProvider, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.b = i2Var;
        kVar.setBackButtonDrawable(i2Var);
        this.b.k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 29));
        this.actionBar.setBackgroundColor(j6.w0(null, j6.d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        kVar2.C(j6.w0(null, i10, false), false);
        this.actionBar.C(j6.w0(null, i10, false), true);
        this.actionBar.B(j6.w0(null, j6.z8, false), false);
        this.actionBar.setTitleColor(j6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        qv0 qv0Var = new qv0(context, null);
        g61 g61Var = new g61(this, new d4(this, 13), new e(this, 1), null);
        this.c = g61Var;
        qv0Var.addView(g61Var, b6.e(-1, -1, 119));
        this.fragmentView = qv0Var;
        return qv0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g61 g61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.a && (g61Var = this.c) != null && (g61Var.getAdapter() instanceof w51)) {
            ((w51) this.c.getAdapter()).N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = j6.w0(null, j6.d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.w8, false);
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
