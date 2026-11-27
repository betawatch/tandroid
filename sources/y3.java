// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y3 implements Runnable {
    public final sd9 a;
    public final x76 b;

    public y3(sd9 sd9Var, x76 x76Var) {
        this.a = sd9Var;
        this.b = x76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            if (b4.f.b(this.a, this, b4.h(this.b))) {
                b4.e(this.a);
            }
        }
    }
}
