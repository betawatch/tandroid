package ra;

import java.lang.reflect.Method;
import q5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p extends r {
    public final /* synthetic */ Method b;

    public p(Method method) {
        this.b = method;
    }

    @Override // ra.r
    public final Object a(Class cls) {
        String f10 = c0.f(cls);
        if (f10 == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
