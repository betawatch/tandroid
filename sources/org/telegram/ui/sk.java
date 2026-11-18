package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class sk implements ll {
    public final /* synthetic */ bn a;
    public final /* synthetic */ bn b;

    public sk(bn bnVar, bn bnVar2) {
        this.b = bnVar;
        this.a = bnVar2;
    }

    @Override // org.telegram.ui.ll
    public final void K0(int i7) {
        this.b.l(i7, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ll
    public final void V(boolean z10, boolean z11) {
        org.telegram.ui.Components.eb ebVar;
        int i7;
        bn bnVar = this.b;
        if (!z10) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) bnVar.X4.get(Integer.valueOf(bnVar.Z4));
            if (fjVar == null) {
                fjVar = (org.telegram.messenger.fj) bnVar.G6[0].get(bnVar.Z4);
            }
            bnVar.Kc(fjVar);
            return;
        }
        ArrayList arrayList = new ArrayList(bnVar.V4);
        ArrayList arrayList2 = new ArrayList(bnVar.X4.values());
        org.telegram.ui.Components.gc gcVar = null;
        if (z11) {
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).g7;
            if (bnVar.V4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + bnVar.l6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + bnVar.l6, ((Integer) bnVar.V4.get(0)).intValue()).commit();
            }
            bnVar.gd(0, true);
        } else {
            bnVar.getNotificationCenter().k(org.telegram.messenger.ks.t0, Long.valueOf(bnVar.l6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.gc gcVar2 = bnVar.P3;
        if (gcVar2 != null) {
            gcVar2.b();
        }
        bnVar.Q3 = true;
        int i10 = bnVar.R3 + 1;
        bnVar.R3 = i10;
        boolean z12 = bnVar.x4;
        bn bnVar2 = this.a;
        int c92 = z12 ? bnVar2.c9() : bnVar.c9();
        ArrayList arrayList3 = new ArrayList(bnVar.x4 ? bnVar2.V4 : bnVar.V4);
        rk rkVar = new rk(this, z11, arrayList, arrayList2, c92, i10);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i10);
        zm zmVar = bnVar.Ba;
        if (bnVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(bnVar.getParentActivity(), zmVar);
                dcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                dcVar.b.setText(org.telegram.messenger.gd.M0(2131747031, null));
                dcVar.c.setText(org.telegram.messenger.gd.M0(2131747030, null));
                ebVar = dcVar;
            } else {
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(bnVar.getParentActivity(), zmVar);
                obVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                obVar.b.setText(org.telegram.messenger.gd.G(c92, "MessagesUnpinned", new Object[0]));
                ebVar = obVar;
            }
            org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(bnVar.getParentActivity(), zmVar, true);
            ecVar.b = rkVar;
            ecVar.c = l0Var;
            ebVar.setButton(ecVar);
            gcVar = org.telegram.ui.Components.gc.g(bnVar, ebVar, 5000);
        }
        bnVar.P3 = gcVar;
    }

    @Override // org.telegram.ui.ll
    public final void x0(String str) {
        this.b.Ga(str, false);
    }
}
