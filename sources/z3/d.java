package z3;

import d2.v;
import d2.v0;
import e3.b0;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.Arrays;
import java.util.List;
import w2.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements o {
    public q a;
    public i b;
    public boolean c;

    @Override // e3.o
    public final boolean b(p pVar) {
        try {
            return g(pVar);
        } catch (v0 unused) {
            return false;
        }
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.a = qVar;
    }

    @Override // e3.o
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
                gVar.u0(j12);
                iVar.h = 2;
            }
        }
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        int i3;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!g(pVar)) {
                throw v0.a(null, "Failed to determine bitstream type");
            }
            pVar.o();
        }
        if (!this.c) {
            e3.i0 i02 = this.a.i0(0, 1);
            this.a.L();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = i02;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        iVar2.b.getClass();
        String str = n0.a;
        int i10 = iVar2.h;
        int i11 = -1;
        int i12 = 3;
        if (i10 != 0) {
            if (i10 == 1) {
                pVar.u((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long D = iVar2.d.D(pVar);
            if (D >= 0) {
                sVar.a = D;
                return 1;
            }
            if (D < -1) {
                iVar2.a(-(D + 2));
            }
            if (!iVar2.l) {
                b0 O = iVar2.d.O();
                O.getClass();
                iVar2.c.f(O);
                iVar2.b.b(O.h());
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(pVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.k = 0L;
            y yVar = eVar.b;
            long b10 = iVar2.b(yVar);
            if (b10 >= 0) {
                long j10 = iVar2.g;
                if (j10 + b10 >= iVar2.e) {
                    iVar2.b.e(yVar.c, yVar);
                    iVar2.b.d((j10 * 1000000) / iVar2.i, 1, yVar.c, 0, null);
                    iVar2.e = -1L;
                }
            }
            iVar2.g += b10;
            return 0;
        }
        while (true) {
            boolean b11 = eVar.b(pVar);
            y yVar2 = eVar.b;
            if (!b11) {
                iVar2.h = i12;
                return i11;
            }
            long position = pVar.getPosition();
            long j11 = iVar2.f;
            iVar2.k = position - j11;
            if (iVar2.c(yVar2, j11, iVar2.j)) {
                iVar2.f = pVar.getPosition();
                i11 = -1;
                i12 = 3;
            } else {
                v vVar = (v) iVar2.j.b;
                iVar2.i = vVar.L;
                if (!iVar2.m) {
                    iVar2.b.g(vVar);
                    iVar2.m = true;
                }
                z0 z0Var = (z0) iVar2.j.c;
                if (z0Var != null) {
                    iVar2.d = z0Var;
                } else {
                    if (pVar.getLength() != -1) {
                        f fVar = eVar.a;
                        i3 = 2;
                        iVar2.d = new b(iVar2, iVar2.f, pVar.getLength(), fVar.d + fVar.e, fVar.b, (fVar.a & 4) != 0);
                        iVar2.h = i3;
                        bArr = yVar2.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        yVar2.L(yVar2.c, Arrays.copyOf(bArr, Math.max(65025, yVar2.c)));
                        return 0;
                    }
                    iVar2.d = new v7.s(28);
                }
                i3 = 2;
                iVar2.h = i3;
                bArr = yVar2.a;
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
            y yVar = new y(min);
            pVar.c(0, min, yVar.a);
            yVar.N(0);
            if (yVar.a() >= 5 && yVar.A() == 127 && yVar.C() == 1179402563) {
                this.b = new c();
                return true;
            }
            yVar.N(0);
            try {
                z10 = e3.b.w(1, yVar, true);
            } catch (v0 unused) {
                z10 = false;
            }
            if (z10) {
                this.b = new j();
            } else {
                yVar.N(0);
                if (h.e(yVar, h.o)) {
                    this.b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
