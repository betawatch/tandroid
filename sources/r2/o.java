package r2;

import e2.p0;
import e2.q0;
import e2.t;
import e2.u;
import java.util.Map;
import x2.b1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class o extends b1 {
    public final Map J;
    public e2.r K;

    public o(h6.m mVar, q2.m mVar2, q2.j jVar, Map map) {
        super(mVar, mVar2, jVar);
        this.J = map;
    }

    @Override // x2.b1
    public final u r(u uVar) {
        e2.r rVar;
        e2.r rVar2 = this.K;
        if (rVar2 == null) {
            rVar2 = uVar.w;
        }
        if (rVar2 != null && (rVar = (e2.r) this.J.get(rVar2.c)) != null) {
            rVar2 = rVar;
        }
        q0 q0Var = uVar.l;
        q0 q0Var2 = null;
        if (q0Var != null) {
            p0[] p0VarArr = q0Var.a;
            int length = p0VarArr.length;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                p0 p0Var = p0VarArr[i10];
                if ((p0Var instanceof t3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((t3.m) p0Var).b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    p0[] p0VarArr2 = new p0[length - 1];
                    while (i7 < length) {
                        if (i7 != i10) {
                            p0VarArr2[i7 < i10 ? i7 : i7 - 1] = p0VarArr[i7];
                        }
                        i7++;
                    }
                    q0Var2 = new q0(p0VarArr2);
                }
            }
            if (rVar2 == uVar.w || q0Var != uVar.l) {
                t a10 = uVar.a();
                a10.v = rVar2;
                a10.k = q0Var;
                uVar = new u(a10);
            }
            return super.r(uVar);
        }
        q0Var = q0Var2;
        if (rVar2 == uVar.w) {
        }
        t a102 = uVar.a();
        a102.v = rVar2;
        a102.k = q0Var;
        uVar = new u(a102);
        return super.r(uVar);
    }
}
