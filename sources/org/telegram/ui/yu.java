package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yu extends org.telegram.ui.Components.b81 {
    public final /* synthetic */ bv a;

    public yu(bv bvVar) {
        this.a = bvVar;
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(View view, int i10, int i11) {
        xu xuVar = (xu) view;
        xuVar.Y2 = i10;
        xuVar.f3.clear();
        xuVar.m3 = xuVar.x1(6) + xuVar.z1(6) <= 0;
        xuVar.A1();
        xuVar.B1(false);
        xuVar.v0(0);
    }

    @Override // org.telegram.ui.Components.b81
    public final View d(int i10) {
        bv bvVar = this.a;
        xu xuVar = new xu(bvVar, bvVar.getParentActivity());
        bvVar.e.add(xuVar);
        return xuVar;
    }

    @Override // org.telegram.ui.Components.b81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.b81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
