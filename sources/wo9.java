// default package

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class wo9 implements Iterable {
    public to9 a;
    public to9 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (((so9) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wo9)) {
            return false;
        }
        wo9 wo9Var = (wo9) obj;
        if (this.d != wo9Var.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = wo9Var.iterator();
        while (true) {
            so9 so9Var = (so9) it;
            if (!so9Var.hasNext()) {
                break;
            }
            so9 so9Var2 = (so9) it2;
            if (!so9Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) so9Var.next();
            Object next = so9Var2.next();
            if (entry == null) {
                if (next != null) {
                    break;
                }
            } else if (!entry.equals(next)) {
                break;
            }
        }
        return false;
    }

    public to9 h(Object obj) {
        to9 to9Var = this.a;
        while (to9Var != null && !to9Var.a.equals(obj)) {
            to9Var = to9Var.c;
        }
        return to9Var;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            so9 so9Var = (so9) it;
            if (!so9Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) so9Var.next()).hashCode();
        }
    }

    public Object i(Object obj) {
        to9 h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((vo9) it.next()).a(h);
            }
        }
        to9 to9Var = h.d;
        to9 to9Var2 = h.c;
        if (to9Var != null) {
            to9Var.c = to9Var2;
        } else {
            this.a = to9Var2;
        }
        to9 to9Var3 = h.c;
        if (to9Var3 != null) {
            to9Var3.d = to9Var;
        } else {
            this.b = to9Var;
        }
        h.c = null;
        h.d = null;
        return h.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        so9 so9Var = new so9(this.a, this.b, (byte) 0);
        this.c.put(so9Var, Boolean.FALSE);
        return so9Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            so9 so9Var = (so9) it;
            if (!so9Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) so9Var.next()).toString());
            if (so9Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
