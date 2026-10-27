package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xe1 extends org.telegram.ui.Components.n91 {
    public final ArrayList a;
    public final /* synthetic */ ye1 b;

    public xe1(ye1 ye1Var) {
        this.b = ye1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new ue1(0));
        ue1 ue1Var = new ue1(2);
        ue1Var.b = 0;
        arrayList.add(ue1Var);
        ue1 ue1Var2 = new ue1(2);
        ue1Var2.b = 1;
        arrayList.add(ue1Var2);
        ue1 ue1Var3 = new ue1(2);
        ue1Var3.b = 2;
        arrayList.add(ue1Var3);
        ue1 ue1Var4 = new ue1(2);
        ue1Var4.b = 3;
        arrayList.add(ue1Var4);
        ue1 ue1Var5 = new ue1(2);
        ue1Var5.b = 4;
        arrayList.add(ue1Var5);
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        ye1 ye1Var = this.b;
        ye1Var.M(view, i10, ye1Var.d0, true);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        int i11;
        ye1 ye1Var = this.b;
        cf1 cf1Var = ye1Var.v0;
        if (i10 == 1) {
            return ye1Var.V;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(i11, cf1Var);
            do0Var.b.j(new we1(0));
            do0Var.setUiCallback(ye1Var);
            return do0Var;
        }
        j10 j10Var = new j10(cf1Var);
        j10Var.setChatPreviewDelegate(ye1Var.t0);
        j10Var.setUiCallback(ye1Var);
        j10Var.b.j(new we1(1));
        return j10Var;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((ue1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ue1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        ig.p0 p0Var = ig.r0.k3[((ue1) arrayList.get(i10)).b];
        String str = p0Var.c;
        return str != null ? str : LocaleController.getString(p0Var.b);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((ue1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((ue1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((ue1) arrayList.get(i10)).a + i10;
    }
}
