package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b41 b;

    public /* synthetic */ z31(b41 b41Var, int i10) {
        this.a = i10;
        this.b = b41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b41 b41Var = this.b;
                c41 c41Var = b41Var.v;
                if (b41Var.a != 0) {
                    c41Var.onBackPressed();
                    break;
                } else {
                    c41Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
