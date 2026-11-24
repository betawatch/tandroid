// default package

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class so5 extends go5 {
    public final no5 b;

    public so5(no5 no5Var) {
        this.b = no5Var;
    }

    @Override // go5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.b.a().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public final v7c iterator() {
        no5 no5Var = this.b;
        no5Var.getClass();
        return new ro5(no5Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.f;
    }
}
