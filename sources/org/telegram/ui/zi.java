package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zi implements org.telegram.ui.Components.xn {
    public final /* synthetic */ cn a;

    public zi(cn cnVar) {
        this.a = cnVar;
    }

    @Override // org.telegram.ui.Components.xn
    public final void L() {
        int i7;
        cn cnVar = this.a;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.dt.v(cnVar.j6, cnVar.b(), false), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(cnVar.j6, cnVar.b(), false), z10).apply();
        if (org.telegram.ui.Components.hc.a(cnVar)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, cnVar, cnVar.getResourceProvider()).j();
        }
        cnVar.xd(false);
    }

    @Override // org.telegram.ui.Components.xn
    public final void R(int i7) {
        cn cnVar = this.a;
        if (i7 != 0) {
            cnVar.getNotificationsController().H(cnVar.j6, i7, cnVar.b());
            if (org.telegram.ui.Components.hc.a(cnVar)) {
                org.telegram.ui.Components.hc.z(cnVar, 5, i7, cnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (cnVar.getMessagesController().r2(cnVar.j6, cnVar.b(), null)) {
            cnVar.Hc(true);
        }
        if (org.telegram.ui.Components.hc.a(cnVar)) {
            org.telegram.ui.Components.hc.z(cnVar, 4, i7, cnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void dismiss() {
        this.a.i0.U(null, null);
    }

    @Override // org.telegram.ui.Components.xn
    public final void p() {
        cn cnVar = this.a;
        cnVar.Hc(true);
        org.telegram.ui.Components.hc.A(cnVar, cnVar.getMessagesController().r2(cnVar.j6, cnVar.b(), null), cnVar.za).j();
    }

    @Override // org.telegram.ui.Components.xn
    public final void y() {
        cn cnVar = this.a;
        if (cnVar.j6 == 0 || cnVar.f4 == 3) {
            return;
        }
        if (cnVar.f != null) {
            cnVar.getMessagesController().X3(cnVar.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", cnVar.j6);
        if (cnVar.b() != 0) {
            bundle.putLong("topic_id", cnVar.b());
        }
        cnVar.presentFragment(new kx0(bundle, cnVar.za));
    }

    @Override // org.telegram.ui.Components.xn
    public final /* synthetic */ void n() {
    }
}
