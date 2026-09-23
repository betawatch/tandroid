package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tu extends org.telegram.ui.Components.z71 {
    public final /* synthetic */ wu a;

    public tu(wu wuVar) {
        this.a = wuVar;
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
        su suVar = (su) view;
        suVar.Y2 = i10;
        suVar.f3.clear();
        suVar.m3 = suVar.w1(6) + suVar.y1(6) <= 0;
        suVar.z1();
        suVar.A1(false);
        suVar.u0(0);
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        wu wuVar = this.a;
        return new su(wuVar, wuVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.z71
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
