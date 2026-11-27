// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ri7 {
    public final HashMap a = new HashMap();

    public ri7(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qi7 qi7Var = (qi7) it.next();
            qi7Var.getClass();
            if (this.a.containsKey(lm5.class)) {
                Integer num = (Integer) hashMap.get(lm5.class);
                xve.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(lm5.class, qi7Var.a);
            hashMap.put(lm5.class, 0);
        }
    }
}
