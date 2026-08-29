package q4;

import ag.j2;
import j3.s0;
import j3.t0;
import java.util.Map;
import l4.b1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q extends b1 {
    public final Map H;
    public n3.c I;

    public q(com.google.android.exoplayer2.upstream.r rVar, n3.i iVar, j2 j2Var, Map map) {
        super(rVar, iVar, j2Var);
        this.H = map;
    }

    @Override // l4.b1
    public final t0 m(t0 t0Var) {
        n3.c cVar;
        n3.c cVar2 = this.I;
        if (cVar2 == null) {
            cVar2 = t0Var.E;
        }
        if (cVar2 != null && (cVar = (n3.c) this.H.get(cVar2.c)) != null) {
            cVar2 = cVar;
        }
        b4.c cVar3 = t0Var.s;
        b4.c cVar4 = null;
        if (cVar3 != null) {
            b4.b[] bVarArr = cVar3.a;
            int length = bVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                b4.b bVar = bVarArr[i11];
                if ((bVar instanceof g4.m) && "com.apple.streaming.transportStreamTimestamp".equals(((g4.m) bVar).b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    b4.b[] bVarArr2 = new b4.b[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            bVarArr2[i10 < i11 ? i10 : i10 - 1] = bVarArr[i10];
                        }
                        i10++;
                    }
                    cVar4 = new b4.c(bVarArr2);
                }
            }
            if (cVar2 == t0Var.E || cVar3 != t0Var.s) {
                s0 a2 = t0Var.a();
                a2.r = cVar2;
                a2.i = cVar3;
                t0Var = new t0(a2);
            }
            return super.m(t0Var);
        }
        cVar3 = cVar4;
        if (cVar2 == t0Var.E) {
        }
        s0 a22 = t0Var.a();
        a22.r = cVar2;
        a22.i = cVar3;
        t0Var = new t0(a22);
        return super.m(t0Var);
    }
}
