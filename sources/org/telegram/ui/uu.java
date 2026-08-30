package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uu extends org.telegram.ui.Components.c81 {
    public final /* synthetic */ xu a;

    public uu(xu xuVar) {
        this.a = xuVar;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        tu tuVar = (tu) view;
        tuVar.V2 = i10;
        tuVar.c3.clear();
        tuVar.j3 = tuVar.w1(6) + tuVar.y1(6) <= 0;
        tuVar.z1();
        tuVar.A1(false);
        tuVar.u0(0);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        xu xuVar = this.a;
        return new tu(xuVar, xuVar.getParentActivity());
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
