package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;

    public /* synthetic */ tn0(wo0 wo0Var, int i10) {
        this.a = i10;
        this.b = wo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wo0 wo0Var = this.b;
                wo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(wo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                wo0 wo0Var2 = this.b;
                wo0Var2.getMessagesController().newMessageCallback = null;
                if (wo0Var2.f1 == 3 && !wo0Var2.isFinishing()) {
                    wo0Var2.f1 = 4;
                    vo0 vo0Var = wo0Var2.Z0;
                    if (vo0Var != null) {
                        vo0Var.a(4);
                    }
                    wo0Var2.finishFragment();
                    break;
                } else if (wo0Var2.f1 == 1 && !wo0Var2.isFinishing()) {
                    wo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                wo0 wo0Var3 = this.b;
                if (wo0Var3.d0 != null) {
                    wo0Var3.w0();
                    wo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
