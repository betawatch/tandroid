package zd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final y1 c;

    public p0(long j3, y1 y1Var) {
        super(j3);
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // zd.q0
    public final String toString() {
        return super.toString() + this.c;
    }
}
