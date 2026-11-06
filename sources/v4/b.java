package v4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements d0 {
    public final d0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public b(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // v4.d0
    public final void E(int i7, int i10) {
        a();
        this.a.E(i7, i10);
    }

    @Override // v4.d0
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
        d0 d0Var = this.a;
        if (i7 == 1) {
            d0Var.o0(this.c, this.d);
        } else if (i7 == 2) {
            d0Var.M0(this.c, this.d);
        } else if (i7 == 3) {
            d0Var.k1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // v4.d0
    public final void k1(int i7, int i10) {
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

    @Override // v4.d0
    public final void o0(int i7, int i10) {
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
}
