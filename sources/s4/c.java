package s4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements e0 {
    public final e0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public c(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // s4.e0
    public final void A(int i10, int i11) {
        a();
        this.a.A(i10, i11);
    }

    @Override // s4.e0
    public final void N0(int i10, int i11) {
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
        e0 e0Var = this.a;
        if (i10 == 1) {
            e0Var.i0(this.c, this.d);
        } else if (i10 == 2) {
            e0Var.N0(this.c, this.d);
        } else if (i10 == 3) {
            e0Var.g1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // s4.e0
    public final void g1(int i10, int i11) {
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

    @Override // s4.e0
    public final void i0(int i10, int i11) {
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
}
