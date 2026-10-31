package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 extends t0 {
    public final f2 c;

    public s0(long j10, f2 f2Var) {
        super(j10);
        this.c = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // td.t0
    public final String toString() {
        return super.toString() + this.c;
    }
}
