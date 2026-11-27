// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class r96 {
    public final cr7 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ rj7 d;

    public r96(rj7 rj7Var, cr7 cr7Var) {
        this.d = rj7Var;
        this.a = cr7Var;
    }

    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            rj7 rj7Var = this.d;
            int i2 = rj7Var.c;
            rj7Var.c = i + i2;
            if (!rj7Var.d) {
                rj7Var.d = true;
                while (true) {
                    try {
                        int i3 = rj7Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            rj7Var.e();
                        } else if (z3) {
                            rj7Var.f();
                        }
                        i2 = i3;
                    } finally {
                        rj7Var.d = false;
                    }
                }
            }
            if (this.b) {
                rj7Var.c(this);
            }
        }
    }

    public boolean d(i36 i36Var) {
        return false;
    }

    public boolean e() {
        return true;
    }

    public void c() {
    }
}
