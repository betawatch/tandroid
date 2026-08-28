package w3;

import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z implements e0 {
    public final y a;
    public final d5.y b = new d5.y(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public z(y yVar) {
        this.a = yVar;
    }

    @Override // w3.e0
    public final void a(int i9, d5.y yVar) {
        boolean z10 = (i9 & 1) != 0;
        int r10 = z10 ? yVar.b + yVar.r() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            yVar.C(r10);
            this.d = 0;
        }
        while (yVar.a() > 0) {
            int i10 = this.d;
            d5.y yVar2 = this.b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int r11 = yVar.r();
                    yVar.C(yVar.b - 1);
                    if (r11 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.a(), 3 - this.d);
                yVar.c(this.d, min, yVar2.a);
                int i11 = this.d + min;
                this.d = i11;
                if (i11 == 3) {
                    yVar2.C(0);
                    yVar2.B(3);
                    yVar2.D(1);
                    int r12 = yVar2.r();
                    int r13 = yVar2.r();
                    this.e = (r12 & 128) != 0;
                    int i12 = (((r12 & 15) << 8) | r13) + 3;
                    this.c = i12;
                    byte[] bArr = yVar2.a;
                    if (bArr.length < i12) {
                        yVar2.b(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.a(), this.c - this.d);
                yVar.c(this.d, min2, yVar2.a);
                int i13 = this.d + min2;
                this.d = i13;
                int i14 = this.c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = yVar2.a;
                        int i15 = -1;
                        for (int i16 = 0; i16 < i14; i16++) {
                            i15 = f0.m[((i15 >>> 24) ^ (bArr2[i16] & 255)) & 255] ^ (i15 << 8);
                        }
                        int i17 = f0.a;
                        if (i15 != 0) {
                            this.f = true;
                            return;
                        }
                        yVar2.B(this.c - 4);
                    } else {
                        yVar2.B(i14);
                    }
                    yVar2.C(0);
                    this.a.g(yVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // w3.e0
    public final void e(d5.e0 e0Var, m3.m mVar, d0 d0Var) {
        this.a.e(e0Var, mVar, d0Var);
        this.f = true;
    }

    @Override // w3.e0
    public final void h() {
        this.f = true;
    }
}
