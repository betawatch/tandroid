// default package

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class os9 implements Iterable {
    public ls9 a;
    public ls9 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (((ks9) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof os9)) {
            return false;
        }
        os9 os9Var = (os9) obj;
        if (this.d != os9Var.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = os9Var.iterator();
        while (true) {
            ks9 ks9Var = (ks9) it;
            if (!ks9Var.hasNext()) {
                break;
            }
            ks9 ks9Var2 = (ks9) it2;
            if (!ks9Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ks9Var.next();
            Object next = ks9Var2.next();
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

    public ls9 h(Object obj) {
        ls9 ls9Var = this.a;
        while (ls9Var != null && !ls9Var.a.equals(obj)) {
            ls9Var = ls9Var.c;
        }
        return ls9Var;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            ks9 ks9Var = (ks9) it;
            if (!ks9Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) ks9Var.next()).hashCode();
        }
    }

    public Object i(Object obj) {
        ls9 h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((ns9) it.next()).a(h);
            }
        }
        ls9 ls9Var = h.d;
        ls9 ls9Var2 = h.c;
        if (ls9Var != null) {
            ls9Var.c = ls9Var2;
        } else {
            this.a = ls9Var2;
        }
        ls9 ls9Var3 = h.c;
        if (ls9Var3 != null) {
            ls9Var3.d = ls9Var;
        } else {
            this.b = ls9Var;
        }
        h.c = null;
        h.d = null;
        return h.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ks9 ks9Var = new ks9(this.a, this.b, (byte) 0);
        this.c.put(ks9Var, Boolean.FALSE);
        return ks9Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ks9 ks9Var = (ks9) it;
            if (!ks9Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) ks9Var.next()).toString());
            if (ks9Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
