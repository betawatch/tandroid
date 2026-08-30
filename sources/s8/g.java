package s8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import l7.xa;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class g extends xa implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e0 e0Var, SortedMap sortedMap) {
        super(e0Var, sortedMap, 2);
        this.h = e0Var;
    }

    public SortedSet b() {
        return new h(this.h, d());
    }

    @Override // l7.xa, java.util.AbstractMap, java.util.Map
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
