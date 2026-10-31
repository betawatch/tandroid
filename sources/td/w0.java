package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class w0 extends a0 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public bd.g e;

    public final void f(boolean z10) {
        long j10 = this.c - (z10 ? 4294967296L : 1L);
        this.c = j10;
        if (j10 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z10) {
        this.c = (z10 ? 4294967296L : 1L) + this.c;
        if (z10) {
            return;
        }
        this.d = true;
    }

    public abstract long i();

    public final boolean j() {
        bd.g gVar = this.e;
        if (gVar == null) {
            return false;
        }
        l0 l0Var = (l0) (gVar.isEmpty() ? null : gVar.removeFirst());
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void k(long j10, t0 t0Var) {
        f0.s.o(j10, t0Var);
    }

    public abstract void shutdown();
}
