// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class s0f {
    public static r6c a(r6c r6cVar, String[] strArr, Map map) {
        int i = 0;
        if (r6cVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (r6c) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                r6c r6cVar2 = new r6c();
                int length = strArr.length;
                while (i < length) {
                    r6cVar2.a((r6c) map.get(strArr[i]));
                    i++;
                }
                return r6cVar2;
            }
        } else if (strArr != null) {
            if (strArr.length == 1) {
                r6cVar.a((r6c) map.get(strArr[0]));
                return r6cVar;
            }
            if (strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    r6cVar.a((r6c) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return r6cVar;
    }
}
