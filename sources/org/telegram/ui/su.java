package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class su extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ vu a;

    public su(vu vuVar) {
        this.a = vuVar;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        ru ruVar = (ru) view;
        ruVar.Y2 = i10;
        ruVar.f3.clear();
        ruVar.m3 = ruVar.w1(6) + ruVar.y1(6) <= 0;
        ruVar.z1();
        ruVar.A1(false);
        ruVar.u0(0);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        vu vuVar = this.a;
        return new ru(vuVar, vuVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
