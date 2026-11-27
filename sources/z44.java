// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class z44 extends px2 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public ls e;

    public final void f(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j > 0 || !this.d) {
            return;
        }
        shutdown();
    }

    public final void g(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long h();

    public final boolean i() {
        ls lsVar = this.e;
        if (lsVar == null) {
            return false;
        }
        ap3 ap3Var = (ap3) (lsVar.isEmpty() ? null : lsVar.removeFirst());
        if (ap3Var == null) {
            return false;
        }
        ap3Var.run();
        return true;
    }

    public abstract void shutdown();
}
