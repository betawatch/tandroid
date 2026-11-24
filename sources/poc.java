// default package

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class poc implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ toc b;
    public final /* synthetic */ c01 c;
    public final /* synthetic */ c d;

    public /* synthetic */ poc(toc tocVar, c01 c01Var, c cVar, byte b) {
        this.a = b;
        this.b = tocVar;
        this.c = c01Var;
        this.d = cVar;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c cVar = this.d;
        c01 c01Var = this.c;
        toc tocVar = this.b;
        switch (b) {
            case 0:
                y05 y05Var = (y05) obj;
                String str = (String) obj2;
                c01Var.c(false);
                if (y05Var != null) {
                    bpc bpcVar = new bpc();
                    bpcVar.h = true;
                    ArrayList arrayList = bpcVar.a;
                    arrayList.clear();
                    if (!y05Var.d()) {
                        arrayList.addAll(y05Var.f());
                    }
                    bpcVar.Z();
                    bpcVar.f = new mhc(tocVar, cVar, (byte) 23);
                    tocVar.presentFragment(bpcVar);
                    break;
                } else {
                    u21.b0(tocVar).f0(str != null ? str : "NULL_ERROR", false);
                    break;
                }
            default:
                v05 v05Var = (v05) obj;
                String str2 = (String) obj2;
                c01Var.c(false);
                if (v05Var != null) {
                    if (!tocVar.f) {
                        tocVar.e.add(v05Var);
                        bpc bpcVar2 = new bpc();
                        y05 y05Var2 = v05Var.b;
                        ArrayList arrayList2 = bpcVar2.a;
                        arrayList2.clear();
                        if (!y05Var2.d()) {
                            arrayList2.addAll(y05Var2.f());
                        }
                        bpcVar2.Z();
                        bpcVar2.f = new wbc(tocVar, cVar, v05Var, (byte) 18);
                        tocVar.presentFragment(bpcVar2);
                        break;
                    } else {
                        v05Var.close();
                        break;
                    }
                } else {
                    u21.b0(tocVar).f0(str2 != null ? str2 : "NULL_ERROR", false);
                    break;
                }
        }
    }
}
