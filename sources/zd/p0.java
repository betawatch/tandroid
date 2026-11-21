package zd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
