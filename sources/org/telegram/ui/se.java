package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.km0 b;

    public /* synthetic */ se(org.telegram.ui.Components.km0 km0Var, int i10) {
        this.a = i10;
        this.b = km0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.km0 km0Var = this.b;
                if (!km0Var.M) {
                    km0Var.M = true;
                    km0Var.c(new org.telegram.ui.Components.im0(km0Var, 0), false);
                    km0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
