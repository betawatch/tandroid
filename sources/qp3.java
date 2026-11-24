// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qp3 implements Runnable {
    public final boolean a;
    public final um5 b;

    /* JADX WARN: Multi-variable type inference failed */
    public qp3(int i, um5 um5Var) {
        this.a = i;
        this.b = um5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
