package s8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class h extends c implements SortedSet {
    public final /* synthetic */ e0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e0 e0Var, SortedMap sortedMap) {
        super(e0Var, sortedMap);
        this.d = e0Var;
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
