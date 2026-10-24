package s3;

import a4.g;
import b2.s0;
import b2.t0;
import e2.k0;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ki.t1;
import w7.m;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class c extends m {
    public final x a = new x();
    public final g b = new g();
    public k0 c;

    @Override // w7.m
    public final t0 b(l3.a aVar, ByteBuffer byteBuffer) {
        int i10;
        s0 eVar;
        long j10;
        boolean z10;
        long j11;
        k0 k0Var = this.c;
        if (k0Var == null || aVar.r != k0Var.e()) {
            k0 k0Var2 = new k0(aVar.e);
            this.c = k0Var2;
            k0Var2.a(aVar.e - aVar.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.a;
        xVar.L(limit, array);
        g gVar = this.b;
        gVar.k(limit, array);
        gVar.o(39);
        long g10 = (gVar.g(1) << 32) | gVar.g(32);
        gVar.o(20);
        int g11 = gVar.g(12);
        int g12 = gVar.g(8);
        xVar.O(14);
        if (g12 == 0) {
            i10 = 0;
            eVar = new e();
        } else if (g12 != 255) {
            if (g12 == 4) {
                int A = xVar.A();
                ArrayList arrayList = new ArrayList(A);
                for (int i11 = 0; i11 < A; i11++) {
                    xVar.C();
                    boolean z11 = (xVar.A() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (!z11) {
                        int A2 = xVar.A();
                        boolean z12 = (A2 & 64) != 0;
                        boolean z13 = (A2 & 32) != 0;
                        if (z12) {
                            xVar.C();
                        }
                        if (!z12) {
                            int A3 = xVar.A();
                            ArrayList arrayList3 = new ArrayList(A3);
                            for (int i12 = 0; i12 < A3; i12++) {
                                xVar.A();
                                xVar.C();
                                arrayList3.add(new sb.a(22));
                            }
                            arrayList2 = arrayList3;
                        }
                        if (z13) {
                            xVar.A();
                            xVar.C();
                        }
                        xVar.H();
                        xVar.A();
                        xVar.A();
                    }
                    arrayList.add(new t1(arrayList2));
                }
                eVar = new f(arrayList);
            } else if (g12 == 5) {
                k0 k0Var3 = this.c;
                xVar.C();
                boolean z14 = (xVar.A() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z14) {
                    j10 = -9223372036854775807L;
                } else {
                    int A4 = xVar.A();
                    boolean z15 = (A4 & 64) != 0;
                    boolean z16 = (A4 & 32) != 0;
                    boolean z17 = (A4 & 16) != 0;
                    long d = (!z15 || z17) ? -9223372036854775807L : a.d(g10, xVar);
                    if (!z15) {
                        int A5 = xVar.A();
                        ArrayList arrayList4 = new ArrayList(A5);
                        int i13 = 0;
                        while (i13 < A5) {
                            xVar.A();
                            if (z17) {
                                z10 = z17;
                                j11 = -9223372036854775807L;
                            } else {
                                z10 = z17;
                                j11 = a.d(g10, xVar);
                            }
                            k0Var3.b(j11);
                            arrayList4.add(new rb.b(22));
                            i13++;
                            z17 = z10;
                        }
                        list = arrayList4;
                    }
                    if (z16) {
                        xVar.A();
                        xVar.C();
                    }
                    xVar.H();
                    xVar.A();
                    xVar.A();
                    j10 = d;
                }
                eVar = new d(j10, k0Var3.b(j10), list);
            } else if (g12 != 6) {
                eVar = null;
            } else {
                k0 k0Var4 = this.c;
                long d10 = a.d(g10, xVar);
                eVar = new a(d10, k0Var4.b(d10), 1);
            }
            i10 = 0;
        } else {
            long C = xVar.C();
            int i14 = g11 - 4;
            i10 = 0;
            xVar.k(0, i14, new byte[i14]);
            eVar = new a(C, g10, 0);
        }
        if (eVar == null) {
            return new t0(new s0[i10]);
        }
        s0[] s0VarArr = new s0[1];
        s0VarArr[i10] = eVar;
        return new t0(s0VarArr);
    }
}
