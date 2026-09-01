package ra;

import java.lang.reflect.Method;
import q5.g0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p extends r {
    public final /* synthetic */ Method b;

    public p(Method method) {
        this.b = method;
    }

    @Override // ra.r
    public final Object a(Class cls) {
        String f10 = g0.f(cls);
        if (f10 == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
