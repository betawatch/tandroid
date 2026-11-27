// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
