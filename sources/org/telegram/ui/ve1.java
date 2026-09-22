package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af1 b;

    public /* synthetic */ ve1(af1 af1Var, int i10) {
        this.a = i10;
        this.b = af1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                af1 af1Var = this.b;
                af1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.n2) af1Var, 11, false).show();
                break;
            default:
                af1 af1Var2 = this.b;
                af1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(af1Var2.e);
                break;
        }
    }
}
