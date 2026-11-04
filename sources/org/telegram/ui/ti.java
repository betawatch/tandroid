package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ti implements org.telegram.ui.Components.wn {
    public final /* synthetic */ wm a;

    public ti(wm wmVar) {
        this.a = wmVar;
    }

    @Override // org.telegram.ui.Components.wn
    public final void dismiss() {
        this.a.j0.U(null, null);
    }

    @Override // org.telegram.ui.Components.wn
    public final void q() {
        wm wmVar = this.a;
        wmVar.Ec(true);
        org.telegram.ui.Components.fc.A(wmVar, wmVar.getMessagesController().r2(wmVar.k6, wmVar.b(), null), wmVar.ya).j();
    }

    @Override // org.telegram.ui.Components.wn
    public final void t() {
        wm wmVar = this.a;
        if (wmVar.k6 == 0 || wmVar.g4 == 3) {
            return;
        }
        if (wmVar.f != null) {
            wmVar.getMessagesController().X3(wmVar.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", wmVar.k6);
        if (wmVar.b() != 0) {
            bundle.putLong("topic_id", wmVar.b());
        }
        wmVar.presentFragment(new yw0(bundle, wmVar.ya));
    }

    @Override // org.telegram.ui.Components.wn
    public final void v() {
        int i3;
        wm wmVar = this.a;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).d7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.us.v(wmVar.k6, wmVar.b(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.us.v(wmVar.k6, wmVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.fc.a(wmVar)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, wmVar, wmVar.getResourceProvider()).j();
        }
        wmVar.ud(false);
    }

    @Override // org.telegram.ui.Components.wn
    public final void z(int i3) {
        wm wmVar = this.a;
        if (i3 != 0) {
            wmVar.getNotificationsController().H(wmVar.k6, i3, wmVar.b());
            if (org.telegram.ui.Components.fc.a(wmVar)) {
                org.telegram.ui.Components.fc.z(wmVar, 5, i3, wmVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (wmVar.getMessagesController().r2(wmVar.k6, wmVar.b(), null)) {
            wmVar.Ec(true);
        }
        if (org.telegram.ui.Components.fc.a(wmVar)) {
            org.telegram.ui.Components.fc.z(wmVar, 4, i3, wmVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final /* synthetic */ void p() {
    }
}
