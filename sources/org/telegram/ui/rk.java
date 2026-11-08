package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rk implements kl {
    public final /* synthetic */ an a;
    public final /* synthetic */ an b;

    public rk(an anVar, an anVar2) {
        this.b = anVar;
        this.a = anVar2;
    }

    @Override // org.telegram.ui.kl
    public final void T0(int i7) {
        this.b.l(i7, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.kl
    public final void Y(boolean z9, boolean z10) {
        org.telegram.ui.Components.za zaVar;
        int i7;
        an anVar = this.b;
        if (!z9) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) anVar.V4.get(Integer.valueOf(anVar.X4));
            if (ijVar == null) {
                ijVar = (org.telegram.messenger.ij) anVar.E6[0].get(anVar.X4);
            }
            anVar.Gc(ijVar);
            return;
        }
        ArrayList arrayList = new ArrayList(anVar.T4);
        ArrayList arrayList2 = new ArrayList(anVar.V4.values());
        org.telegram.ui.Components.cc ccVar = null;
        if (z10) {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
            if (anVar.T4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + anVar.j6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + anVar.j6, ((Integer) anVar.T4.get(0)).intValue()).commit();
            }
            anVar.cd(0, true);
        } else {
            anVar.getNotificationCenter().k(org.telegram.messenger.qs.t0, Long.valueOf(anVar.j6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.cc ccVar2 = anVar.O3;
        if (ccVar2 != null) {
            ccVar2.b();
        }
        anVar.P3 = true;
        int i10 = anVar.Q3 + 1;
        anVar.Q3 = i10;
        boolean z11 = anVar.v4;
        an anVar2 = this.a;
        int a92 = z11 ? anVar2.a9() : anVar.a9();
        ArrayList arrayList3 = new ArrayList(anVar.v4 ? anVar2.T4 : anVar.T4);
        qk qkVar = new qk(this, z10, arrayList, arrayList2, a92, i10);
        org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z10, arrayList3, i10);
        ym ymVar = anVar.xa;
        if (anVar.getParentActivity() == null) {
            k0Var.run();
        } else {
            if (z10) {
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(anVar.getParentActivity(), ymVar);
                zbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                zbVar.b.setText(org.telegram.messenger.id.M0(2131747225, null));
                zbVar.c.setText(org.telegram.messenger.id.M0(2131747224, null));
                zaVar = zbVar;
            } else {
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(anVar.getParentActivity(), ymVar);
                kbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                kbVar.b.setText(org.telegram.messenger.id.G(a92, "MessagesUnpinned", new Object[0]));
                zaVar = kbVar;
            }
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(anVar.getParentActivity(), ymVar, true);
            acVar.b = qkVar;
            acVar.c = k0Var;
            zaVar.setButton(acVar);
            ccVar = org.telegram.ui.Components.cc.g(anVar, zaVar, 5000);
        }
        anVar.O3 = ccVar;
    }

    @Override // org.telegram.ui.kl
    public final void w0(String str) {
        this.b.Da(str, false);
    }
}
