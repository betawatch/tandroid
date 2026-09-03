package ra;

import java.lang.reflect.Method;
import q5.c0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o extends r {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public o(int i10, Method method) {
        this.b = method;
        this.c = i10;
    }

    @Override // ra.r
    public final Object a(Class cls) {
        String e = c0.e(cls);
        if (e == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e));
    }
}
