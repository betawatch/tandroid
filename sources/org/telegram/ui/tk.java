package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tk implements ml {
    public final /* synthetic */ cn a;
    public final /* synthetic */ cn b;

    public tk(cn cnVar, cn cnVar2) {
        this.b = cnVar;
        this.a = cnVar2;
    }

    @Override // org.telegram.ui.ml
    public final void T0(int i7) {
        this.b.l(i7, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.ml
    public final void Y(boolean z9, boolean z10) {
        org.telegram.ui.Components.za zaVar;
        int i7;
        cn cnVar = this.b;
        if (!z9) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) cnVar.V4.get(Integer.valueOf(cnVar.X4));
            if (ijVar == null) {
                ijVar = (org.telegram.messenger.ij) cnVar.E6[0].get(cnVar.X4);
            }
            cnVar.Jc(ijVar);
            return;
        }
        ArrayList arrayList = new ArrayList(cnVar.T4);
        ArrayList arrayList2 = new ArrayList(cnVar.V4.values());
        org.telegram.ui.Components.cc ccVar = null;
        if (z10) {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
            if (cnVar.T4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + cnVar.j6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + cnVar.j6, ((Integer) cnVar.T4.get(0)).intValue()).commit();
            }
            cnVar.fd(0, true);
        } else {
            cnVar.getNotificationCenter().k(org.telegram.messenger.qs.t0, Long.valueOf(cnVar.j6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.cc ccVar2 = cnVar.O3;
        if (ccVar2 != null) {
            ccVar2.b();
        }
        cnVar.P3 = true;
        int i10 = cnVar.Q3 + 1;
        cnVar.Q3 = i10;
        boolean z11 = cnVar.v4;
        cn cnVar2 = this.a;
        int b92 = z11 ? cnVar2.b9() : cnVar.b9();
        ArrayList arrayList3 = new ArrayList(cnVar.v4 ? cnVar2.T4 : cnVar.T4);
        sk skVar = new sk(this, z10, arrayList, arrayList2, b92, i10);
        org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z10, arrayList3, i10);
        an anVar = cnVar.za;
        if (cnVar.getParentActivity() == null) {
            k0Var.run();
        } else {
            if (z10) {
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(cnVar.getParentActivity(), anVar);
                zbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                zbVar.b.setText(org.telegram.messenger.id.M0(2131747224, null));
                zbVar.c.setText(org.telegram.messenger.id.M0(2131747223, null));
                zaVar = zbVar;
            } else {
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(cnVar.getParentActivity(), anVar);
                kbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                kbVar.b.setText(org.telegram.messenger.id.G(b92, "MessagesUnpinned", new Object[0]));
                zaVar = kbVar;
            }
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(cnVar.getParentActivity(), anVar, true);
            acVar.b = skVar;
            acVar.c = k0Var;
            zaVar.setButton(acVar);
            ccVar = org.telegram.ui.Components.cc.g(cnVar, zaVar, 5000);
        }
        cnVar.O3 = ccVar;
    }

    @Override // org.telegram.ui.ml
    public final void w0(String str) {
        this.b.Fa(str, false);
    }
}
