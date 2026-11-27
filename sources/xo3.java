// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xo3 implements Runnable {
    public final boolean a;
    public final xm5 b;

    /* JADX WARN: Multi-variable type inference failed */
    public xo3(int i, xm5 xm5Var) {
        this.a = i;
        this.b = xm5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
