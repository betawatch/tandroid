package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.mm0 b;

    public /* synthetic */ qe(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.a = i10;
        this.b = mm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.mm0 mm0Var = this.b;
                if (!mm0Var.M) {
                    mm0Var.M = true;
                    mm0Var.c(new org.telegram.ui.Components.km0(mm0Var, 0), false);
                    mm0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
