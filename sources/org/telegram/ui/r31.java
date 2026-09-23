package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t31 b;

    public /* synthetic */ r31(t31 t31Var, int i10) {
        this.a = i10;
        this.b = t31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t31 t31Var = this.b;
                u31 u31Var = t31Var.v;
                if (t31Var.a != 0) {
                    u31Var.onBackPressed();
                    break;
                } else {
                    u31Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
