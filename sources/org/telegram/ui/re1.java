package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class re1 extends org.telegram.ui.Components.g71 {
    public final ArrayList a;
    public final /* synthetic */ se1 b;

    public re1(se1 se1Var) {
        this.b = se1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new oe1(0));
        oe1 oe1Var = new oe1(2);
        oe1Var.b = 0;
        arrayList.add(oe1Var);
        oe1 oe1Var2 = new oe1(2);
        oe1Var2.b = 1;
        arrayList.add(oe1Var2);
        oe1 oe1Var3 = new oe1(2);
        oe1Var3.b = 2;
        arrayList.add(oe1Var3);
        oe1 oe1Var4 = new oe1(2);
        oe1Var4.b = 3;
        arrayList.add(oe1Var4);
        oe1 oe1Var5 = new oe1(2);
        oe1Var5.b = 4;
        arrayList.add(oe1Var5);
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        se1 se1Var = this.b;
        se1Var.K(view, i10, se1Var.U, true);
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        int i11;
        se1 se1Var = this.b;
        we1 we1Var = se1Var.p0;
        if (i10 == 1) {
            return se1Var.P;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount;
            org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(i11, we1Var);
            jm0Var.b.j(new qe1(0));
            jm0Var.setUiCallback(se1Var);
            return jm0Var;
        }
        i10 i10Var = new i10(we1Var);
        i10Var.setChatPreviewDelegate(se1Var.n0);
        i10Var.setUiCallback(se1Var);
        i10Var.b.j(new qe1(1));
        return i10Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((oe1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((oe1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        pf.e0 e0Var = pf.g0.Y2[((oe1) arrayList.get(i10)).b];
        String str = e0Var.c;
        return str != null ? str : LocaleController.getString(e0Var.b);
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((oe1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((oe1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((oe1) arrayList.get(i10)).a + i10;
    }
}
