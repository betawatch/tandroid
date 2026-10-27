package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ t21(w21 w21Var, int i10) {
        this.a = i10;
        this.b = w21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w21 w21Var = this.b;
                x21 x21Var = w21Var.v;
                if (w21Var.a != 0) {
                    x21Var.onBackPressed();
                    break;
                } else {
                    x21Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.d);
                break;
        }
    }
}
