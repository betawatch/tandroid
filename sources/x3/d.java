package x3;

import b2.s0;
import c3.b0;
import c3.h0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.Arrays;
import java.util.List;
import t7.u;
import u2.x0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d implements o {
    public q a;
    public i b;
    public boolean c;

    public final boolean a(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.a & 2) == 2) {
            int min = Math.min(fVar.e, 8);
            v vVar = new v(min);
            pVar.b(0, min, vVar.a);
            vVar.J(0);
            if (vVar.a() >= 5 && vVar.x() == 127 && vVar.z() == 1179402563) {
                this.b = new c();
                return true;
            }
            vVar.J(0);
            try {
                z10 = c3.b.x(1, vVar, true);
            } catch (s0 unused) {
                z10 = false;
            }
            if (z10) {
                this.b = new j();
            } else {
                vVar.J(0);
                if (h.e(vVar, h.o)) {
                    this.b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        try {
            return a(pVar);
        } catch (s0 unused) {
            return false;
        }
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.a = qVar;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        i iVar = this.b;
        if (iVar != null) {
            e eVar = iVar.a;
            f fVar = eVar.a;
            fVar.a = 0;
            fVar.b = 0L;
            fVar.c = 0;
            fVar.d = 0;
            fVar.e = 0;
            eVar.b.G(0);
            eVar.c = -1;
            eVar.e = false;
            if (j3 == 0) {
                iVar.d(!iVar.l);
                return;
            }
            if (iVar.h != 0) {
                long j11 = (iVar.i * j10) / 1000000;
                iVar.e = j11;
                g gVar = iVar.d;
                String str = d0.a;
                gVar.h(j11);
                iVar.h = 2;
            }
        }
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        v vVar;
        int i10;
        byte[] bArr;
        e2.d.h(this.a);
        if (this.b == null) {
            if (!a(pVar)) {
                throw s0.a(null, "Failed to determine bitstream type");
            }
            pVar.q();
        }
        if (!this.c) {
            h0 R1 = this.a.R1(0, 1);
            this.a.Z0();
            i iVar = this.b;
            iVar.c = this.a;
            iVar.b = R1;
            iVar.d(true);
            this.c = true;
        }
        i iVar2 = this.b;
        e eVar = iVar2.a;
        e2.d.h(iVar2.b);
        String str = d0.a;
        int i11 = iVar2.h;
        long j3 = -1;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar.r((int) iVar2.f);
                iVar2.h = 2;
                return 0;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long a2 = iVar2.d.a(pVar);
            if (a2 >= 0) {
                sVar.a = a2;
                return 1;
            }
            if (a2 < -1) {
                iVar2.a(-(a2 + 2));
            }
            if (!iVar2.l) {
                b0 d = iVar2.d.d();
                e2.d.h(d);
                iVar2.c.P1(d);
                h0 h0Var = iVar2.b;
                d.l();
                h0Var.getClass();
                iVar2.l = true;
            }
            if (iVar2.k <= 0 && !eVar.b(pVar)) {
                iVar2.h = 3;
                return -1;
            }
            iVar2.k = 0L;
            v vVar2 = eVar.b;
            long b10 = iVar2.b(vVar2);
            if (b10 >= 0) {
                long j10 = iVar2.g;
                if (j10 + b10 >= iVar2.e) {
                    iVar2.b.d(vVar2.c, vVar2);
                    iVar2.b.c((j10 * 1000000) / iVar2.i, 1, vVar2.c, 0, null);
                    iVar2.e = -1L;
                }
            }
            iVar2.g += b10;
            return 0;
        }
        while (true) {
            boolean b11 = eVar.b(pVar);
            v vVar3 = eVar.b;
            if (!b11) {
                iVar2.h = 3;
                return -1;
            }
            long position = pVar.getPosition();
            long j11 = j3;
            long j12 = iVar2.f;
            iVar2.k = position - j12;
            if (iVar2.c(vVar3, j12, iVar2.j)) {
                iVar2.f = pVar.getPosition();
                j3 = j11;
            } else {
                b2.s sVar2 = (b2.s) iVar2.j.b;
                iVar2.i = sVar2.K;
                if (!iVar2.m) {
                    iVar2.b.b(sVar2);
                    iVar2.m = true;
                }
                x0 x0Var = (x0) iVar2.j.c;
                if (x0Var != null) {
                    iVar2.d = x0Var;
                } else {
                    if (pVar.getLength() != j11) {
                        f fVar = eVar.a;
                        boolean z10 = (fVar.a & 4) != 0;
                        long j13 = iVar2.f;
                        long length = pVar.getLength();
                        long j14 = fVar.d + fVar.e;
                        long j15 = fVar.b;
                        vVar = vVar3;
                        i10 = 2;
                        iVar2.d = new b(iVar2, j13, length, j14, j15, z10);
                        iVar2.h = i10;
                        bArr = vVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        vVar.H(vVar.c, Arrays.copyOf(bArr, Math.max(65025, vVar.c)));
                        return 0;
                    }
                    iVar2.d = new u(25);
                }
                vVar = vVar3;
                i10 = 2;
                iVar2.h = i10;
                bArr = vVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
