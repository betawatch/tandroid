package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ u21(x21 x21Var, int i10) {
        this.a = i10;
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
