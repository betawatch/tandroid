package p8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class h extends c implements SortedSet {
    public final /* synthetic */ h0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h0 h0Var, SortedMap sortedMap) {
        super(h0Var, sortedMap);
        this.d = h0Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return i().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return i().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new h(this.d, i().headMap(obj));
    }

    public SortedMap i() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return i().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new h(this.d, i().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new h(this.d, i().tailMap(obj));
    }
}
