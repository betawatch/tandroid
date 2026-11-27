// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class r3 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    public Map a() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map d = d();
        this.d = d;
        return d;
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public boolean c(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        throw new AssertionError("should never be called");
    }

    public Collection e() {
        return new q3((Object) this, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r3) {
            return a().equals(((r3) obj).a());
        }
        return false;
    }

    public Set f() {
        throw new AssertionError("unreachable");
    }

    public Collection g() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection e = e();
        this.a = e;
        return e;
    }

    public abstract Iterator h();

    public final int hashCode() {
        return a().hashCode();
    }

    public abstract Collection i(Object obj);

    public Set j() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set f = f();
        this.b = f;
        return f;
    }

    public boolean k(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract int l();

    public final String toString() {
        return a().toString();
    }
}
