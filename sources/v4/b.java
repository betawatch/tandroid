package v4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class b implements e0 {
    public final e0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public b(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // v4.e0
    public final void F(int i7, int i10) {
        a();
        this.a.F(i7, i10);
    }

    @Override // v4.e0
    public final void M0(int i7, int i10) {
        int i11;
        if (this.b == 2 && (i11 = this.c) >= i7 && i11 <= i7 + i10) {
            this.d += i10;
            this.c = i7;
        } else {
            a();
            this.c = i7;
            this.d = i10;
            this.b = 2;
        }
    }

    public final void a() {
        int i7 = this.b;
        if (i7 == 0) {
            return;
        }
        e0 e0Var = this.a;
        if (i7 == 1) {
            e0Var.g0(this.c, this.d);
        } else if (i7 == 2) {
            e0Var.M0(this.c, this.d);
        } else if (i7 == 3) {
            e0Var.g1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // v4.e0
    public final void g0(int i7, int i10) {
        int i11;
        if (this.b == 1 && i7 >= (i11 = this.c)) {
            int i12 = this.d;
            if (i7 <= i11 + i12) {
                this.d = i12 + i10;
                this.c = Math.min(i7, i11);
                return;
            }
        }
        a();
        this.c = i7;
        this.d = i10;
        this.b = 1;
    }

    @Override // v4.e0
    public final void g1(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.b == 3 && i7 <= (i12 = this.d + (i11 = this.c)) && (i13 = i7 + i10) >= i11) {
            this.c = Math.min(i7, i11);
            this.d = Math.max(i12, i13) - this.c;
        } else {
            a();
            this.c = i7;
            this.d = i10;
            this.b = 3;
        }
    }
}
