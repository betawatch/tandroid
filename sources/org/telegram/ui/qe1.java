package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qe1 extends org.telegram.ui.Components.e71 {
    public final ArrayList a;
    public final /* synthetic */ re1 b;

    public qe1(re1 re1Var) {
        this.b = re1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new ne1(0));
        ne1 ne1Var = new ne1(2);
        ne1Var.b = 0;
        arrayList.add(ne1Var);
        ne1 ne1Var2 = new ne1(2);
        ne1Var2.b = 1;
        arrayList.add(ne1Var2);
        ne1 ne1Var3 = new ne1(2);
        ne1Var3.b = 2;
        arrayList.add(ne1Var3);
        ne1 ne1Var4 = new ne1(2);
        ne1Var4.b = 3;
        arrayList.add(ne1Var4);
        ne1 ne1Var5 = new ne1(2);
        ne1Var5.b = 4;
        arrayList.add(ne1Var5);
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        re1 re1Var = this.b;
        re1Var.K(view, i9, re1Var.U, true);
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        int i10;
        re1 re1Var = this.b;
        we1 we1Var = re1Var.p0;
        if (i9 == 1) {
            return re1Var.P;
        }
        if (i9 == 2) {
            i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            org.telegram.ui.Components.gm0 gm0Var = new org.telegram.ui.Components.gm0(i10, we1Var);
            gm0Var.b.j(new pe1(0));
            gm0Var.setUiCallback(re1Var);
            return gm0Var;
        }
        f10 f10Var = new f10(we1Var);
        f10Var.setChatPreviewDelegate(re1Var.n0);
        f10Var.setUiCallback(re1Var);
        f10Var.b.j(new pe1(1));
        return f10Var;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        ArrayList arrayList = this.a;
        if (((ne1) arrayList.get(i9)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ne1) arrayList.get(i9)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        of.m0 m0Var = of.o0.Y2[((ne1) arrayList.get(i9)).b];
        String str = m0Var.c;
        return str != null ? str : LocaleController.getString(m0Var.b);
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        ArrayList arrayList = this.a;
        if (((ne1) arrayList.get(i9)).a == 0) {
            return 1;
        }
        if (((ne1) arrayList.get(i9)).a == 1) {
            return 2;
        }
        return ((ne1) arrayList.get(i9)).a + i9;
    }
}
