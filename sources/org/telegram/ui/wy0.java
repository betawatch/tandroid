package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wy0(zy0 zy0Var, int i10, int i11) {
        this.a = i11;
        this.b = zy0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zy0 zy0Var = this.b;
                org.telegram.ui.Components.v71 v71Var = zy0Var.b;
                yy0 yy0Var = zy0Var.d;
                int i10 = this.c;
                v71Var.d(i10, yy0Var.i(i10));
                break;
            default:
                zy0 zy0Var2 = this.b;
                org.telegram.ui.Components.v71 v71Var2 = zy0Var2.b;
                yy0 yy0Var2 = zy0Var2.d;
                int i11 = this.c;
                v71Var2.d(i11, yy0Var2.i(i11));
                break;
        }
    }
}
