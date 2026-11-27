// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
