package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class zf1 extends org.telegram.ui.Components.a81 {
    public final ArrayList a;
    public final /* synthetic */ ag1 b;

    public zf1(ag1 ag1Var) {
        this.b = ag1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new wf1(0));
        wf1 wf1Var = new wf1(2);
        wf1Var.b = 0;
        arrayList.add(wf1Var);
        wf1 wf1Var2 = new wf1(2);
        wf1Var2.b = 1;
        arrayList.add(wf1Var2);
        wf1 wf1Var3 = new wf1(2);
        wf1Var3.b = 2;
        arrayList.add(wf1Var3);
        wf1 wf1Var4 = new wf1(2);
        wf1Var4.b = 3;
        arrayList.add(wf1Var4);
        wf1 wf1Var5 = new wf1(2);
        wf1Var5.b = 4;
        arrayList.add(wf1Var5);
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        ag1 ag1Var = this.b;
        ag1Var.K(view, i10, ag1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        int i11;
        ag1 ag1Var = this.b;
        eg1 eg1Var = ag1Var.t0;
        if (i10 == 1) {
            return ag1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(i11, eg1Var);
            vm0Var.b.j(new yf1(0));
            vm0Var.setUiCallback(ag1Var);
            return vm0Var;
        }
        x10 x10Var = new x10(eg1Var);
        x10Var.setChatPreviewDelegate(ag1Var.r0);
        x10Var.setUiCallback(ag1Var);
        x10Var.b.j(new yf1(1));
        return x10Var;
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((wf1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((wf1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.q0 q0Var = hg.s0.c3[((wf1) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((wf1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((wf1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((wf1) arrayList.get(i10)).a + i10;
    }
}
