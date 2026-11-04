package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t0 extends x {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public ed.e e;

    public final void g(boolean z10) {
        long j10 = this.c - (z10 ? 4294967296L : 1L);
        this.c = j10;
        if (j10 <= 0 && this.d) {
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
        ed.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        i0 i0Var = (i0) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public void l(long j10, q0 q0Var) {
        c0.s.q(j10, q0Var);
    }

    public abstract void shutdown();
}
