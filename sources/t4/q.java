package t4;

import j3.m0;
import j3.n0;
import java.util.Map;
import o4.k0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q extends k0 {
    public final Map H;
    public o3.g I;

    public q(g5.q qVar, o3.o oVar, o3.l lVar, Map map) {
        super(qVar, oVar, lVar);
        this.H = map;
    }

    @Override // o4.k0
    public final n0 m(n0 n0Var) {
        o3.g gVar;
        o3.g gVar2 = this.I;
        if (gVar2 == null) {
            gVar2 = n0Var.F;
        }
        if (gVar2 != null && (gVar = (o3.g) this.H.get(gVar2.c)) != null) {
            gVar2 = gVar;
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
            if (gVar2 == n0Var.F || cVar != n0Var.s) {
                m0 a2 = n0Var.a();
                a2.r = gVar2;
                a2.i = cVar;
                n0Var = new n0(a2);
            }
            return super.m(n0Var);
        }
        cVar = cVar2;
        if (gVar2 == n0Var.F) {
        }
        m0 a22 = n0Var.a();
        a22.r = gVar2;
        a22.i = cVar;
        n0Var = new n0(a22);
        return super.m(n0Var);
    }
}
