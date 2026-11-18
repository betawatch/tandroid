package zd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o0 extends q0 {
    public final m c;
    public final /* synthetic */ s0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, long j3, m mVar) {
        super(j3);
        this.d = s0Var;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d);
    }

    @Override // zd.q0
    public final String toString() {
        return super.toString() + this.c;
    }
}
