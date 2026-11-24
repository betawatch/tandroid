// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vh4 {
    public boolean c;
    public int e;
    public long h;
    public final th4 i;
    public uh4 a = new uh4();
    public uh4 b = new uh4();
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public vh4(th4 th4Var) {
        this.i = th4Var;
    }

    public final long a() {
        if (!this.a.a()) {
            return -9223372036854775807L;
        }
        uh4 uh4Var = this.a;
        long j = uh4Var.e;
        if (j == 0) {
            return 0L;
        }
        return uh4Var.f / j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if ((r5 == 0 ? false : r0.g[(int) ((r5 - 1) % 15)]) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j) {
        if (j == this.d) {
            return;
        }
        this.h++;
        this.a.b(j);
        if (this.a.a()) {
            this.c = false;
        } else if (this.d != -9223372036854775807L) {
            if (this.c) {
                uh4 uh4Var = this.b;
                long j2 = uh4Var.d;
            }
            this.b.c();
            this.b.b(this.d);
            this.c = true;
            this.b.b(j);
        }
        if (this.c && this.b.a()) {
            uh4 uh4Var2 = this.a;
            this.a = this.b;
            this.b = uh4Var2;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.a() ? 0 : this.e + 1;
        c();
    }

    public final void c() {
        float f;
        boolean a = this.a.a();
        if (a) {
            f = (float) (1.0E9d / (this.a.e != 0 ? r1.f / r2 : 0L));
        } else {
            f = this.f;
        }
        float f2 = this.g;
        if (f != f2) {
            if (f != -1.0f) {
                if (f2 != -1.0f) {
                    if (Math.abs(f - f2) < ((!a || this.a.f < 5000000000L) ? 1.0f : 0.1f)) {
                        return;
                    }
                }
            } else if (this.e < 30) {
                return;
            }
            this.g = f;
            this.i.g(f);
        }
    }
}
