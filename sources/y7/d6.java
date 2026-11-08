package y7;

import java.util.HashMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
