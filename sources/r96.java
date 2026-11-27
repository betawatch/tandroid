// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class r96 {
    public final cr7 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ qj7 d;

    public r96(qj7 qj7Var, cr7 cr7Var) {
        this.d = qj7Var;
        this.a = cr7Var;
    }

    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            qj7 qj7Var = this.d;
            int i2 = qj7Var.c;
            qj7Var.c = i + i2;
            if (!qj7Var.d) {
                qj7Var.d = true;
                while (true) {
                    try {
                        int i3 = qj7Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            qj7Var.e();
                        } else if (z3) {
                            qj7Var.f();
                        }
                        i2 = i3;
                    } finally {
                        qj7Var.d = false;
                    }
                }
            }
            if (this.b) {
                qj7Var.c(this);
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
