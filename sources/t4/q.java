package t4;

import j3.m0;
import j3.n0;
import java.util.Map;
import o4.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q extends k0 {
    public final Map H;
    public o3.h I;

    public q(g5.q qVar, o3.p pVar, o3.m mVar, Map map) {
        super(qVar, pVar, mVar);
        this.H = map;
    }

    @Override // o4.k0
    public final n0 m(n0 n0Var) {
        o3.h hVar;
        o3.h hVar2 = this.I;
        if (hVar2 == null) {
            hVar2 = n0Var.F;
        }
        if (hVar2 != null && (hVar = (o3.h) this.H.get(hVar2.c)) != null) {
            hVar2 = hVar;
        }
        e4.c cVar = n0Var.s;
        e4.c cVar2 = null;
        if (cVar != null) {
            e4.b[] bVarArr = cVar.a;
            int length = bVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                e4.b bVar = bVarArr[i11];
                if ((bVar instanceof j4.m) && "com.apple.streaming.transportStreamTimestamp".equals(((j4.m) bVar).b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    e4.b[] bVarArr2 = new e4.b[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            bVarArr2[i10 < i11 ? i10 : i10 - 1] = bVarArr[i10];
                        }
                        i10++;
                    }
                    cVar2 = new e4.c(bVarArr2);
                }
            }
            if (hVar2 == n0Var.F || cVar != n0Var.s) {
                m0 a2 = n0Var.a();
                a2.r = hVar2;
                a2.i = cVar;
                n0Var = new n0(a2);
            }
            return super.m(n0Var);
        }
        cVar = cVar2;
        if (hVar2 == n0Var.F) {
        }
        m0 a22 = n0Var.a();
        a22.r = hVar2;
        a22.i = cVar;
        n0Var = new n0(a22);
        return super.m(n0Var);
    }
}
