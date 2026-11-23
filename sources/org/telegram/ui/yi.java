package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yi implements org.telegram.ui.Components.no {
    public final /* synthetic */ bn a;

    public yi(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.Components.no
    public final void J() {
        int i7;
        bn bnVar = this.a;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + org.telegram.messenger.xs.v(bnVar.l6, bnVar.b(), false), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(bnVar.l6, bnVar.b(), false), z11).apply();
        if (org.telegram.ui.Components.kc.a(bnVar)) {
            org.telegram.ui.Components.kc.S(z10 ? 1 : 0, bnVar, bnVar.getResourceProvider()).j();
        }
        bnVar.yd(false);
    }

    @Override // org.telegram.ui.Components.no
    public final void Q(int i7) {
        bn bnVar = this.a;
        if (i7 != 0) {
            bnVar.getNotificationsController().H(bnVar.l6, i7, bnVar.b());
            if (org.telegram.ui.Components.kc.a(bnVar)) {
                org.telegram.ui.Components.kc.z(bnVar, 5, i7, bnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (bnVar.getMessagesController().u2(bnVar.l6, bnVar.b(), null)) {
            bnVar.Ic(true);
        }
        if (org.telegram.ui.Components.kc.a(bnVar)) {
            org.telegram.ui.Components.kc.z(bnVar, 4, i7, bnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.no
    public final void dismiss() {
        this.a.j0.V(null, null);
    }

    @Override // org.telegram.ui.Components.no
    public final void v() {
        bn bnVar = this.a;
        bnVar.Ic(true);
        org.telegram.ui.Components.kc.A(bnVar, bnVar.getMessagesController().u2(bnVar.l6, bnVar.b(), null), bnVar.Ba).j();
    }

    @Override // org.telegram.ui.Components.no
    public final void y() {
        bn bnVar = this.a;
        if (bnVar.l6 == 0 || bnVar.g4 == 3) {
            return;
        }
        if (bnVar.f != null) {
            bnVar.getMessagesController().e4(bnVar.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", bnVar.l6);
        if (bnVar.b() != 0) {
            bundle.putLong("topic_id", bnVar.b());
        }
        bnVar.presentFragment(new hx0(bundle, bnVar.Ba));
    }

    @Override // org.telegram.ui.Components.no
    public final /* synthetic */ void u() {
    }
}
