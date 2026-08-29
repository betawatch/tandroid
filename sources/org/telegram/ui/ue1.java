package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ue1 extends org.telegram.ui.Components.q71 {
    public final ArrayList a;
    public final /* synthetic */ ve1 b;

    public ue1(ve1 ve1Var) {
        this.b = ve1Var;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new re1(0));
        re1 re1Var = new re1(2);
        re1Var.b = 0;
        arrayList.add(re1Var);
        re1 re1Var2 = new re1(2);
        re1Var2.b = 1;
        arrayList.add(re1Var2);
        re1 re1Var3 = new re1(2);
        re1Var3.b = 2;
        arrayList.add(re1Var3);
        re1 re1Var4 = new re1(2);
        re1Var4.b = 3;
        arrayList.add(re1Var4);
        re1 re1Var5 = new re1(2);
        re1Var5.b = 4;
        arrayList.add(re1Var5);
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        ve1 ve1Var = this.b;
        ve1Var.K(view, i10, ve1Var.U, true);
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        int i11;
        ve1 ve1Var = this.b;
        ze1 ze1Var = ve1Var.p0;
        if (i10 == 1) {
            return ve1Var.P;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
            org.telegram.ui.Components.tm0 tm0Var = new org.telegram.ui.Components.tm0(i11, ze1Var);
            tm0Var.b.j(new te1(0));
            tm0Var.setUiCallback(ve1Var);
            return tm0Var;
        }
        h10 h10Var = new h10(ze1Var);
        h10Var.setChatPreviewDelegate(ve1Var.n0);
        h10Var.setUiCallback(ve1Var);
        h10Var.b.j(new te1(1));
        return h10Var;
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.a.size();
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.a;
        if (((re1) arrayList.get(i10)).a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((re1) arrayList.get(i10)).a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        rf.f0 f0Var = rf.h0.Y2[((re1) arrayList.get(i10)).b];
        String str = f0Var.c;
        return str != null ? str : LocaleController.getString(f0Var.b);
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        ArrayList arrayList = this.a;
        if (((re1) arrayList.get(i10)).a == 0) {
            return 1;
        }
        if (((re1) arrayList.get(i10)).a == 1) {
            return 2;
        }
        return ((re1) arrayList.get(i10)).a + i10;
    }
}
