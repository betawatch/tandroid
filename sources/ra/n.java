package ra;

import java.lang.reflect.Method;
import q5.g0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n extends r {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public n(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // ra.r
    public final Object a(Class cls) {
        String t6 = g0.t(cls);
        if (t6 == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t6));
    }
}
