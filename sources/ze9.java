// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class ze9 extends FrameLayout {
    public mk0 a;
    public final sd1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public ze9(Context context) {
        super(context);
        sd1 sd1Var = new sd1();
        sd1Var.b = Long.MIN_VALUE;
        sd1Var.a = -1;
        this.b = sd1Var;
    }

    public final void c(mk0 mk0Var) {
        this.b.a(mk0Var, new ye9(this, (byte) 0));
    }

    public int d() {
        return 0;
    }

    public void e(int i) {
        int i2;
        int d = nxe.d(this.a);
        int i3 = 0;
        int d2 = (i > 0 || d > 0) ? d() : 0;
        mk0 mk0Var = this.a;
        if (mk0Var == null || !mk0Var.n) {
            i2 = this.e;
        } else {
            i2 = mk0Var.l <= 0 ? 0 : hl.L(((r3 - 1) << 4) + 10);
        }
        mk0 mk0Var2 = this.a;
        if (mk0Var2 == null || !mk0Var2.o) {
            i3 = this.h;
        } else {
            if (mk0Var2.m > 0) {
                i3 = hl.L(((r4 - 1) << 4) + 10);
            }
        }
        int i4 = i + d2;
        int i5 = d + d2;
        int i6 = this.d;
        int i7 = this.f;
        if (ob6.a0) {
            setPadding(i6 + i5, i2, i7 + i4, i3);
        } else {
            setPadding(i6 + i4, i2, i7 + i5, i3);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = i4;
        int i5 = this.c;
        if (ob6.a0) {
            setPadding(i, i2, i3 + i5, i4);
        } else {
            setPadding(i + i5, i2, i3, i4);
        }
    }
}
