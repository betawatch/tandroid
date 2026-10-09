package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;

    public /* synthetic */ sn0(vo0 vo0Var, int i10) {
        this.a = i10;
        this.b = vo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vo0 vo0Var = this.b;
                vo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(vo0Var.f[0]);
                break;
            case 1:
                this.b.t0();
                break;
            case 2:
                vo0 vo0Var2 = this.b;
                vo0Var2.getMessagesController().newMessageCallback = null;
                if (vo0Var2.f1 == 3 && !vo0Var2.isFinishing()) {
                    vo0Var2.f1 = 4;
                    uo0 uo0Var = vo0Var2.Z0;
                    if (uo0Var != null) {
                        uo0Var.a(4);
                    }
                    vo0Var2.finishFragment();
                    break;
                } else if (vo0Var2.f1 == 1 && !vo0Var2.isFinishing()) {
                    vo0Var2.finishFragment();
                    break;
                }
                break;
            default:
                vo0 vo0Var3 = this.b;
                if (vo0Var3.d0 != null) {
                    vo0Var3.w0();
                    vo0Var3.d0 = null;
                    break;
                }
                break;
        }
    }
}
