package y2;

import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d implements u9.d {
    public static final d a = new d();
    public static final u9.c b = new u9.c("logSource", v2.h(v2.g(x9.d.class, new x9.a(1))));
    public static final u9.c c = new u9.c("logEventDropped", v2.h(v2.g(x9.d.class, new x9.a(2))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        b3.e eVar = (b3.e) obj;
        u9.e eVar2 = (u9.e) obj2;
        eVar2.e(b, eVar.a);
        eVar2.e(c, eVar.b);
    }
}
