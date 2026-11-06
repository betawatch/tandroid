package y7;

import java.util.HashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
