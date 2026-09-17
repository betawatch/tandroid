package za;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class e implements ia.d {
    public static final e a = new e();
    public static final ia.c b = ia.c.c("performance");
    public static final ia.c c = ia.c.c("crashlytics");
    public static final ia.c d = ia.c.c("sessionSamplingRate");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(b, jVar.a);
        eVar.a(c, jVar.b);
        eVar.g(d, jVar.c);
    }
}
