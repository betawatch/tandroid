package y7;

import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
