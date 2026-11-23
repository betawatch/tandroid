package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class yi implements org.telegram.ui.Components.qo {
    public final /* synthetic */ bn a;

    public yi(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.Components.qo
    public final void B(int i7) {
        bn bnVar = this.a;
        if (i7 != 0) {
            bnVar.getNotificationsController().H(bnVar.l6, i7, bnVar.d());
            if (org.telegram.ui.Components.lc.a(bnVar)) {
                org.telegram.ui.Components.lc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (bnVar.getMessagesController().u2(bnVar.l6, bnVar.d(), null)) {
            bnVar.Ic(true);
        }
        if (org.telegram.ui.Components.lc.a(bnVar)) {
            org.telegram.ui.Components.lc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.qo
    public final void dismiss() {
        this.a.j0.V(null, null);
    }

    @Override // org.telegram.ui.Components.qo
    public final void s() {
        bn bnVar = this.a;
        bnVar.Ic(true);
        org.telegram.ui.Components.lc.A(bnVar, bnVar.getMessagesController().u2(bnVar.l6, bnVar.d(), null), bnVar.Ba).j();
    }

    @Override // org.telegram.ui.Components.qo
    public final void u() {
        bn bnVar = this.a;
        if (bnVar.l6 == 0 || bnVar.g4 == 3) {
            return;
        }
        if (bnVar.f != null) {
            bnVar.getMessagesController().e4(bnVar.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", bnVar.l6);
        if (bnVar.d() != 0) {
            bundle.putLong("topic_id", bnVar.d());
        }
        bnVar.presentFragment(new jx0(bundle, bnVar.Ba));
    }

    @Override // org.telegram.ui.Components.qo
    public final void w() {
        int i7;
        bn bnVar = this.a;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i7).g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.ys.v(bnVar.l6, bnVar.d(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.ys.v(bnVar.l6, bnVar.d(), false), z11).apply();
        if (org.telegram.ui.Components.lc.a(bnVar)) {
            org.telegram.ui.Components.lc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override // org.telegram.ui.Components.qo
    public final /* synthetic */ void p() {
    }
}
