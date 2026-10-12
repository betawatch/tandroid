package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;

    public /* synthetic */ zn0(cp0 cp0Var, int i10) {
        this.a = i10;
        this.b = cp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cp0 cp0Var = this.b;
                cp0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(cp0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                cp0 cp0Var2 = this.b;
                cp0Var2.getMessagesController().newMessageCallback = null;
                if (cp0Var2.f1 == 3 && !cp0Var2.isFinishing()) {
                    cp0Var2.f1 = 4;
                    bp0 bp0Var = cp0Var2.Z0;
                    if (bp0Var != null) {
                        bp0Var.a(4);
                    }
                    cp0Var2.finishFragment();
                    break;
                } else if (cp0Var2.f1 == 1 && !cp0Var2.isFinishing()) {
                    cp0Var2.finishFragment();
                    break;
                }
                break;
            default:
                cp0 cp0Var3 = this.b;
                if (cp0Var3.d0 != null) {
                    cp0Var3.w0();
                    cp0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
