package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a01 b;

    public /* synthetic */ xz0(a01 a01Var, int i10) {
        this.a = i10;
        this.b = a01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a01 a01Var = this.b;
                b01 b01Var = a01Var.w;
                if (a01Var.a != 0) {
                    b01Var.onBackPressed();
                    break;
                } else {
                    b01Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.i0.J3(this.b.n.d);
                break;
        }
    }
}
