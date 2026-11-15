package zd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class t0 extends x {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public hd.d e;

    public final void g(boolean z10) {
        long j3 = this.c - (z10 ? 4294967296L : 1L);
        this.c = j3;
        if (j3 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread h();

    public final void i(boolean z10) {
        this.c = (z10 ? 4294967296L : 1L) + this.c;
        if (z10) {
            return;
        }
        this.d = true;
    }

    public abstract long j();

    public final boolean k() {
        hd.d dVar = this.e;
        if (dVar == null) {
            return false;
        }
        i0 i0Var = (i0) (dVar.isEmpty() ? null : dVar.removeFirst());
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public void l(long j3, q0 q0Var) {
        c0.s.q(j3, q0Var);
    }

    public abstract void shutdown();
}
