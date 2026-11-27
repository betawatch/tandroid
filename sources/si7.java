// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class si7 {
    public final HashMap a = new HashMap();

    public si7(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ri7 ri7Var = (ri7) it.next();
            ri7Var.getClass();
            if (this.a.containsKey(lm5.class)) {
                Integer num = (Integer) hashMap.get(lm5.class);
                xve.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(lm5.class, ri7Var.a);
            hashMap.put(lm5.class, 0);
        }
    }
}
