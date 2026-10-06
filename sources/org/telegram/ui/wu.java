package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class wu extends org.telegram.ui.Components.y81 {
    public final /* synthetic */ zu a;

    public wu(zu zuVar) {
        this.a = zuVar;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        vu vuVar = (vu) view;
        vuVar.f3 = i10;
        vuVar.m3.clear();
        vuVar.t3 = vuVar.x1(6) + vuVar.z1(6) <= 0;
        vuVar.A1();
        vuVar.B1(false);
        vuVar.v0(0);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        zu zuVar = this.a;
        vu vuVar = new vu(zuVar, zuVar.getParentActivity());
        zuVar.e.add(vuVar);
        return vuVar;
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
