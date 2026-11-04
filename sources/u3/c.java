package u3;

import b8.te;
import d2.r0;
import d2.s0;
import g2.l0;
import g2.y;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends te {
    public final y a = new y();
    public final c4.f b = new c4.f();
    public l0 c;

    @Override // b8.te
    public final s0 b(n3.a aVar, ByteBuffer byteBuffer) {
        r0 eVar;
        long j10;
        l0 l0Var = this.c;
        if (l0Var == null || aVar.r != l0Var.e()) {
            l0 l0Var2 = new l0(aVar.e);
            this.c = l0Var2;
            l0Var2.a(aVar.e - aVar.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.a;
        yVar.L(limit, array);
        c4.f fVar = this.b;
        fVar.H(limit, array);
        fVar.L(39);
        long j11 = (fVar.j(1) << 32) | fVar.j(32);
        fVar.L(20);
        int j12 = fVar.j(12);
        int j13 = fVar.j(8);
        yVar.O(14);
        if (j13 == 0) {
            eVar = new e();
        } else if (j13 != 255) {
            int i3 = 25;
            if (j13 == 4) {
                int A = yVar.A();
                ArrayList arrayList = new ArrayList(A);
                for (int i10 = 0; i10 < A; i10++) {
                    yVar.C();
                    boolean z10 = (yVar.A() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (!z10) {
                        int A2 = yVar.A();
                        boolean z11 = (A2 & 64) != 0;
                        boolean z12 = (A2 & 32) != 0;
                        if (z11) {
                            yVar.C();
                        }
                        if (!z11) {
                            int A3 = yVar.A();
                            ArrayList arrayList3 = new ArrayList(A3);
                            for (int i11 = 0; i11 < A3; i11++) {
                                yVar.A();
                                yVar.C();
                                arrayList3.add(new mb.b(i3));
                            }
                            arrayList2 = arrayList3;
                        }
                        if (z12) {
                            yVar.A();
                            yVar.C();
                        }
                        yVar.H();
                        yVar.A();
                        yVar.A();
                    }
                    y00 y00Var = new y00();
                    y00Var.a = DesugarCollections.unmodifiableList(arrayList2);
                    arrayList.add(y00Var);
                }
                eVar = new f(arrayList);
            } else if (j13 == 5) {
                l0 l0Var3 = this.c;
                yVar.C();
                boolean z13 = (yVar.A() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z13) {
                    j10 = -9223372036854775807L;
                } else {
                    int A4 = yVar.A();
                    boolean z14 = (A4 & 64) != 0;
                    boolean z15 = (A4 & 32) != 0;
                    boolean z16 = (A4 & 16) != 0;
                    long d = (!z14 || z16) ? -9223372036854775807L : a.d(j11, yVar);
                    if (!z14) {
                        int A5 = yVar.A();
                        ArrayList arrayList4 = new ArrayList(A5);
                        for (int i12 = 0; i12 < A5; i12++) {
                            yVar.A();
                            l0Var3.b(!z16 ? a.d(j11, yVar) : -9223372036854775807L);
                            arrayList4.add(new kb.a(25));
                        }
                        list = arrayList4;
                    }
                    if (z15) {
                        yVar.A();
                        yVar.C();
                    }
                    yVar.H();
                    yVar.A();
                    yVar.A();
                    j10 = d;
                }
                eVar = new d(j10, l0Var3.b(j10), list);
            } else if (j13 != 6) {
                eVar = null;
            } else {
                l0 l0Var4 = this.c;
                long d10 = a.d(j11, yVar);
                eVar = new a(d10, 1, l0Var4.b(d10));
            }
        } else {
            long C = yVar.C();
            int i13 = j12 - 4;
            yVar.k(0, i13, new byte[i13]);
            eVar = new a(C, 0, j11);
        }
        return eVar == null ? new s0(new r0[0]) : new s0(eVar);
    }
}
