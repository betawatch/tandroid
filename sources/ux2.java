// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ux2 implements Iterable {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int h(fs3 fs3Var) {
        int intValue;
        synchronized (this.a) {
            intValue = this.b.containsKey(fs3Var) ? ((Integer) this.b.get(fs3Var)).intValue() : 0;
        }
        return intValue;
    }

    public final void i(fs3 fs3Var) {
        synchronized (this.a) {
            Integer num = (Integer) this.b.get(fs3Var);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(fs3Var);
            this.d = DesugarCollections.unmodifiableList(arrayList);
            int intValue = num.intValue();
            HashMap hashMap = this.b;
            if (intValue == 1) {
                hashMap.remove(fs3Var);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(fs3Var);
                this.c = DesugarCollections.unmodifiableSet(hashSet);
            } else {
                hashMap.put(fs3Var, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
