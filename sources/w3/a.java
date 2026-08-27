package w3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements m3.k {
    public final b a = new b(null, 0);
    public final d5.z b = new d5.z(2786);
    public boolean c;

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        d5.z zVar = this.b;
        int read = ((m3.h) lVar).read(zVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        zVar.C(0);
        zVar.B(read);
        boolean z10 = this.c;
        b bVar = this.a;
        if (!z10) {
            bVar.f(4, 0L);
            this.c = true;
        }
        bVar.b(zVar);
        return 0;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.a.e(mVar, new e0(0, 1));
        mVar.A();
        mVar.n(new m3.o(-9223372036854775807L));
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
        d5.z zVar = new d5.z(10);
        int i10 = 0;
        while (true) {
            hVar = (m3.h) lVar;
            hVar.g(zVar.a, 0, 10, false);
            zVar.C(0);
            if (zVar.t() != 4801587) {
                break;
            }
            zVar.D(3);
            int q6 = zVar.q();
            i10 += q6 + 10;
            hVar.a(q6, false);
        }
        hVar.f = 0;
        hVar.a(i10, false);
        int i11 = i10;
        loop1: while (true) {
            int i12 = 0;
            while (true) {
                hVar.g(zVar.a, 0, 6, false);
                zVar.C(0);
                if (zVar.w() != 2935) {
                    break;
                }
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = zVar.a;
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
            hVar.a(i11, false);
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.c = false;
        this.a.c();
    }

    @Override // m3.k
    public final void release() {
    }
}
