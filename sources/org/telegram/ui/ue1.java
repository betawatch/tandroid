package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze1 b;

    public /* synthetic */ ue1(ze1 ze1Var, int i10) {
        this.a = i10;
        this.b = ze1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze1 ze1Var = this.b;
                ze1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.n2) ze1Var, 11, false).show();
                break;
            default:
                ze1 ze1Var2 = this.b;
                ze1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ze1Var2.e);
                break;
        }
    }
}
