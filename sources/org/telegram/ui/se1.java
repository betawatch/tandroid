package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class se1 extends org.telegram.ui.Components.d91 {
    public final ArrayList a;
    public final /* synthetic */ te1 b;

    public se1(te1 te1Var) {
        this.b = te1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new pe1(0));
        pe1 pe1Var = new pe1(2);
        pe1Var.b = 0;
        arrayList.add(pe1Var);
        pe1 pe1Var2 = new pe1(2);
        pe1Var2.b = 1;
        arrayList.add(pe1Var2);
        pe1 pe1Var3 = new pe1(2);
        pe1Var3.b = 2;
        arrayList.add(pe1Var3);
        pe1 pe1Var4 = new pe1(2);
        pe1Var4.b = 3;
        arrayList.add(pe1Var4);
        pe1 pe1Var5 = new pe1(2);
        pe1Var5.b = 4;
        arrayList.add(pe1Var5);
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        te1 te1Var = this.b;
        te1Var.K(view, i10, te1Var.b0, true);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        int i11;
        te1 te1Var = this.b;
        ye1 ye1Var = te1Var.t0;
        if (i10 == 1) {
            return te1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
            org.telegram.ui.Components.xn0 xn0Var = new org.telegram.ui.Components.xn0(i11, ye1Var);
            xn0Var.b.j(new re1(0));
            xn0Var.setUiCallback(te1Var);
            return xn0Var;
        }
        i10 i10Var = new i10(ye1Var);
        i10Var.setChatPreviewDelegate(te1Var.r0);
        i10Var.setUiCallback(te1Var);
        i10Var.b.j(new re1(1));
        return i10Var;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((pe1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((pe1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.d3[((pe1) arrayList.get(i10)).b];
        String str = o0Var.c;
        return str != null ? str : LocaleController.getString(o0Var.b);
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((pe1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((pe1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((pe1) arrayList.get(i10)).a + i10;
    }
}
