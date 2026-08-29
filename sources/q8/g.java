package q8;

import j7.xa;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class g extends xa implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ h0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h0 h0Var, SortedMap sortedMap) {
        super(h0Var, sortedMap, 2);
        this.h = h0Var;
    }

    public SortedSet b() {
        return new h(this.h, d());
    }

    @Override // j7.xa, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b10 = b();
        this.f = b10;
        return b10;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new g(this.h, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new g(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new g(this.h, d().tailMap(obj));
    }
}
