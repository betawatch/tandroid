package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a41 b;

    public /* synthetic */ y31(a41 a41Var, int i10) {
        this.a = i10;
        this.b = a41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a41 a41Var = this.b;
                b41 b41Var = a41Var.v;
                if (a41Var.a != 0) {
                    b41Var.onBackPressed();
                    break;
                } else {
                    b41Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
