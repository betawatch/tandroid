package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class tf1 extends org.telegram.ui.Components.x81 {
    public final ArrayList a;
    public final /* synthetic */ uf1 b;

    public tf1(uf1 uf1Var) {
        this.b = uf1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new qf1(0));
        qf1 qf1Var = new qf1(2);
        qf1Var.b = 0;
        arrayList.add(qf1Var);
        qf1 qf1Var2 = new qf1(2);
        qf1Var2.b = 1;
        arrayList.add(qf1Var2);
        qf1 qf1Var3 = new qf1(2);
        qf1Var3.b = 2;
        arrayList.add(qf1Var3);
        qf1 qf1Var4 = new qf1(2);
        qf1Var4.b = 3;
        arrayList.add(qf1Var4);
        qf1 qf1Var5 = new qf1(2);
        qf1Var5.b = 4;
        arrayList.add(qf1Var5);
    }

    @Override // org.telegram.ui.Components.x81
    public final void b(View view, int i10, int i11) {
        uf1 uf1Var = this.b;
        uf1Var.M(view, i10, uf1Var.c0, true);
    }

    @Override // org.telegram.ui.Components.x81
    public final View d(int i10) {
        int i11;
        uf1 uf1Var = this.b;
        yf1 yf1Var = uf1Var.u0;
        if (i10 == 1) {
            return uf1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
            org.telegram.ui.Components.on0 on0Var = new org.telegram.ui.Components.on0(i11, yf1Var);
            on0Var.b.j(new sf1(0));
            on0Var.setUiCallback(uf1Var);
            return on0Var;
        }
        x10 x10Var = new x10(yf1Var);
        x10Var.setChatPreviewDelegate(uf1Var.s0);
        x10Var.setUiCallback(uf1Var);
        x10Var.b.j(new sf1(1));
        return x10Var;
    }

    @Override // org.telegram.ui.Components.x81
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.x81
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((qf1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((qf1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((qf1) arrayList.get(i10)).b];
        String str = q0Var.c;
        return str != null ? str : LocaleController.getString(q0Var.b);
    }

    @Override // org.telegram.ui.Components.x81
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((qf1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((qf1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((qf1) arrayList.get(i10)).a + i10;
    }
}
