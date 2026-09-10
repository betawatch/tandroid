package s3;

import a4.h;
import b2.o0;
import b2.p0;
import e2.b0;
import e2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m.g3;
import t7.u;
import w7.l;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c extends l {
    public final v a = new v();
    public final h b = new h();
    public b0 c;

    @Override // w7.l
    public final p0 b(l3.a aVar, ByteBuffer byteBuffer) {
        b eVar;
        long j3;
        b0 b0Var = this.c;
        if (b0Var == null || aVar.r != b0Var.e()) {
            b0 b0Var2 = new b0(aVar.e);
            this.c = b0Var2;
            b0Var2.a(aVar.e - aVar.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.a;
        vVar.H(limit, array);
        h hVar = this.b;
        hVar.o(limit, array);
        hVar.t(39);
        long i10 = (hVar.i(1) << 32) | hVar.i(32);
        hVar.t(20);
        int i11 = hVar.i(12);
        int i12 = hVar.i(8);
        vVar.K(14);
        if (i12 == 0) {
            eVar = new e();
        } else if (i12 == 255) {
            long z10 = vVar.z();
            int i13 = i11 - 4;
            vVar.h(0, i13, new byte[i13]);
            eVar = new a(z10, i10, 0);
        } else if (i12 == 4) {
            int x10 = vVar.x();
            ArrayList arrayList = new ArrayList(x10);
            for (int i14 = 0; i14 < x10; i14++) {
                vVar.z();
                boolean z11 = (vVar.x() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z11) {
                    int x11 = vVar.x();
                    boolean z12 = (x11 & 64) != 0;
                    boolean z13 = (x11 & 32) != 0;
                    if (z12) {
                        vVar.z();
                    }
                    if (!z12) {
                        int x12 = vVar.x();
                        ArrayList arrayList3 = new ArrayList(x12);
                        for (int i15 = 0; i15 < x12; i15++) {
                            vVar.x();
                            vVar.z();
                            arrayList3.add(new u());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z13) {
                        vVar.x();
                        vVar.z();
                    }
                    vVar.D();
                    vVar.x();
                    vVar.x();
                }
                arrayList.add(new g3(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (i12 == 5) {
            b0 b0Var3 = this.c;
            vVar.z();
            boolean z14 = (vVar.x() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z14) {
                j3 = -9223372036854775807L;
            } else {
                int x13 = vVar.x();
                boolean z15 = (x13 & 64) != 0;
                boolean z16 = (x13 & 32) != 0;
                boolean z17 = (x13 & 16) != 0;
                long d = (!z15 || z17) ? -9223372036854775807L : a.d(i10, vVar);
                if (!z15) {
                    int x14 = vVar.x();
                    ArrayList arrayList4 = new ArrayList(x14);
                    for (int i16 = 0; i16 < x14; i16++) {
                        vVar.x();
                        b0Var3.b(!z17 ? a.d(i10, vVar) : -9223372036854775807L);
                        arrayList4.add(new rb.a(21));
                    }
                    list = arrayList4;
                }
                if (z16) {
                    vVar.x();
                    vVar.z();
                }
                vVar.D();
                vVar.x();
                vVar.x();
                j3 = d;
            }
            eVar = new d(j3, b0Var3.b(j3), list);
        } else if (i12 != 6) {
            eVar = null;
        } else {
            b0 b0Var4 = this.c;
            long d10 = a.d(i10, vVar);
            eVar = new a(d10, b0Var4.b(d10), 1);
        }
        return eVar == null ? new p0(new o0[0]) : new p0(eVar);
    }
}
