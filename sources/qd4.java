// default package

import android.graphics.Point;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qd4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ td4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ qd4(td4 td4Var, int i, int i2, byte b) {
        this.a = b;
        this.b = td4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                td4 td4Var = this.b;
                int i2 = this.c;
                int i3 = this.d;
                if (td4Var.X != i2 || td4Var.Y != i3) {
                    td4Var.X = i2;
                    td4Var.Y = i3;
                    int o = gba.o();
                    int i4 = 1920;
                    if (o != 1) {
                        if (o != 2) {
                            i4 = 720;
                        } else {
                            Point point = gl.q;
                            i4 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (gba.o() == 0 && ((i = td4Var.X) > 1280 || td4Var.Y > 1280)) {
                        td4Var.X = i / 2;
                        td4Var.Y /= 2;
                    }
                    int i5 = td4Var.X;
                    if (i5 > i4 || td4Var.Y > i4) {
                        int i6 = td4Var.Y;
                        if (i5 > i6) {
                            td4Var.Y = (int) (i6 / (i4 / i5));
                            td4Var.X = i4;
                        } else {
                            td4Var.X = (int) (i5 / (i4 / i6));
                            td4Var.Y = i4;
                        }
                    }
                    td4Var.a0 = false;
                    td4Var.d();
                    td4Var.e0.run();
                    break;
                }
                break;
            case 1:
                td4 td4Var2 = this.b;
                int i7 = this.c;
                int i8 = this.d;
                td4Var2.n = i7;
                td4Var2.r = i8;
                break;
            default:
                td4 td4Var3 = this.b;
                int i9 = this.c;
                int i10 = this.d;
                xl0 xl0Var = td4Var3.J;
                xl0Var.l = i9;
                xl0Var.m = i10;
                break;
        }
    }
}
