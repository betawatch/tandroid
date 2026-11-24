// default package

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class xq9 implements Iterable {
    public uq9 a;
    public uq9 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (((tq9) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof xq9)) {
            return false;
        }
        xq9 xq9Var = (xq9) obj;
        if (this.d != xq9Var.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = xq9Var.iterator();
        while (true) {
            tq9 tq9Var = (tq9) it;
            if (!tq9Var.hasNext()) {
                break;
            }
            tq9 tq9Var2 = (tq9) it2;
            if (!tq9Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) tq9Var.next();
            Object next = tq9Var2.next();
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

    public uq9 h(Object obj) {
        uq9 uq9Var = this.a;
        while (uq9Var != null && !uq9Var.a.equals(obj)) {
            uq9Var = uq9Var.c;
        }
        return uq9Var;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            tq9 tq9Var = (tq9) it;
            if (!tq9Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) tq9Var.next()).hashCode();
        }
    }

    public Object i(Object obj) {
        uq9 h = h(obj);
        if (h == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((wq9) it.next()).a(h);
            }
        }
        uq9 uq9Var = h.d;
        uq9 uq9Var2 = h.c;
        if (uq9Var != null) {
            uq9Var.c = uq9Var2;
        } else {
            this.a = uq9Var2;
        }
        uq9 uq9Var3 = h.c;
        if (uq9Var3 != null) {
            uq9Var3.d = uq9Var;
        } else {
            this.b = uq9Var;
        }
        h.c = null;
        h.d = null;
        return h.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        tq9 tq9Var = new tq9(this.a, this.b, (byte) 0);
        this.c.put(tq9Var, Boolean.FALSE);
        return tq9Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            tq9 tq9Var = (tq9) it;
            if (!tq9Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) tq9Var.next()).toString());
            if (tq9Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
