package y3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements o3.k {
    public final b a = new b(null, 0);
    public final f5.w b = new f5.w(2786);
    public boolean c;

    @Override // o3.k
    public final int d(o3.l lVar, o3.n nVar) {
        f5.w wVar = this.b;
        int read = ((o3.h) lVar).read(wVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        wVar.C(0);
        wVar.B(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.f(4, 0L);
            this.c = true;
        }
        bVar.c(wVar);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r5.f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(o3.l lVar) {
        o3.h hVar;
        int b10;
        f5.w wVar = new f5.w(10);
        int i10 = 0;
        while (true) {
            hVar = (o3.h) lVar;
            hVar.f(wVar.a, 0, 10, false);
            wVar.C(0);
            if (wVar.t() != 4801587) {
                break;
            }
            wVar.D(3);
            int q6 = wVar.q();
            i10 += q6 + 10;
            hVar.b(q6, false);
        }
        hVar.f = 0;
        hVar.b(i10, false);
        int i11 = i10;
        loop1: while (true) {
            int i12 = 0;
            while (true) {
                hVar.f(wVar.a, 0, 6, false);
                wVar.C(0);
                if (wVar.w() != 2935) {
                    break;
                }
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.a;
                if (bArr.length < 6) {
                    b10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    b10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b11 = bArr[4];
                    b10 = l3.b.b((b11 & 192) >> 6, b11 & 63);
                }
                if (b10 == -1) {
                    break loop1;
                }
                hVar.b(b10 - 6, false);
            }
            hVar.b(i11, false);
        }
        return false;
    }

    @Override // o3.k
    public final void f(long j10, long j11) {
        this.c = false;
        this.a.a();
    }

    @Override // o3.k
    public final void i(o3.m mVar) {
        this.a.e(mVar, new d0(0, 1));
        mVar.e1();
        mVar.D1(new o3.o(-9223372036854775807L));
    }

    @Override // o3.k
    public final void release() {
    }
}
