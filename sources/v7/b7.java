package v7;

import java.util.Map;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class b7 {
    public static f4.f a(f4.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (f4.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                f4.f fVar2 = new f4.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((f4.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((f4.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((f4.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }
}
