package s3;

import a4.g;
import a8.wd;
import b2.t0;
import b2.u0;
import e2.k0;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jg.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends wd {
    public final x a = new x();
    public final g b = new g();
    public k0 c;

    @Override // a8.wd
    public final u0 b(l3.a aVar, ByteBuffer byteBuffer) {
        b eVar;
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
        gVar.k(limit, array);
        gVar.o(39);
        long g7 = (gVar.g(1) << 32) | gVar.g(32);
        gVar.o(20);
        int g10 = gVar.g(12);
        int g11 = gVar.g(8);
        xVar.O(14);
        if (g11 == 0) {
            eVar = new e();
        } else if (g11 == 255) {
            long C = xVar.C();
            int i10 = g10 - 4;
            xVar.k(0, i10, new byte[i10]);
            eVar = new a(C, g7, 0);
        } else if (g11 == 4) {
            int A = xVar.A();
            ArrayList arrayList = new ArrayList(A);
            for (int i11 = 0; i11 < A; i11++) {
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
                        for (int i12 = 0; i12 < A3; i12++) {
                            xVar.A();
                            xVar.C();
                            arrayList3.add(new qb.a(22));
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
                arrayList.add(new s0(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (g11 == 5) {
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
                long d = (!z14 || z16) ? -9223372036854775807L : a.d(g7, xVar);
                if (!z14) {
                    int A5 = xVar.A();
                    ArrayList arrayList4 = new ArrayList(A5);
                    for (int i13 = 0; i13 < A5; i13++) {
                        xVar.A();
                        k0Var3.b(!z16 ? a.d(g7, xVar) : -9223372036854775807L);
                        arrayList4.add(new pa.d());
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
        } else if (g11 != 6) {
            eVar = null;
        } else {
            k0 k0Var4 = this.c;
            long d10 = a.d(g7, xVar);
            eVar = new a(d10, k0Var4.b(d10), 1);
        }
        return eVar == null ? new u0(new t0[0]) : new u0(eVar);
    }
}
