package zd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class w0 extends a0 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public hd.e e;

    public final void f(boolean z10) {
        long j3 = this.c - (z10 ? 4294967296L : 1L);
        this.c = j3;
        if (j3 <= 0 && this.d) {
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
        hd.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        l0 l0Var = (l0) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void k(long j3, t0 t0Var) {
        f0.s.o(j3, t0Var);
    }

    public abstract void shutdown();
}
