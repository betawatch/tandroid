package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
