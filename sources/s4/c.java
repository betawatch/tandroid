package s4;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class c implements d0 {
    public final d0 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public c(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // s4.d0
    public final void X(int i10, int i11) {
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

    public final void a() {
        int i10 = this.b;
        if (i10 == 0) {
            return;
        }
        d0 d0Var = this.a;
        if (i10 == 1) {
            d0Var.X(this.c, this.d);
        } else if (i10 == 2) {
            d0Var.t0(this.c, this.d);
        } else if (i10 == 3) {
            d0Var.a1(this.c, this.d);
        }
        this.b = 0;
    }

    @Override // s4.d0
    public final void a1(int i10, int i11) {
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

    @Override // s4.d0
    public final void t0(int i10, int i11) {
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

    @Override // s4.d0
    public final void y(int i10, int i11) {
        a();
        this.a.y(i10, i11);
    }
}
