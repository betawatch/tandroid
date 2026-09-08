package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo0 b;

    public /* synthetic */ un0(xo0 xo0Var, int i10) {
        this.a = i10;
        this.b = xo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xo0 xo0Var = this.b;
                xo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(xo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                xo0 xo0Var2 = this.b;
                xo0Var2.getMessagesController().newMessageCallback = null;
                if (xo0Var2.f1 == 3 && !xo0Var2.isFinishing()) {
                    xo0Var2.f1 = 4;
                    wo0 wo0Var = xo0Var2.Z0;
                    if (wo0Var != null) {
                        wo0Var.a(4);
                    }
                    xo0Var2.finishFragment();
                    break;
                } else if (xo0Var2.f1 == 1 && !xo0Var2.isFinishing()) {
                    xo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                xo0 xo0Var3 = this.b;
                if (xo0Var3.d0 != null) {
                    xo0Var3.w0();
                    xo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
