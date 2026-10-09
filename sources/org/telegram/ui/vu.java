package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.Components.f91 {
    public final /* synthetic */ yu a;

    public vu(yu yuVar) {
        this.a = yuVar;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        uu uuVar = (uu) view;
        uuVar.W2 = i10;
        uuVar.d3.clear();
        uuVar.k3 = uuVar.x1(6) + uuVar.z1(6) <= 0;
        uuVar.A1();
        uuVar.B1(false);
        uuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        yu yuVar = this.a;
        return new uu(yuVar, yuVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.f91
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
