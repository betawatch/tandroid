package x3;

import b2.x0;
import c3.b0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.n0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.Arrays;
import java.util.List;
import u2.z0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d implements o {
    public q a;
    public i b;
    public boolean c;

    @Override // c3.o
    public final boolean a(p pVar) {
        try {
            return g(pVar);
        } catch (x0 unused) {
            return false;
        }
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.a = qVar;
    }

    @Override // c3.o
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
                String str = n0.a;
                gVar.N0(j12);
                iVar.h = 2;
            }
        }
    }

    @Override // c3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        int i10;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!g(pVar)) {
                throw x0.a(null, "Failed to determine bitstream type");
            }
            pVar.p();
        }
        if (!this.c) {
            j0 F1 = this.a.F1(0, 1);
            this.a.Q0();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = F1;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        iVar2.b.getClass();
        String str = n0.a;
        int i11 = iVar2.h;
        int i12 = -1;
        int i13 = 3;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar.q((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long w10 = iVar2.d.w(pVar);
            if (w10 >= 0) {
                sVar.a = w10;
                return 1;
            }
            if (w10 < -1) {
                iVar2.a(-(w10 + 2));
            }
            if (!iVar2.l) {
                b0 U = iVar2.d.U();
                U.getClass();
                iVar2.c.D1(U);
                iVar2.b.e(U.h());
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(pVar)) {
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
            boolean b11 = eVar.b(pVar);
            x xVar2 = eVar.b;
            if (!b11) {
                iVar2.h = i13;
                return i12;
            }
            long position = pVar.getPosition();
            long j11 = iVar2.f;
            iVar2.k = position - j11;
            if (iVar2.c(xVar2, j11, iVar2.j)) {
                iVar2.f = pVar.getPosition();
                i12 = -1;
                i13 = 3;
            } else {
                b2.x xVar3 = (b2.x) iVar2.j.b;
                iVar2.i = xVar3.L;
                if (!iVar2.m) {
                    iVar2.b.b(xVar3);
                    iVar2.m = true;
                }
                z0 z0Var = (z0) iVar2.j.c;
                if (z0Var != null) {
                    iVar2.d = z0Var;
                } else {
                    if (pVar.getLength() != -1) {
                        f fVar = eVar.a;
                        i10 = 2;
                        iVar2.d = new b(iVar2, iVar2.f, pVar.getLength(), fVar.d + fVar.e, fVar.b, (fVar.a & 4) != 0);
                        iVar2.h = i10;
                        bArr = xVar2.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        xVar2.L(xVar2.c, Arrays.copyOf(bArr, Math.max(65025, xVar2.c)));
                        return 0;
                    }
                    iVar2.d = new sb.b(26);
                }
                i10 = 2;
                iVar2.h = i10;
                bArr = xVar2.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    public final boolean g(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            x xVar = new x(min);
            pVar.b(0, min, xVar.a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.b = new c();
                return true;
            }
            xVar.N(0);
            try {
                z10 = c3.b.w(1, xVar, true);
            } catch (x0 unused) {
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

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
