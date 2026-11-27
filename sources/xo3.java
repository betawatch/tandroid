// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
