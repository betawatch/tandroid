package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wu extends org.telegram.ui.Components.a81 {
    public final /* synthetic */ zu a;

    public wu(zu zuVar) {
        this.a = zuVar;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        vu vuVar = (vu) view;
        vuVar.Y2 = i10;
        vuVar.f3.clear();
        vuVar.m3 = vuVar.w1(6) + vuVar.y1(6) <= 0;
        vuVar.z1();
        vuVar.A1(false);
        vuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        zu zuVar = this.a;
        return new vu(zuVar, zuVar.getParentActivity());
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
