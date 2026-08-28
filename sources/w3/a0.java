package w3;

import h3.s0;
import h3.t0;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 {
    public final /* synthetic */ int a;
    public final List b;
    public final m3.w[] c;

    public a0(int i9, List list) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.b = list;
                this.c = new m3.w[list.size()];
                break;
            default:
                this.b = list;
                this.c = new m3.w[list.size()];
                break;
        }
    }

    public void a(long j10, d5.y yVar) {
        if (yVar.a() < 9) {
            return;
        }
        int e10 = yVar.e();
        int e11 = yVar.e();
        int r10 = yVar.r();
        if (e10 == 434 && e11 == 1195456820 && r10 == 3) {
            g7.p.b(j10, yVar, this.c);
        }
    }

    public final void b(m3.m mVar, d0 d0Var) {
        switch (this.a) {
            case 0:
                int i9 = 0;
                while (true) {
                    m3.w[] wVarArr = this.c;
                    if (i9 >= wVarArr.length) {
                        break;
                    } else {
                        d0Var.a();
                        d0Var.b();
                        m3.w I = mVar.I(d0Var.d, 3);
                        t0 t0Var = (t0) this.b.get(i9);
                        String str = t0Var.B;
                        d5.a.e("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
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
                        I.c(new t0(s0Var));
                        wVarArr[i9] = I;
                        i9++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    m3.w[] wVarArr2 = this.c;
                    if (i10 >= wVarArr2.length) {
                        break;
                    } else {
                        d0Var.a();
                        d0Var.b();
                        m3.w I2 = mVar.I(d0Var.d, 3);
                        t0 t0Var2 = (t0) this.b.get(i10);
                        String str3 = t0Var2.B;
                        d5.a.e("Invalid closed caption mime type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        s0 s0Var2 = new s0();
                        d0Var.b();
                        s0Var2.a = d0Var.e;
                        s0Var2.o = str3;
                        s0Var2.d = t0Var2.d;
                        s0Var2.c = t0Var2.c;
                        s0Var2.G = t0Var2.T;
                        s0Var2.q = t0Var2.D;
                        I2.c(new t0(s0Var2));
                        wVarArr2[i10] = I2;
                        i10++;
                    }
                }
                break;
        }
    }
}
