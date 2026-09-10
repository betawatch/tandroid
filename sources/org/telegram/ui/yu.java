package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yu extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ bv a;

    public yu(bv bvVar) {
        this.a = bvVar;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        xu xuVar = (xu) view;
        xuVar.Y2 = i10;
        xuVar.f3.clear();
        xuVar.m3 = xuVar.v1(6) + xuVar.x1(6) <= 0;
        xuVar.y1();
        xuVar.z1(false);
        xuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        bv bvVar = this.a;
        return new xu(bvVar, bvVar.getParentActivity());
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
