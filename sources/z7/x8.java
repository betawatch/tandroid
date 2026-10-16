package z7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class x8 implements ja.d {
    public static final x8 a = new x8();
    public static final ja.c b = new ja.c("isForegroundConfidenceMaskEnabled", i2.d.o(t8.b.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("isForegroundBitmapEnabled", i2.d.o(t8.b.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i2.d.o(t8.b.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i2.d.o(t8.b.n(w.class, new s(4))));
    public static final ja.c f = new ja.c("isSubjectBitmapEnabled", i2.d.o(t8.b.n(w.class, new s(5))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, veVar.a);
        eVar.d(c, veVar.b);
        eVar.d(d, veVar.c);
        eVar.d(e, veVar.d);
        eVar.d(f, veVar.e);
    }
}
