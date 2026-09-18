package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class xu extends org.telegram.ui.Components.o81 {
    public final /* synthetic */ av a;

    public xu(av avVar) {
        this.a = avVar;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        wu wuVar = (wu) view;
        wuVar.Y2 = i10;
        wuVar.f3.clear();
        wuVar.m3 = wuVar.x1(6) + wuVar.z1(6) <= 0;
        wuVar.A1();
        wuVar.B1(false);
        wuVar.v0(0);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        av avVar = this.a;
        wu wuVar = new wu(avVar, avVar.getParentActivity());
        avVar.e.add(wuVar);
        return wuVar;
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
