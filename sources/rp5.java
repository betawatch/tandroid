// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rp5 extends rh2 {
    public final o31 s;
    public lh2 w;
    public long x;
    public volatile boolean y;

    public rp5(h73 h73Var, n73 n73Var, ko4 ko4Var, int i, Object obj, o31 o31Var) {
        super(h73Var, n73Var, 2, ko4Var, i, obj, -9223372036854775807L, -9223372036854775807L, null);
        this.s = o31Var;
    }

    @Override // oa6
    public final void a() {
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            n73 b = this.b.b(this.x);
            b2b b2bVar = this.r;
            cb3 cb3Var = new cb3(b2bVar, b.e, b2bVar.open(b));
            while (!this.y) {
                try {
                    int b2 = this.s.a.b(cb3Var, o31.s);
                    boolean z = false;
                    yve.p(b2 != 1);
                    if (b2 == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.x = cb3Var.d - this.b.e;
                    this.s.a();
                }
            }
        } finally {
            lge.a(this.r);
        }
    }

    @Override // oa6
    public final void c() {
        this.y = true;
    }
}
