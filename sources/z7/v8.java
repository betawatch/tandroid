package z7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v8 implements ia.d {
    public static final v8 a = new v8();
    public static final ia.c b = new ia.c("width", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("height", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("startX", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("startY", i2.g.n(w.f.k(w.class, new s(4))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, teVar.a);
        eVar.a(c, teVar.b);
        eVar.a(d, teVar.c);
        eVar.a(e, teVar.d);
    }
}
