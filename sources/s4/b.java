package s4;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b implements f0 {
    public final f0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public b(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // s4.f0
    public final void D(int i10, int i11) {
        a();
        this.a.D(i10, i11);
    }

    @Override // s4.f0
    public final void K0(int i10, int i11) {
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
        f0 f0Var = this.a;
        if (i10 == 1) {
            f0Var.f0(this.c, this.d);
        } else if (i10 == 2) {
            f0Var.K0(this.c, this.d);
        } else if (i10 == 3) {
            f0Var.j1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // s4.f0
    public final void f0(int i10, int i11) {
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

    @Override // s4.f0
    public final void j1(int i10, int i11) {
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
