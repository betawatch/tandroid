package s3;

import a4.g;
import b2.t0;
import b2.u0;
import e2.k0;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m2.t;
import t7.u;
import w7.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends l {
    public final x a = new x();
    public final g b = new g();
    public k0 c;

    @Override // w7.l
    public final u0 b(l3.a aVar, ByteBuffer byteBuffer) {
        t0 eVar;
        long j10;
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
        gVar.b0(limit, array);
        gVar.f0(39);
        long i10 = (gVar.i(1) << 32) | gVar.i(32);
        gVar.f0(20);
        int i11 = gVar.i(12);
        int i12 = gVar.i(8);
        xVar.O(14);
        if (i12 == 0) {
            eVar = new e();
        } else if (i12 == 255) {
            long C = xVar.C();
            int i13 = i11 - 4;
            xVar.k(0, i13, new byte[i13]);
            eVar = new a(C, 0, i10);
        } else if (i12 == 4) {
            int A = xVar.A();
            ArrayList arrayList = new ArrayList(A);
            for (int i14 = 0; i14 < A; i14++) {
                xVar.C();
                boolean z10 = (xVar.A() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z10) {
                    int A2 = xVar.A();
                    boolean z11 = (A2 & 64) != 0;
                    boolean z12 = (A2 & 32) != 0;
                    if (z11) {
                        xVar.C();
                    }
                    if (!z11) {
                        int A3 = xVar.A();
                        ArrayList arrayList3 = new ArrayList(A3);
                        for (int i15 = 0; i15 < A3; i15++) {
                            xVar.A();
                            xVar.C();
                            arrayList3.add(new hb.a(20));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z12) {
                        xVar.A();
                        xVar.C();
                    }
                    xVar.H();
                    xVar.A();
                    xVar.A();
                }
                arrayList.add(new t(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (i12 == 5) {
            k0 k0Var3 = this.c;
            xVar.C();
            boolean z13 = (xVar.A() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z13) {
                j10 = -9223372036854775807L;
            } else {
                int A4 = xVar.A();
                boolean z14 = (A4 & 64) != 0;
                boolean z15 = (A4 & 32) != 0;
                boolean z16 = (A4 & 16) != 0;
                long d = (!z14 || z16) ? -9223372036854775807L : a.d(i10, xVar);
                if (!z14) {
                    int A5 = xVar.A();
                    ArrayList arrayList4 = new ArrayList(A5);
                    for (int i16 = 0; i16 < A5; i16++) {
                        xVar.A();
                        k0Var3.b(!z16 ? a.d(i10, xVar) : -9223372036854775807L);
                        arrayList4.add(new u(19));
                    }
                    list = arrayList4;
                }
                if (z15) {
                    xVar.A();
                    xVar.C();
                }
                xVar.H();
                xVar.A();
                xVar.A();
                j10 = d;
            }
            eVar = new d(j10, k0Var3.b(j10), list);
        } else if (i12 != 6) {
            eVar = null;
        } else {
            k0 k0Var4 = this.c;
            long d10 = a.d(i10, xVar);
            eVar = new a(d10, 1, k0Var4.b(d10));
        }
        return eVar == null ? new u0(new t0[0]) : new u0(eVar);
    }
}
