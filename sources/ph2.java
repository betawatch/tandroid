// default package

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ph2 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public ph2(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            u06 u06Var = (u06) entry.getValue();
            List list = (List) this.a.get(u06Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(u06Var, list);
            }
            list.add((qh2) entry.getKey());
        }
    }

    public static void a(List list, e16 e16Var, u06 u06Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                qh2 qh2Var = (qh2) list.get(size);
                Method method = qh2Var.b;
                try {
                    byte b = qh2Var.a;
                    if (b == 0) {
                        method.invoke(obj, null);
                    } else if (b == 1) {
                        method.invoke(obj, e16Var);
                    } else if (b == 2) {
                        method.invoke(obj, e16Var, u06Var);
                    }
                } catch (IllegalAccessException e) {
                    sdb.b(e);
                    return;
                } catch (InvocationTargetException e2) {
                    fyb.j("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
