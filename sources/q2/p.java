package q2;

import android.support.v4.media.session.a0;
import d2.r0;
import d2.s0;
import d2.u;
import d2.v;
import java.util.Map;
import w2.c1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p extends c1 {
    public final Map J;
    public d2.s K;

    public p(a0 a0Var, p2.m mVar, p2.j jVar, Map map) {
        super(a0Var, mVar, jVar);
        this.J = map;
    }

    @Override // w2.c1
    public final v r(v vVar) {
        d2.s sVar;
        d2.s sVar2 = this.K;
        if (sVar2 == null) {
            sVar2 = vVar.w;
        }
        if (sVar2 != null && (sVar = (d2.s) this.J.get(sVar2.c)) != null) {
            sVar2 = sVar;
        }
        s0 s0Var = vVar.l;
        s0 s0Var2 = null;
        if (s0Var != null) {
            r0[] r0VarArr = s0Var.a;
            int length = r0VarArr.length;
            int i3 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                r0 r0Var = r0VarArr[i10];
                if ((r0Var instanceof s3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((s3.m) r0Var).b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    r0[] r0VarArr2 = new r0[length - 1];
                    while (i3 < length) {
                        if (i3 != i10) {
                            r0VarArr2[i3 < i10 ? i3 : i3 - 1] = r0VarArr[i3];
                        }
                        i3++;
                    }
                    s0Var2 = new s0(r0VarArr2);
                }
            }
            if (sVar2 == vVar.w || s0Var != vVar.l) {
                u a10 = vVar.a();
                a10.v = sVar2;
                a10.k = s0Var;
                vVar = new v(a10);
            }
            return super.r(vVar);
        }
        s0Var = s0Var2;
        if (sVar2 == vVar.w) {
        }
        u a102 = vVar.a();
        a102.v = sVar2;
        a102.k = s0Var;
        vVar = new v(a102);
        return super.r(vVar);
    }
}
