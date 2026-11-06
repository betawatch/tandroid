package y7;

import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d6 implements oa.a {
    public Object a;
    public Object b;
    public Object c;

    @Override // oa.a
    public /* bridge */ /* synthetic */ oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.a).put(cls, dVar);
        ((HashMap) this.b).remove(cls);
        return this;
    }
}
