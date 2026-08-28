package w3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements m3.k {
    public final b a = new b(null, 0);
    public final d5.y b = new d5.y(2786);
    public boolean c;

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        d5.y yVar = this.b;
        int read = ((m3.h) lVar).read(yVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        yVar.C(0);
        yVar.B(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.k(4, 0L);
            this.c = true;
        }
        bVar.g(yVar);
        return 0;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.a.j(mVar, new d0(0, 1));
        mVar.B();
        mVar.y(new m3.o(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r5.f = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(m3.l lVar) {
        m3.h hVar;
        int b10;
        d5.y yVar = new d5.y(10);
        int i9 = 0;
        while (true) {
            hVar = (m3.h) lVar;
            hVar.g(yVar.a, 0, 10, false);
            yVar.C(0);
            if (yVar.t() != 4801587) {
                break;
            }
            yVar.D(3);
            int q10 = yVar.q();
            i9 += q10 + 10;
            hVar.a(q10, false);
        }
        hVar.f = 0;
        hVar.a(i9, false);
        int i10 = i9;
        loop1: while (true) {
            int i11 = 0;
            while (true) {
                hVar.g(yVar.a, 0, 6, false);
                yVar.C(0);
                if (yVar.w() != 2935) {
                    break;
                }
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = yVar.a;
                if (bArr.length < 6) {
                    b10 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    b10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b11 = bArr[4];
                    b10 = j3.b.b((b11 & 192) >> 6, b11 & 63);
                }
                if (b10 == -1) {
                    break loop1;
                }
                hVar.a(b10 - 6, false);
            }
            hVar.a(i10, false);
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.c = false;
        this.a.h();
    }

    @Override // m3.k
    public final void release() {
    }
}
