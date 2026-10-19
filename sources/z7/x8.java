package z7;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class x8 implements ja.d {
    public static final x8 a = new x8();
    public static final ja.c b = new ja.c("isForegroundConfidenceMaskEnabled", i2.e.o(r4.c.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("isForegroundBitmapEnabled", i2.e.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i2.e.o(r4.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i2.e.o(r4.c.n(w.class, new s(4))));
    public static final ja.c f = new ja.c("isSubjectBitmapEnabled", i2.e.o(r4.c.n(w.class, new s(5))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, weVar.a);
        eVar.d(c, weVar.b);
        eVar.d(d, weVar.c);
        eVar.d(e, weVar.d);
        eVar.d(f, weVar.e);
    }
}
