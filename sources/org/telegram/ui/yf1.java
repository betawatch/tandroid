package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class yf1 extends org.telegram.ui.Components.o81 {
    public final ArrayList a;
    public final /* synthetic */ zf1 b;

    public yf1(zf1 zf1Var) {
        this.b = zf1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new vf1(0));
        vf1 vf1Var = new vf1(2);
        vf1Var.b = 0;
        arrayList.add(vf1Var);
        vf1 vf1Var2 = new vf1(2);
        vf1Var2.b = 1;
        arrayList.add(vf1Var2);
        vf1 vf1Var3 = new vf1(2);
        vf1Var3.b = 2;
        arrayList.add(vf1Var3);
        vf1 vf1Var4 = new vf1(2);
        vf1Var4.b = 3;
        arrayList.add(vf1Var4);
        vf1 vf1Var5 = new vf1(2);
        vf1Var5.b = 4;
        arrayList.add(vf1Var5);
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        zf1 zf1Var = this.b;
        zf1Var.L(view, i10, zf1Var.c0, true);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        int i11;
        zf1 zf1Var = this.b;
        dg1 dg1Var = zf1Var.u0;
        if (i10 == 1) {
            return zf1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            org.telegram.ui.Components.jn0 jn0Var = new org.telegram.ui.Components.jn0(i11, dg1Var);
            jn0Var.b.j(new xf1(0));
            jn0Var.setUiCallback(zf1Var);
            return jn0Var;
        }
        x10 x10Var = new x10(dg1Var);
        x10Var.setChatPreviewDelegate(zf1Var.s0);
        x10Var.setUiCallback(zf1Var);
        x10Var.b.j(new xf1(1));
        return x10Var;
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((vf1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((vf1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.c3[((vf1) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((vf1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((vf1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((vf1) arrayList.get(i10)).a + i10;
    }
}
