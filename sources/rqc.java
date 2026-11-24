// default package

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class rqc implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqc b;
    public final /* synthetic */ k11 c;
    public final /* synthetic */ c d;

    public /* synthetic */ rqc(vqc vqcVar, k11 k11Var, c cVar, byte b) {
        this.a = b;
        this.b = vqcVar;
        this.c = k11Var;
        this.d = cVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c cVar = this.d;
        k11 k11Var = this.c;
        vqc vqcVar = this.b;
        switch (b) {
            case 0:
                y25 y25Var = (y25) obj;
                String str = (String) obj2;
                k11Var.c(false);
                if (y25Var != null) {
                    drc drcVar = new drc();
                    drcVar.h = true;
                    ArrayList arrayList = drcVar.a;
                    arrayList.clear();
                    if (!y25Var.d()) {
                        arrayList.addAll(y25Var.f());
                    }
                    drcVar.a0();
                    drcVar.f = new qhc((Object) vqcVar, (Object) cVar, (byte) 25);
                    vqcVar.presentFragment(drcVar);
                    break;
                } else {
                    c41.b0(vqcVar).f0(str != null ? str : "NULL_ERROR", false);
                    break;
                }
            default:
                v25 v25Var = (v25) obj;
                String str2 = (String) obj2;
                k11Var.c(false);
                if (v25Var != null) {
                    if (!vqcVar.f) {
                        vqcVar.e.add(v25Var);
                        drc drcVar2 = new drc();
                        y25 y25Var2 = v25Var.b;
                        ArrayList arrayList2 = drcVar2.a;
                        arrayList2.clear();
                        if (!y25Var2.d()) {
                            arrayList2.addAll(y25Var2.f());
                        }
                        drcVar2.a0();
                        drcVar2.f = new gcc(vqcVar, cVar, v25Var, (byte) 21);
                        vqcVar.presentFragment(drcVar2);
                        break;
                    } else {
                        v25Var.close();
                        break;
                    }
                } else {
                    c41.b0(vqcVar).f0(str2 != null ? str2 : "NULL_ERROR", false);
                    break;
                }
        }
    }
}
