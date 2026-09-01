package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.Components.e81 {
    public final /* synthetic */ yu a;

    public vu(yu yuVar) {
        this.a = yuVar;
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
        uu uuVar = (uu) view;
        uuVar.V2 = i10;
        uuVar.c3.clear();
        uuVar.j3 = uuVar.w1(6) + uuVar.y1(6) <= 0;
        uuVar.z1();
        uuVar.A1(false);
        uuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        yu yuVar = this.a;
        return new uu(yuVar, yuVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.e81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
