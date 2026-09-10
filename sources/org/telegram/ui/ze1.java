package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef1 b;

    public /* synthetic */ ze1(ef1 ef1Var, int i10) {
        this.a = i10;
        this.b = ef1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ef1 ef1Var = this.b;
                ef1Var.getClass();
                new qg.a1((org.telegram.ui.ActionBar.p2) ef1Var, 11, false).show();
                break;
            default:
                ef1 ef1Var2 = this.b;
                ef1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ef1Var2.e);
                break;
        }
    }
}
