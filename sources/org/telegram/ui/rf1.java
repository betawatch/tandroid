package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class rf1 extends org.telegram.ui.Components.y81 {
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

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.b;
        sf1Var.M(view, i10, sf1Var.d0, true);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.b;
        wf1 wf1Var = sf1Var.v0;
        if (i10 == 1) {
            return sf1Var.V;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
            org.telegram.ui.Components.on0 on0Var = new org.telegram.ui.Components.on0(i11, wf1Var);
            on0Var.b.j(new qf1(0));
            on0Var.setUiCallback(sf1Var);
            return on0Var;
        }
        x10 x10Var = new x10(wf1Var);
        x10Var.setChatPreviewDelegate(sf1Var.t0);
        x10Var.setUiCallback(sf1Var);
        x10Var.b.j(new qf1(1));
        return x10Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((of1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((of1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((of1) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.y81
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
