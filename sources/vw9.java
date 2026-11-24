// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vw9 implements m4c {
    public final uw9 a;
    public final yw7 b = new yw7(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public vw9(uw9 uw9Var) {
        this.a = uw9Var;
    }

    @Override // m4c
    public final void a(int i, yw7 yw7Var) {
        boolean z = (i & 1) != 0;
        int A = z ? yw7Var.b + yw7Var.A() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            yw7Var.N(A);
            this.d = 0;
        }
        while (yw7Var.a() > 0) {
            int i2 = this.d;
            yw7 yw7Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int A2 = yw7Var.A();
                    yw7Var.N(yw7Var.b - 1);
                    if (A2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yw7Var.a(), 3 - this.d);
                yw7Var.k(this.d, min, yw7Var2.a);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    yw7Var2.N(0);
                    yw7Var2.M(3);
                    yw7Var2.O(1);
                    int A3 = yw7Var2.A();
                    int A4 = yw7Var2.A();
                    this.e = (A3 & 128) != 0;
                    int i4 = (((A3 & 15) << 8) | A4) + 3;
                    this.c = i4;
                    byte[] bArr = yw7Var2.a;
                    if (bArr.length < i4) {
                        yw7Var2.c(Math.min(4098, Math.max(i4, bArr.length << 1)));
                    }
                }
            } else {
                int min2 = Math.min(yw7Var.a(), this.c - this.d);
                yw7Var.k(this.d, min2, yw7Var2.a);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        yw7Var2.M(i6);
                    } else {
                        if (hac.p(0, i6, -1, yw7Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        yw7Var2.M(this.c - 4);
                    }
                    yw7Var2.N(0);
                    this.a.b(yw7Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // m4c
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
        this.a.c(vqbVar, u84Var, l4cVar);
        this.f = true;
    }

    @Override // m4c
    public final void d() {
        this.f = true;
    }
}
