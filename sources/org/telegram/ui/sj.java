package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sj implements org.telegram.ui.Components.fo {
    public final /* synthetic */ un a;

    public sj(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.fo
    public final void E(int i10) {
        un unVar = this.a;
        if (i10 != 0) {
            unVar.getNotificationsController().H(unVar.j6, i10, unVar.b());
            if (org.telegram.ui.Components.cc.a(unVar)) {
                org.telegram.ui.Components.cc.z(unVar, 5, i10, unVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (unVar.getMessagesController().q2(unVar.j6, unVar.b(), null)) {
            unVar.uc(true);
        }
        if (org.telegram.ui.Components.cc.a(unVar)) {
            org.telegram.ui.Components.cc.z(unVar, 4, i10, unVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void dismiss() {
        this.a.i0.U(null, null);
    }

    @Override // org.telegram.ui.Components.fo
    public final void v() {
        un unVar = this.a;
        unVar.uc(true);
        org.telegram.ui.Components.cc.A(unVar, unVar.getMessagesController().q2(unVar.j6, unVar.b(), null), unVar.xa).j();
    }

    @Override // org.telegram.ui.Components.fo
    public final void x() {
        un unVar = this.a;
        if (unVar.j6 == 0 || unVar.f4 == 3) {
            return;
        }
        if (unVar.f != null) {
            unVar.getMessagesController().U3(unVar.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", unVar.j6);
        if (unVar.b() != 0) {
            bundle.putLong("topic_id", unVar.b());
        }
        unVar.presentFragment(new uy0(bundle, unVar.xa));
    }

    @Override // org.telegram.ui.Components.fo
    public final void y() {
        int i10;
        un unVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.ot.v(unVar.j6, unVar.b(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.ot.v(unVar.j6, unVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.cc.a(unVar)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, unVar, unVar.getResourceProvider()).j();
        }
        unVar.kd(false);
    }

    @Override // org.telegram.ui.Components.fo
    public final /* synthetic */ void n() {
    }
}
