package x3;

import b2.w;
import b2.w0;
import c3.e0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.Arrays;
import java.util.List;
import u2.b1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d implements q {
    public s a;
    public i b;
    public boolean c;

    @Override // c3.q
    public final boolean a(r rVar) {
        try {
            return g(rVar);
        } catch (w0 unused) {
            return false;
        }
    }

    @Override // c3.q
    public final void c(s sVar) {
        this.a = sVar;
    }

    @Override // c3.q
    public final void d(long j10, long j11) {
        i iVar = this.b;
        if (iVar != null) {
            e eVar = iVar.a;
            f fVar = eVar.a;
            fVar.a = 0;
            fVar.b = 0L;
            fVar.c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.b.K(0);
            eVar.c = -1;
            eVar.e = false;
            if (j10 == 0) {
                iVar.d(!iVar.l);
                return;
            }
            if (iVar.h != 0) {
                long j12 = (iVar.i * j11) / 1000000;
                iVar.e = j12;
                g gVar = iVar.d;
                String str = m0.a;
                gVar.X(j12);
                iVar.h = 2;
            }
        }
    }

    @Override // c3.q
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    @Override // c3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(r rVar, u uVar) {
        int i10;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!g(rVar)) {
                throw w0.a(null, "Failed to determine bitstream type");
            }
            rVar.q();
        }
        if (!this.c) {
            c3.l0 j02 = this.a.j0(0, 1);
            this.a.C();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = j02;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        iVar2.b.getClass();
        String str = m0.a;
        int i11 = iVar2.h;
        int i12 = -1;
        int i13 = 3;
        if (i11 != 0) {
            if (i11 == 1) {
                rVar.r((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long k10 = iVar2.d.k(rVar);
            if (k10 >= 0) {
                uVar.a = k10;
                return 1;
            }
            if (k10 < -1) {
                iVar2.a(-(k10 + 2));
            }
            if (!iVar2.l) {
                e0 x10 = iVar2.d.x();
                x10.getClass();
                iVar2.c.g0(x10);
                iVar2.b.e(x10.h());
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(rVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.k = 0L;
            x xVar = eVar.b;
            long b10 = iVar2.b(xVar);
            if (b10 >= 0) {
                long j10 = iVar2.g;
                if (j10 + b10 >= iVar2.e) {
                    iVar2.b.d(xVar.c, xVar);
                    iVar2.b.c((j10 * 1000000) / iVar2.i, 1, xVar.c, 0, null);
                    iVar2.e = -1L;
                }
            }
            iVar2.g += b10;
            return 0;
        }
        while (true) {
            boolean b11 = eVar.b(rVar);
            x xVar2 = eVar.b;
            if (!b11) {
                iVar2.h = i13;
                return i12;
            }
            long position = rVar.getPosition();
            long j11 = iVar2.f;
            iVar2.k = position - j11;
            if (iVar2.c(xVar2, j11, iVar2.j)) {
                iVar2.f = rVar.getPosition();
                i12 = -1;
                i13 = 3;
            } else {
                w wVar = (w) iVar2.j.b;
                iVar2.i = wVar.L;
                if (!iVar2.m) {
                    iVar2.b.b(wVar);
                    iVar2.m = true;
                }
                b1 b1Var = (b1) iVar2.j.c;
                if (b1Var != null) {
                    iVar2.d = b1Var;
                } else {
                    if (rVar.getLength() != -1) {
                        f fVar = eVar.a;
                        i10 = 2;
                        iVar2.d = new b(iVar2, iVar2.f, rVar.getLength(), fVar.d + fVar.e, fVar.b, (fVar.a & 4) != 0);
                        iVar2.h = i10;
                        bArr = xVar2.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        xVar2.L(xVar2.c, Arrays.copyOf(bArr, Math.max(65025, xVar2.c)));
                        return 0;
                    }
                    iVar2.d = new pb.a(26);
                }
                i10 = 2;
                iVar2.h = i10;
                bArr = xVar2.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    public final boolean g(r rVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(rVar, true) && (fVar.a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            x xVar = new x(min);
            rVar.a(0, min, xVar.a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.b = new c();
                return true;
            }
            xVar.N(0);
            try {
                z10 = c3.b.w(1, xVar, true);
            } catch (w0 unused) {
                z10 = false;
            }
            if (z10) {
                this.b = new j();
            } else {
                xVar.N(0);
                if (h.e(xVar, h.o)) {
                    this.b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // c3.q
    public final q b() {
        return this;
    }

    @Override // c3.q
    public final void release() {
    }
}
