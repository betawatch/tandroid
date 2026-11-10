package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.Components.ya yaVar;
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
        org.telegram.ui.Components.bc bcVar = null;
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
        org.telegram.ui.Components.bc bcVar2 = cnVar.O3;
        if (bcVar2 != null) {
            bcVar2.b();
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
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(cnVar.getParentActivity(), anVar);
                ybVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                ybVar.b.setText(org.telegram.messenger.id.M0(2131747224, null));
                ybVar.c.setText(org.telegram.messenger.id.M0(2131747223, null));
                yaVar = ybVar;
            } else {
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(cnVar.getParentActivity(), anVar);
                jbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                jbVar.b.setText(org.telegram.messenger.id.G(b92, "MessagesUnpinned", new Object[0]));
                yaVar = jbVar;
            }
            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(cnVar.getParentActivity(), anVar, true);
            zbVar.b = skVar;
            zbVar.c = k0Var;
            yaVar.setButton(zbVar);
            bcVar = org.telegram.ui.Components.bc.g(cnVar, yaVar, 5000);
        }
        cnVar.O3 = bcVar;
    }

    @Override // org.telegram.ui.ml
    public final void w0(String str) {
        this.b.Fa(str, false);
    }
}
