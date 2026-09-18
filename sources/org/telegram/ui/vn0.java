package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ vn0(yo0 yo0Var, int i10) {
        this.a = i10;
        this.b = yo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.b;
                yo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(yo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                yo0 yo0Var2 = this.b;
                yo0Var2.getMessagesController().newMessageCallback = null;
                if (yo0Var2.f1 == 3 && !yo0Var2.isFinishing()) {
                    yo0Var2.f1 = 4;
                    xo0 xo0Var = yo0Var2.Z0;
                    if (xo0Var != null) {
                        xo0Var.a(4);
                    }
                    yo0Var2.finishFragment();
                    break;
                } else if (yo0Var2.f1 == 1 && !yo0Var2.isFinishing()) {
                    yo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                yo0 yo0Var3 = this.b;
                if (yo0Var3.d0 != null) {
                    yo0Var3.w0();
                    yo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
