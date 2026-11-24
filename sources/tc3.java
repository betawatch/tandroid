// default package

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tc3 {
    public final String a;
    public final qx4 b;

    public tc3(Set set, qx4 qx4Var) {
        this.a = b(set);
        this.b = qx4Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            y90 y90Var = (y90) it.next();
            sb.append(y90Var.a);
            sb.append('/');
            sb.append(y90Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        qx4 qx4Var = this.b;
        synchronized (((HashSet) qx4Var.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) qx4Var.a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(qx4Var.K());
    }
}
