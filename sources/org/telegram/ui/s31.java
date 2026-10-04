package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class s31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u31 b;

    public /* synthetic */ s31(u31 u31Var, int i10) {
        this.a = i10;
        this.b = u31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u31 u31Var = this.b;
                v31 v31Var = u31Var.v;
                if (u31Var.a != 0) {
                    v31Var.onBackPressed();
                    break;
                } else {
                    v31Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.b);
                break;
        }
    }
}
