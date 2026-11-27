// default package

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class y2 extends z2 implements RandomAccess {
    public final z2 a;
    public final int b;
    public final int c;

    public y2(z2 z2Var, int i, int i2) {
        this.a = z2Var;
        this.b = i;
        qpd.a(i, i2, z2Var.h());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            su3.g(c00.h(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.a.get(this.b + i);
    }

    @Override // z2
    public final int h() {
        return this.c;
    }

    @Override // z2, java.util.List
    public final List subList(int i, int i2) {
        qpd.a(i, i2, this.c);
        int i3 = this.b;
        return new y2(this.a, i + i3, i3 + i2);
    }
}
