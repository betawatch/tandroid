package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c21 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z11(c21 c21Var, int i10, int i11) {
        this.a = i11;
        this.b = c21Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c21 c21Var = this.b;
                org.telegram.ui.Components.i81 i81Var = c21Var.n;
                b21 b21Var = c21Var.s;
                int i10 = this.c;
                i81Var.d(i10, b21Var.i(i10));
                break;
            default:
                c21 c21Var2 = this.b;
                org.telegram.ui.Components.i81 i81Var2 = c21Var2.n;
                b21 b21Var2 = c21Var2.s;
                int i11 = this.c;
                i81Var2.d(i11, b21Var2.i(i11));
                break;
        }
    }
}
