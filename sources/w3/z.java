package w3;

import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z implements f0 {
    public final y a;
    public final d5.z b = new d5.z(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public z(y yVar) {
        this.a = yVar;
    }

    @Override // w3.f0
    public final void a(d5.f0 f0Var, m3.m mVar, e0 e0Var) {
        this.a.a(f0Var, mVar, e0Var);
        this.f = true;
    }

    @Override // w3.f0
    public final void b(int i10, d5.z zVar) {
        boolean z10 = (i10 & 1) != 0;
        int r10 = z10 ? zVar.b + zVar.r() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            zVar.C(r10);
            this.d = 0;
        }
        while (zVar.a() > 0) {
            int i11 = this.d;
            d5.z zVar2 = this.b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int r11 = zVar.r();
                    zVar.C(zVar.b - 1);
                    if (r11 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(zVar.a(), 3 - this.d);
                zVar.c(this.d, min, zVar2.a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    zVar2.C(0);
                    zVar2.B(3);
                    zVar2.D(1);
                    int r12 = zVar2.r();
                    int r13 = zVar2.r();
                    this.e = (r12 & 128) != 0;
                    int i13 = (((r12 & 15) << 8) | r13) + 3;
                    this.c = i13;
                    byte[] bArr = zVar2.a;
                    if (bArr.length < i13) {
                        zVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(zVar.a(), this.c - this.d);
                zVar.c(this.d, min2, zVar2.a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = zVar2.a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = g0.m[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = g0.a;
                        if (i16 != 0) {
                            this.f = true;
                            return;
                        }
                        zVar2.B(this.c - 4);
                    } else {
                        zVar2.B(i15);
                    }
                    zVar2.C(0);
                    this.a.b(zVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // w3.f0
    public final void c() {
        this.f = true;
    }
}
