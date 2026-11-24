// default package

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class yhd extends ogd implements Set, j$.util.Set {
    public transient fhd b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // ogd
    public fhd k() {
        fhd fhdVar = this.b;
        if (fhdVar != null) {
            return fhdVar;
        }
        fhd n = n();
        this.b = n;
        return n;
    }

    public fhd n() {
        Object[] array = toArray(ogd.a);
        tgd tgdVar = fhd.b;
        return fhd.o(array.length, array);
    }
}
