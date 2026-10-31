package s4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements c0 {
    public final c0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public b(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // s4.c0
    public final void E(int i10, int i11) {
        a();
        this.a.E(i10, i11);
    }

    @Override // s4.c0
    public final void Q0(int i10, int i11) {
        int i12;
        if (this.b == 2 && (i12 = this.c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.c = i10;
        } else {
            a();
            this.c = i10;
            this.d = i11;
            this.b = 2;
        }
    }

    public final void a() {
        int i10 = this.b;
        if (i10 == 0) {
            return;
        }
        c0 c0Var = this.a;
        if (i10 == 1) {
            c0Var.n0(this.c, this.d);
        } else if (i10 == 2) {
            c0Var.Q0(this.c, this.d);
        } else if (i10 == 3) {
            c0Var.x1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // s4.c0
    public final void n0(int i10, int i11) {
        int i12;
        if (this.b == 1 && i10 >= (i12 = this.c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.c = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.c = i10;
        this.d = i11;
        this.b = 1;
    }

    @Override // s4.c0
    public final void x1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.b == 3 && i10 <= (i13 = this.d + (i12 = this.c)) && (i14 = i10 + i11) >= i12) {
            this.c = Math.min(i10, i12);
            this.d = Math.max(i13, i14) - this.c;
        } else {
            a();
            this.c = i10;
            this.d = i11;
            this.b = 3;
        }
    }
}
