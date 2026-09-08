package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xu extends org.telegram.ui.Components.a81 {
    public final /* synthetic */ av a;

    public xu(av avVar) {
        this.a = avVar;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        wu wuVar = (wu) view;
        wuVar.Y2 = i10;
        wuVar.f3.clear();
        wuVar.m3 = wuVar.v1(6) + wuVar.x1(6) <= 0;
        wuVar.y1();
        wuVar.z1(false);
        wuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        av avVar = this.a;
        return new wu(avVar, avVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
