package z7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class x8 implements ia.d {
    public static final x8 a = new x8();
    public static final ia.c b = new ia.c("isForegroundConfidenceMaskEnabled", hg.k0.o(w.f.k(w.class, new s(1))));
    public static final ia.c c = new ia.c("isForegroundBitmapEnabled", hg.k0.o(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.k0.o(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.k0.o(w.f.k(w.class, new s(4))));
    public static final ia.c f = new ia.c("isSubjectBitmapEnabled", hg.k0.o(w.f.k(w.class, new s(5))));

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
