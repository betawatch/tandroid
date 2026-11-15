package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xi implements org.telegram.ui.Components.ho {
    public final /* synthetic */ an a;

    public xi(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.ho
    public final void F() {
        an anVar = this.a;
        if (anVar.k6 == 0 || anVar.g4 == 3) {
            return;
        }
        if (anVar.f != null) {
            anVar.getMessagesController().X3(anVar.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", anVar.k6);
        if (anVar.b() != 0) {
            bundle.putLong("topic_id", anVar.b());
        }
        anVar.presentFragment(new fx0(bundle, anVar.Aa));
    }

    @Override // org.telegram.ui.Components.ho
    public final void J() {
        int i7;
        an anVar = this.a;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.at.v(anVar.k6, anVar.b(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.at.v(anVar.k6, anVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.cc.a(anVar)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, anVar, anVar.getResourceProvider()).j();
        }
        anVar.yd(false);
    }

    @Override // org.telegram.ui.Components.ho
    public final void R(int i7) {
        an anVar = this.a;
        if (i7 != 0) {
            anVar.getNotificationsController().H(anVar.k6, i7, anVar.b());
            if (org.telegram.ui.Components.cc.a(anVar)) {
                org.telegram.ui.Components.cc.z(anVar, 5, i7, anVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (anVar.getMessagesController().r2(anVar.k6, anVar.b(), null)) {
            anVar.Ic(true);
        }
        if (org.telegram.ui.Components.cc.a(anVar)) {
            org.telegram.ui.Components.cc.z(anVar, 4, i7, anVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ho
    public final void dismiss() {
        this.a.j0.V(null, null);
    }

    @Override // org.telegram.ui.Components.ho
    public final void u() {
        an anVar = this.a;
        anVar.Ic(true);
        org.telegram.ui.Components.cc.A(anVar, anVar.getMessagesController().r2(anVar.k6, anVar.b(), null), anVar.Aa).j();
    }

    @Override // org.telegram.ui.Components.ho
    public final /* synthetic */ void t() {
    }
}
