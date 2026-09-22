package zd;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class s0 extends t0 {
    public final e2 c;

    public s0(long j3, e2 e2Var) {
        super(j3);
        this.c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // zd.t0
    public final String toString() {
        return super.toString() + this.c;
    }
}
