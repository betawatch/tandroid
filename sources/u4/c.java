package u4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements d0 {
    public final d0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public c(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // u4.d0
    public final void E(int i3, int i10) {
        a();
        this.a.E(i3, i10);
    }

    @Override // u4.d0
    public final void O0(int i3, int i10) {
        int i11;
        if (this.b == 2 && (i11 = this.c) >= i3 && i11 <= i3 + i10) {
            this.d += i10;
            this.c = i3;
        } else {
            a();
            this.c = i3;
            this.d = i10;
            this.b = 2;
        }
    }

    public final void a() {
        int i3 = this.b;
        if (i3 == 0) {
            return;
        }
        d0 d0Var = this.a;
        if (i3 == 1) {
            d0Var.l0(this.c, this.d);
        } else if (i3 == 2) {
            d0Var.O0(this.c, this.d);
        } else if (i3 == 3) {
            d0Var.j1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // u4.d0
    public final void j1(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.b == 3 && i3 <= (i12 = this.d + (i11 = this.c)) && (i13 = i3 + i10) >= i11) {
            this.c = Math.min(i3, i11);
            this.d = Math.max(i12, i13) - this.c;
        } else {
            a();
            this.c = i3;
            this.d = i10;
            this.b = 3;
        }
    }

    @Override // u4.d0
    public final void l0(int i3, int i10) {
        int i11;
        if (this.b == 1 && i3 >= (i11 = this.c)) {
            int i12 = this.d;
            if (i3 <= i11 + i12) {
                this.d = i12 + i10;
                this.c = Math.min(i3, i11);
                return;
            }
        }
        a();
        this.c = i3;
        this.d = i10;
        this.b = 1;
    }
}
