package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;

    public /* synthetic */ y7(p8 p8Var, int i10) {
        this.a = i10;
        this.b = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p8 p8Var = this.b;
                p8Var.R = true;
                p8Var.o(null);
                AndroidUtilities.runOnUIThread(new y7(p8Var, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                d8 d8Var = this.b.r;
                d8Var.F = false;
                d8Var.invalidate();
                break;
        }
    }
}
