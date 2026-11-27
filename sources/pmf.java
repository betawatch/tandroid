// default package

import java.util.AbstractMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pmf extends zjf {
    public final /* synthetic */ v9d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmf(v9d v9dVar) {
        super((byte) 3);
        this.h = v9dVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        v9d v9dVar = this.h;
        j7f.a(i, v9dVar.r ? 1 : 0);
        int i2 = i << 1;
        Object[] objArr = v9dVar.n;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.r ? 1 : 0;
    }
}
