package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vy0(yy0 yy0Var, int i10, int i11) {
        this.a = i11;
        this.b = yy0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy0 yy0Var = this.b;
                org.telegram.ui.Components.w71 w71Var = yy0Var.b;
                xy0 xy0Var = yy0Var.d;
                int i10 = this.c;
                w71Var.d(i10, xy0Var.i(i10));
                break;
            default:
                yy0 yy0Var2 = this.b;
                org.telegram.ui.Components.w71 w71Var2 = yy0Var2.b;
                xy0 xy0Var2 = yy0Var2.d;
                int i11 = this.c;
                w71Var2.d(i11, xy0Var2.i(i11));
                break;
        }
    }
}
