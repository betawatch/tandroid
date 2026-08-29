package y3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z implements e0 {
    public final y a;
    public final f5.w b = new f5.w(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public z(y yVar) {
        this.a = yVar;
    }

    @Override // y3.e0
    public final void a() {
        this.f = true;
    }

    @Override // y3.e0
    public final void b(f5.c0 c0Var, o3.m mVar, d0 d0Var) {
        this.a.b(c0Var, mVar, d0Var);
        this.f = true;
    }

    @Override // y3.e0
    public final void c(int i10, f5.w wVar) {
        boolean z10 = (i10 & 1) != 0;
        int r6 = z10 ? wVar.b + wVar.r() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            wVar.C(r6);
            this.d = 0;
        }
        while (wVar.a() > 0) {
            int i11 = this.d;
            f5.w wVar2 = this.b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int r9 = wVar.r();
                    wVar.C(wVar.b - 1);
                    if (r9 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(wVar.a(), 3 - this.d);
                wVar.c(this.d, min, wVar2.a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    wVar2.C(0);
                    wVar2.B(3);
                    wVar2.D(1);
                    int r10 = wVar2.r();
                    int r11 = wVar2.r();
                    this.e = (r10 & 128) != 0;
                    int i13 = (((r10 & 15) << 8) | r11) + 3;
                    this.c = i13;
                    byte[] bArr = wVar2.a;
                    if (bArr.length < i13) {
                        wVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(wVar.a(), this.c - this.d);
                wVar.c(this.d, min2, wVar2.a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = wVar2.a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = f5.d0.m[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = f5.d0.a;
                        if (i16 != 0) {
                            this.f = true;
                            return;
                        }
                        wVar2.B(this.c - 4);
                    } else {
                        wVar2.B(i15);
                    }
                    wVar2.C(0);
                    this.a.c(wVar2);
                    this.d = 0;
                }
            }
        }
    }
}
