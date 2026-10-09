package v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class c7 {
    public static void a(cf.s sVar, cf.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        cf.p pVar = (cf.p) sVar.f;
        cf.p pVar2 = (cf.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((cf.s) pVar).g);
            cf.p pVar3 = (cf.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(cf.p pVar, cf.p pVar2) {
        cf.s sVar = null;
        cf.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof cf.s) {
                sVar2 = (cf.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (cf.p) pVar.f;
            }
        }
        a(sVar, sVar2, i10);
    }
}
