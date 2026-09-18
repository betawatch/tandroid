package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a21 b;
    public final /* synthetic */ int c;

    public /* synthetic */ x11(a21 a21Var, int i10, int i11) {
        this.a = i11;
        this.b = a21Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a21 a21Var = this.b;
                org.telegram.ui.Components.w81 w81Var = a21Var.n;
                z11 z11Var = a21Var.s;
                int i10 = this.c;
                w81Var.d(i10, z11Var.i(i10));
                break;
            default:
                a21 a21Var2 = this.b;
                org.telegram.ui.Components.w81 w81Var2 = a21Var2.n;
                z11 z11Var2 = a21Var2.s;
                int i11 = this.c;
                w81Var2.d(i11, z11Var2.i(i11));
                break;
        }
    }
}
