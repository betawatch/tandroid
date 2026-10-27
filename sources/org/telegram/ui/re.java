package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.in0 b;

    public /* synthetic */ re(org.telegram.ui.Components.in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.in0 in0Var = this.b;
                if (!in0Var.M) {
                    in0Var.M = true;
                    in0Var.c(new org.telegram.ui.Components.gn0(in0Var, 0), false);
                    in0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
