package v7;

import java.util.Map;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class g7 {
    public static f4.g a(f4.g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (f4.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                f4.g gVar2 = new f4.g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((f4.g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((f4.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((f4.g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
