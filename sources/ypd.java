// default package

/* loaded from: classes.dex */
public final class ypd {
    public static lpd a(Object obj, Object obj2) {
        lpd lpdVar = (lpd) obj;
        lpd lpdVar2 = (lpd) obj2;
        if (!lpdVar2.isEmpty()) {
            if (!lpdVar.a) {
                if (lpdVar.isEmpty()) {
                    lpdVar = new lpd();
                } else {
                    lpd lpdVar3 = new lpd(lpdVar);
                    lpdVar3.a = true;
                    lpdVar = lpdVar3;
                }
            }
            lpdVar.b();
            if (!lpdVar2.isEmpty()) {
                lpdVar.putAll(lpdVar2);
            }
        }
        return lpdVar;
    }
}
