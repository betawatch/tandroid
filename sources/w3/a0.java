package w3;

import h3.s0;
import h3.t0;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a0 {
    public final /* synthetic */ int a;
    public final List b;
    public final m3.w[] c;

    public a0(int i10, List list) {
        this.a = i10;
        switch (i10) {
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

    public void a(long j10, d5.z zVar) {
        if (zVar.a() < 9) {
            return;
        }
        int e9 = zVar.e();
        int e10 = zVar.e();
        int r10 = zVar.r();
        if (e9 == 434 && e10 == 1195456820 && r10 == 3) {
            h7.p.b(j10, zVar, this.c);
        }
    }

    public final void b(m3.m mVar, e0 e0Var) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    m3.w[] wVarArr = this.c;
                    if (i10 >= wVarArr.length) {
                        break;
                    } else {
                        e0Var.a();
                        e0Var.b();
                        m3.w C = mVar.C(e0Var.d, 3);
                        t0 t0Var = (t0) this.b.get(i10);
                        String str = t0Var.B;
                        d5.a.e("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = t0Var.a;
                        if (str2 == null) {
                            e0Var.b();
                            str2 = e0Var.e;
                        }
                        s0 s0Var = new s0();
                        s0Var.a = str2;
                        s0Var.o = str;
                        s0Var.d = t0Var.d;
                        s0Var.c = t0Var.c;
                        s0Var.G = t0Var.T;
                        s0Var.q = t0Var.D;
                        C.c(new t0(s0Var));
                        wVarArr[i10] = C;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    m3.w[] wVarArr2 = this.c;
                    if (i11 >= wVarArr2.length) {
                        break;
                    } else {
                        e0Var.a();
                        e0Var.b();
                        m3.w C2 = mVar.C(e0Var.d, 3);
                        t0 t0Var2 = (t0) this.b.get(i11);
                        String str3 = t0Var2.B;
                        d5.a.e("Invalid closed caption mime type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        s0 s0Var2 = new s0();
                        e0Var.b();
                        s0Var2.a = e0Var.e;
                        s0Var2.o = str3;
                        s0Var2.d = t0Var2.d;
                        s0Var2.c = t0Var2.c;
                        s0Var2.G = t0Var2.T;
                        s0Var2.q = t0Var2.D;
                        C2.c(new t0(s0Var2));
                        wVarArr2[i11] = C2;
                        i11++;
                    }
                }
                break;
        }
    }
}
