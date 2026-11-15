package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rk implements kl {
    public final /* synthetic */ an a;
    public final /* synthetic */ an b;

    public rk(an anVar, an anVar2) {
        this.b = anVar;
        this.a = anVar2;
    }

    @Override // org.telegram.ui.kl
    public final void P0(int i7) {
        this.b.l(i7, 0, true, 0, true, 0);
    }

    @Override // org.telegram.ui.kl
    public final void Y(boolean z10, boolean z11) {
        org.telegram.ui.Components.va vaVar;
        int i7;
        an anVar = this.b;
        if (!z10) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) anVar.W4.get(Integer.valueOf(anVar.Y4));
            if (gjVar == null) {
                gjVar = (org.telegram.messenger.gj) anVar.F6[0].get(anVar.Y4);
            }
            anVar.Kc(gjVar);
            return;
        }
        ArrayList arrayList = new ArrayList(anVar.U4);
        ArrayList arrayList2 = new ArrayList(anVar.W4.values());
        org.telegram.ui.Components.xb xbVar = null;
        if (z11) {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).e7;
            if (anVar.U4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + anVar.k6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + anVar.k6, ((Integer) anVar.U4.get(0)).intValue()).commit();
            }
            anVar.gd(0, true);
        } else {
            anVar.getNotificationCenter().k(org.telegram.messenger.ns.t0, Long.valueOf(anVar.k6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.xb xbVar2 = anVar.P3;
        if (xbVar2 != null) {
            xbVar2.b();
        }
        anVar.Q3 = true;
        int i10 = anVar.R3 + 1;
        anVar.R3 = i10;
        boolean z12 = anVar.w4;
        an anVar2 = this.a;
        int c92 = z12 ? anVar2.c9() : anVar.c9();
        ArrayList arrayList3 = new ArrayList(anVar.w4 ? anVar2.U4 : anVar.U4);
        qk qkVar = new qk(this, z11, arrayList, arrayList2, c92, i10);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList3, i10);
        ym ymVar = anVar.Aa;
        if (anVar.getParentActivity() == null) {
            l0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(anVar.getParentActivity(), ymVar);
                ubVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ubVar.b.setText(org.telegram.messenger.hd.M0(2131747224, null));
                ubVar.c.setText(org.telegram.messenger.hd.M0(2131747223, null));
                vaVar = ubVar;
            } else {
                org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(anVar.getParentActivity(), ymVar);
                fbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                fbVar.b.setText(org.telegram.messenger.hd.G(c92, "MessagesUnpinned", new Object[0]));
                vaVar = fbVar;
            }
            org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(anVar.getParentActivity(), ymVar, true);
            vbVar.b = qkVar;
            vbVar.c = l0Var;
            vaVar.setButton(vbVar);
            xbVar = org.telegram.ui.Components.xb.g(anVar, vaVar, 5000);
        }
        anVar.P3 = xbVar;
    }

    @Override // org.telegram.ui.kl
    public final void v0(String str) {
        this.b.Ga(str, false);
    }
}
