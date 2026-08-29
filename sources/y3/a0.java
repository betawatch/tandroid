package y3;

import i7.g0;
import j3.s0;
import j3.t0;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 {
    public final /* synthetic */ int a;
    public final List b;
    public final o3.w[] c;

    public a0(int i10, List list) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = list;
                this.c = new o3.w[list.size()];
                break;
            default:
                this.b = list;
                this.c = new o3.w[list.size()];
                break;
        }
    }

    public void a(long j10, f5.w wVar) {
        if (wVar.a() < 9) {
            return;
        }
        int e10 = wVar.e();
        int e11 = wVar.e();
        int r6 = wVar.r();
        if (e10 == 434 && e11 == 1195456820 && r6 == 3) {
            g0.b(j10, wVar, this.c);
        }
    }

    public final void b(o3.m mVar, d0 d0Var) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    o3.w[] wVarArr = this.c;
                    if (i10 >= wVarArr.length) {
                        break;
                    } else {
                        d0Var.a();
                        d0Var.b();
                        o3.w Z1 = mVar.Z1(d0Var.d, 3);
                        t0 t0Var = (t0) this.b.get(i10);
                        String str = t0Var.B;
                        f5.a.e("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = t0Var.a;
                        if (str2 == null) {
                            d0Var.b();
                            str2 = d0Var.e;
                        }
                        s0 s0Var = new s0();
                        s0Var.a = str2;
                        s0Var.o = str;
                        s0Var.d = t0Var.d;
                        s0Var.c = t0Var.c;
                        s0Var.G = t0Var.T;
                        s0Var.q = t0Var.D;
                        Z1.b(new t0(s0Var));
                        wVarArr[i10] = Z1;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    o3.w[] wVarArr2 = this.c;
                    if (i11 >= wVarArr2.length) {
                        break;
                    } else {
                        d0Var.a();
                        d0Var.b();
                        o3.w Z12 = mVar.Z1(d0Var.d, 3);
                        t0 t0Var2 = (t0) this.b.get(i11);
                        String str3 = t0Var2.B;
                        f5.a.e("Invalid closed caption mime type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        s0 s0Var2 = new s0();
                        d0Var.b();
                        s0Var2.a = d0Var.e;
                        s0Var2.o = str3;
                        s0Var2.d = t0Var2.d;
                        s0Var2.c = t0Var2.c;
                        s0Var2.G = t0Var2.T;
                        s0Var2.q = t0Var2.D;
                        Z12.b(new t0(s0Var2));
                        wVarArr2[i11] = Z12;
                        i11++;
                    }
                }
                break;
        }
    }
}
