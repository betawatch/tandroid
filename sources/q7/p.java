package q7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class p extends m {
    public final /* synthetic */ q c;

    public p(q qVar) {
        this.c = qVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        q qVar = this.c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.c.f.get(i7), qVar.d.d.get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.d.d.size();
    }
}
