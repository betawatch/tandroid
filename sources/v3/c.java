package v3;

import c8.da;
import e2.p0;
import e2.q0;
import h2.k0;
import h2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.hn;
import w7.s;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c extends da {
    public final x a = new x();
    public final d4.f b = new d4.f();
    public k0 c;

    @Override // c8.da
    public final q0 b(o3.a aVar, ByteBuffer byteBuffer) {
        b eVar;
        long j3;
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
        d4.f fVar = this.b;
        fVar.H(limit, array);
        fVar.L(39);
        long j10 = (fVar.j(1) << 32) | fVar.j(32);
        fVar.L(20);
        int j11 = fVar.j(12);
        int j12 = fVar.j(8);
        xVar.O(14);
        if (j12 == 0) {
            eVar = new e();
        } else if (j12 == 255) {
            long C = xVar.C();
            int i7 = j11 - 4;
            xVar.k(0, i7, new byte[i7]);
            eVar = new a(C, 0, j10);
        } else if (j12 == 4) {
            int A = xVar.A();
            ArrayList arrayList = new ArrayList(A);
            for (int i10 = 0; i10 < A; i10++) {
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
                        for (int i11 = 0; i11 < A3; i11++) {
                            xVar.A();
                            xVar.C();
                            arrayList3.add(new nb.a(27));
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
                arrayList.add(new hn(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (j12 == 5) {
            k0 k0Var3 = this.c;
            xVar.C();
            boolean z13 = (xVar.A() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z13) {
                j3 = -9223372036854775807L;
            } else {
                int A4 = xVar.A();
                boolean z14 = (A4 & 64) != 0;
                boolean z15 = (A4 & 32) != 0;
                boolean z16 = (A4 & 16) != 0;
                long d = (!z14 || z16) ? -9223372036854775807L : a.d(j10, xVar);
                if (!z14) {
                    int A5 = xVar.A();
                    ArrayList arrayList4 = new ArrayList(A5);
                    for (int i12 = 0; i12 < A5; i12++) {
                        xVar.A();
                        k0Var3.b(!z16 ? a.d(j10, xVar) : -9223372036854775807L);
                        arrayList4.add(new s(26));
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
                j3 = d;
            }
            eVar = new d(j3, k0Var3.b(j3), list);
        } else if (j12 != 6) {
            eVar = null;
        } else {
            k0 k0Var4 = this.c;
            long d2 = a.d(j10, xVar);
            eVar = new a(d2, 1, k0Var4.b(d2));
        }
        return eVar == null ? new q0(new p0[0]) : new q0(eVar);
    }
}
