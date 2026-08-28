package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ u21(x21 x21Var, int i9) {
        this.a = i9;
        this.b = x21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x21 x21Var = this.b;
                y21 y21Var = x21Var.v;
                if (x21Var.a != 0) {
                    y21Var.onBackPressed();
                    break;
                } else {
                    y21Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
