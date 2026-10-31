package w7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h9 {
    public static void a(ve.r rVar, ve.r rVar2, int i10) {
        if (rVar == null || rVar2 == null || rVar == rVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(rVar.g);
        df.c cVar = (df.c) rVar.f;
        df.c cVar2 = (df.c) rVar2.f;
        while (cVar != cVar2) {
            sb2.append(((ve.r) cVar).g);
            df.c cVar3 = (df.c) cVar.f;
            cVar.g();
            cVar = cVar3;
        }
        rVar.g = sb2.toString();
    }

    public static void b(df.c cVar, df.c cVar2) {
        ve.r rVar = null;
        ve.r rVar2 = null;
        int i10 = 0;
        while (cVar != null) {
            if (cVar instanceof ve.r) {
                rVar2 = (ve.r) cVar;
                if (rVar == null) {
                    rVar = rVar2;
                }
                i10 = rVar2.g.length() + i10;
            } else {
                a(rVar, rVar2, i10);
                rVar = null;
                rVar2 = null;
                i10 = 0;
            }
            if (cVar == cVar2) {
                break;
            } else {
                cVar = (df.c) cVar.f;
            }
        }
        a(rVar, rVar2, i10);
    }
}
