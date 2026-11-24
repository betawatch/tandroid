// default package

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class p9a extends AbstractSet {
    public final /* synthetic */ byte a;

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                byte b = 1;
                if (collection instanceof wo5) {
                    e89 e89Var = (e89) ((wo5) collection);
                    vo5 vo5Var = e89Var.h;
                    if (vo5Var == null) {
                        vo5Var = new vo5(e89Var, b);
                        e89Var.h = vo5Var;
                    }
                    collection = vo5Var;
                }
                boolean z = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        z |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            z = true;
                        }
                    }
                }
                return z;
            case 1:
                return p2f.a(this, collection);
            default:
                return v2f.a(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                break;
            case 1:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
