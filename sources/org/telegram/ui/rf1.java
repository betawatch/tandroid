package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rf1 extends org.telegram.ui.Components.n81 {
    public final ArrayList a;
    public final /* synthetic */ sf1 b;

    public rf1(sf1 sf1Var) {
        this.b = sf1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new of1(0));
        of1 of1Var = new of1(2);
        of1Var.b = 0;
        arrayList.add(of1Var);
        of1 of1Var2 = new of1(2);
        of1Var2.b = 1;
        arrayList.add(of1Var2);
        of1 of1Var3 = new of1(2);
        of1Var3.b = 2;
        arrayList.add(of1Var3);
        of1 of1Var4 = new of1(2);
        of1Var4.b = 3;
        arrayList.add(of1Var4);
        of1 of1Var5 = new of1(2);
        of1Var5.b = 4;
        arrayList.add(of1Var5);
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.b;
        sf1Var.K(view, i10, sf1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.b;
        wf1 wf1Var = sf1Var.t0;
        if (i10 == 1) {
            return sf1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(i11, wf1Var);
            in0Var.b.j(new qf1(0));
            in0Var.setUiCallback(sf1Var);
            return in0Var;
        }
        t10 t10Var = new t10(wf1Var);
        t10Var.setChatPreviewDelegate(sf1Var.r0);
        t10Var.setUiCallback(sf1Var);
        t10Var.b.j(new qf1(1));
        return t10Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((of1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((of1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.c3[((of1) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((of1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((of1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((of1) arrayList.get(i10)).a + i10;
    }
}
