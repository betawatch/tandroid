package v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class a7 {
    public static void a(bf.s sVar, bf.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        bf.p pVar = (bf.p) sVar.f;
        bf.p pVar2 = (bf.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((bf.s) pVar).g);
            bf.p pVar3 = (bf.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(bf.p pVar, bf.p pVar2) {
        bf.s sVar = null;
        bf.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof bf.s) {
                sVar2 = (bf.s) pVar;
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
                pVar = (bf.p) pVar.f;
            }
        }
        a(sVar, sVar2, i10);
    }
}
