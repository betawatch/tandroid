package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class xi implements org.telegram.ui.Components.xn {
    public final /* synthetic */ an a;

    public xi(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.xn
    public final void L() {
        int i7;
        an anVar = this.a;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.dt.v(anVar.j6, anVar.b(), false), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(anVar.j6, anVar.b(), false), z10).apply();
        if (org.telegram.ui.Components.hc.a(anVar)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, anVar, anVar.getResourceProvider()).j();
        }
        anVar.ud(false);
    }

    @Override // org.telegram.ui.Components.xn
    public final void R(int i7) {
        an anVar = this.a;
        if (i7 != 0) {
            anVar.getNotificationsController().H(anVar.j6, i7, anVar.b());
            if (org.telegram.ui.Components.hc.a(anVar)) {
                org.telegram.ui.Components.hc.z(anVar, 5, i7, anVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (anVar.getMessagesController().r2(anVar.j6, anVar.b(), null)) {
            anVar.Ec(true);
        }
        if (org.telegram.ui.Components.hc.a(anVar)) {
            org.telegram.ui.Components.hc.z(anVar, 4, i7, anVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void dismiss() {
        this.a.i0.U(null, null);
    }

    @Override // org.telegram.ui.Components.xn
    public final void p() {
        an anVar = this.a;
        anVar.Ec(true);
        org.telegram.ui.Components.hc.A(anVar, anVar.getMessagesController().r2(anVar.j6, anVar.b(), null), anVar.xa).j();
    }

    @Override // org.telegram.ui.Components.xn
    public final void y() {
        an anVar = this.a;
        if (anVar.j6 == 0 || anVar.f4 == 3) {
            return;
        }
        if (anVar.f != null) {
            anVar.getMessagesController().X3(anVar.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", anVar.j6);
        if (anVar.b() != 0) {
            bundle.putLong("topic_id", anVar.b());
        }
        anVar.presentFragment(new gx0(bundle, anVar.xa));
    }

    @Override // org.telegram.ui.Components.xn
    public final /* synthetic */ void n() {
    }
}
