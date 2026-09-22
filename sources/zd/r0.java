package zd;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class r0 extends t0 {
    public final m c;
    public final /* synthetic */ v0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, long j3, m mVar) {
        super(j3);
        this.d = v0Var;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d);
    }

    @Override // zd.t0
    public final String toString() {
        return super.toString() + this.c;
    }
}
