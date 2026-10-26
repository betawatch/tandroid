package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ve1 extends org.telegram.ui.Components.m91 {
    public final ArrayList a;
    public final /* synthetic */ we1 b;

    public ve1(we1 we1Var) {
        this.b = we1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new se1(0));
        se1 se1Var = new se1(2);
        se1Var.b = 0;
        arrayList.add(se1Var);
        se1 se1Var2 = new se1(2);
        se1Var2.b = 1;
        arrayList.add(se1Var2);
        se1 se1Var3 = new se1(2);
        se1Var3.b = 2;
        arrayList.add(se1Var3);
        se1 se1Var4 = new se1(2);
        se1Var4.b = 3;
        arrayList.add(se1Var4);
        se1 se1Var5 = new se1(2);
        se1Var5.b = 4;
        arrayList.add(se1Var5);
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        we1 we1Var = this.b;
        we1Var.M(view, i10, we1Var.d0, true);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        int i11;
        we1 we1Var = this.b;
        af1 af1Var = we1Var.v0;
        if (i10 == 1) {
            return we1Var.V;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
            org.telegram.ui.Components.co0 co0Var = new org.telegram.ui.Components.co0(i11, af1Var);
            co0Var.b.j(new ue1(0));
            co0Var.setUiCallback(we1Var);
            return co0Var;
        }
        h10 h10Var = new h10(af1Var);
        h10Var.setChatPreviewDelegate(we1Var.t0);
        h10Var.setUiCallback(we1Var);
        h10Var.b.j(new ue1(1));
        return h10Var;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((se1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((se1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        ig.p0 p0Var = ig.r0.k3[((se1) arrayList.get(i10)).b];
        String str = p0Var.c;
        return str != null ? str : LocaleController.getString(p0Var.b);
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((se1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((se1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((se1) arrayList.get(i10)).a + i10;
    }
}
