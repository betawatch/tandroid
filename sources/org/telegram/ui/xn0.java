package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ xn0(ap0 ap0Var, int i10) {
        this.a = i10;
        this.b = ap0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ap0 ap0Var = this.b;
                ap0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(ap0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                ap0 ap0Var2 = this.b;
                ap0Var2.getMessagesController().newMessageCallback = null;
                if (ap0Var2.f1 == 3 && !ap0Var2.isFinishing()) {
                    ap0Var2.f1 = 4;
                    zo0 zo0Var = ap0Var2.Z0;
                    if (zo0Var != null) {
                        zo0Var.a(4);
                    }
                    ap0Var2.finishFragment();
                    break;
                } else if (ap0Var2.f1 == 1 && !ap0Var2.isFinishing()) {
                    ap0Var2.finishFragment();
                    break;
                }
                break;
            default:
                ap0 ap0Var3 = this.b;
                if (ap0Var3.d0 != null) {
                    ap0Var3.w0();
                    ap0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
