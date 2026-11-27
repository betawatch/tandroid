// default package

import android.graphics.Point;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ypb extends ksd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fn7 b;

    public /* synthetic */ ypb(fn7 fn7Var, byte b) {
        this.a = b;
        this.b = fn7Var;
    }

    @Override // ksd
    public final void a() {
        switch (this.a) {
            case 1:
                ((mkc) this.b).w.invalidate();
                break;
        }
    }

    @Override // ksd
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Point point = hl.q;
                if ((point.x <= point.y) == (i <= i2)) {
                    ((pqb) this.b).z0.invalidate();
                    break;
                }
                break;
        }
    }
}
