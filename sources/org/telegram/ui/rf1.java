package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rf1 extends org.telegram.ui.Components.z71 {
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

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.b;
        sf1Var.K(view, i10, sf1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.b;
        wf1 wf1Var = sf1Var.t0;
        if (i10 == 1) {
            return sf1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
            org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(i11, wf1Var);
            wm0Var.b.j(new qf1(0));
            wm0Var.setUiCallback(sf1Var);
            return wm0Var;
        }
        u10 u10Var = new u10(wf1Var);
        u10Var.setChatPreviewDelegate(sf1Var.r0);
        u10Var.setUiCallback(sf1Var);
        u10Var.b.j(new qf1(1));
        return u10Var;
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.z71
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

    @Override // org.telegram.ui.Components.z71
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
