package xa;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final c b;

    public b(Set set, c cVar) {
        this.a = b(set);
        this.b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.a);
            sb2.append('/');
            sb2.append(aVar.b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.a;
        c cVar = this.b;
        synchronized (((HashSet) cVar.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.u());
    }
}
