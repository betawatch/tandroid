package z7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class x8 implements ja.d {
    public static final x8 a = new x8();
    public static final ja.c b = new ja.c("isForegroundConfidenceMaskEnabled", i2.o1.p(si.o0.n(w.class, new s(1))));
    public static final ja.c c = new ja.c("isForegroundBitmapEnabled", i2.o1.p(si.o0.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i2.o1.p(si.o0.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i2.o1.p(si.o0.n(w.class, new s(4))));
    public static final ja.c f = new ja.c("isSubjectBitmapEnabled", i2.o1.p(si.o0.n(w.class, new s(5))));

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
