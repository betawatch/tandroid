package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wu extends org.telegram.ui.Components.c81 {
    public final /* synthetic */ zu a;

    public wu(zu zuVar) {
        this.a = zuVar;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        vu vuVar = (vu) view;
        vuVar.V2 = i10;
        vuVar.c3.clear();
        vuVar.j3 = vuVar.v1(6) + vuVar.x1(6) <= 0;
        vuVar.y1();
        vuVar.z1(false);
        vuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        zu zuVar = this.a;
        return new vu(zuVar, zuVar.getParentActivity());
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return 4;
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab) : LocaleController.getString(R.string.NetworkUsageWiFiTab) : LocaleController.getString(R.string.NetworkUsageMobileTab) : LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
