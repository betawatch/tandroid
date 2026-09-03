package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.Components.d81 {
    public final /* synthetic */ yu a;

    public vu(yu yuVar) {
        this.a = yuVar;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
        uu uuVar = (uu) view;
        uuVar.V2 = i10;
        uuVar.c3.clear();
        uuVar.j3 = uuVar.v1(6) + uuVar.x1(6) <= 0;
        uuVar.y1();
        uuVar.z1(false);
        uuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        yu yuVar = this.a;
        return new uu(yuVar, yuVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.d81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
