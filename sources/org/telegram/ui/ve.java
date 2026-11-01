package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.messenger.wp c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ve(un unVar, CharSequence charSequence, org.telegram.messenger.wp wpVar, boolean z10) {
        this.b = unVar;
        this.d = charSequence;
        this.c = wpVar;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.Z0(this.b, this.d, this.c, this.e);
                break;
            default:
                un unVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.xa);
                String L0 = org.telegram.messenger.dd.L0(R.string.AppName, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                String L02 = org.telegram.messenger.dd.L0(2131747847, null);
                org.telegram.messenger.wp wpVar = this.c;
                alertDialog$Builder.k(L02, new bi.o4(unVar, wpVar, this.d, this.e, 2));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                x1Var.T = org.telegram.messenger.dd.L0(2131745702, null);
                unVar.showDialog(x1Var);
                wpVar.G2 = 0;
                org.telegram.messenger.wp.d1().edit().putInt("secretWebpage2", wpVar.G2).commit();
                break;
        }
    }

    public /* synthetic */ ve(un unVar, org.telegram.messenger.wp wpVar, CharSequence charSequence, boolean z10) {
        this.b = unVar;
        this.c = wpVar;
        this.d = charSequence;
        this.e = z10;
    }
}
