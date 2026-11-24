// default package

import android.graphics.Point;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rf4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uf4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ rf4(uf4 uf4Var, int i, int i2, byte b) {
        this.a = b;
        this.b = uf4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                uf4 uf4Var = this.b;
                int i2 = this.c;
                int i3 = this.d;
                if (uf4Var.X != i2 || uf4Var.Y != i3) {
                    uf4Var.X = i2;
                    uf4Var.Y = i3;
                    int o = gda.o();
                    int i4 = 1920;
                    if (o != 1) {
                        if (o != 2) {
                            i4 = 720;
                        } else {
                            Point point = gm.q;
                            i4 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (gda.o() == 0 && ((i = uf4Var.X) > 1280 || uf4Var.Y > 1280)) {
                        uf4Var.X = i / 2;
                        uf4Var.Y /= 2;
                    }
                    int i5 = uf4Var.X;
                    if (i5 > i4 || uf4Var.Y > i4) {
                        int i6 = uf4Var.Y;
                        if (i5 > i6) {
                            uf4Var.Y = (int) (i6 / (i4 / i5));
                            uf4Var.X = i4;
                        } else {
                            uf4Var.X = (int) (i5 / (i4 / i6));
                            uf4Var.Y = i4;
                        }
                    }
                    uf4Var.a0 = false;
                    uf4Var.d();
                    uf4Var.e0.run();
                    break;
                }
                break;
            case 1:
                uf4 uf4Var2 = this.b;
                int i7 = this.c;
                int i8 = this.d;
                uf4Var2.n = i7;
                uf4Var2.r = i8;
                break;
            default:
                uf4 uf4Var3 = this.b;
                int i9 = this.c;
                int i10 = this.d;
                xm0 xm0Var = uf4Var3.J;
                xm0Var.l = i9;
                xm0Var.m = i10;
                break;
        }
    }
}
