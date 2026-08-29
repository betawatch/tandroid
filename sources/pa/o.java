package pa;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends r {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public o(int i10, Method method) {
        this.b = method;
        this.c = i10;
    }

    @Override // pa.r
    public final Object a(Class cls) {
        String T1 = oc.i.T1(cls);
        if (T1 == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(T1));
    }
}
