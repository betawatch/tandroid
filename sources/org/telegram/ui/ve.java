package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.messenger.vp c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ve(un unVar, CharSequence charSequence, org.telegram.messenger.vp vpVar, boolean z10) {
        this.b = unVar;
        this.d = charSequence;
        this.c = vpVar;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.F1(this.b, this.d, this.c, this.e);
                break;
            default:
                un unVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.xa);
                String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                String L02 = org.telegram.messenger.cd.L0(2131747847, null);
                org.telegram.messenger.vp vpVar = this.c;
                alertDialog$Builder.k(L02, new bi.o4(unVar, vpVar, this.d, this.e, 2));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                x1Var.T = org.telegram.messenger.cd.L0(2131745702, null);
                unVar.showDialog(x1Var);
                vpVar.G2 = 0;
                org.telegram.messenger.vp.d1().edit().putInt("secretWebpage2", vpVar.G2).commit();
                break;
        }
    }

    public /* synthetic */ ve(un unVar, org.telegram.messenger.vp vpVar, CharSequence charSequence, boolean z10) {
        this.b = unVar;
        this.c = vpVar;
        this.d = charSequence;
        this.e = z10;
    }
}
