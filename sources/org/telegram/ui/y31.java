package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
