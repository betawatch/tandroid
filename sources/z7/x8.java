package z7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class x8 implements ia.d {
    public static final x8 a = new x8();
    public static final ia.c b = new ia.c("isForegroundConfidenceMaskEnabled", hg.c.o(w.c.l(w.class, new s(1))));
    public static final ia.c c = new ia.c("isForegroundBitmapEnabled", hg.c.o(w.c.l(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.c.o(w.c.l(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.c.o(w.c.l(w.class, new s(4))));
    public static final ia.c f = new ia.c("isSubjectBitmapEnabled", hg.c.o(w.c.l(w.class, new s(5))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, veVar.a);
        eVar.a(c, veVar.b);
        eVar.a(d, veVar.c);
        eVar.a(e, veVar.d);
        eVar.a(f, veVar.e);
    }
}
