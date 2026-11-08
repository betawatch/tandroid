package te;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g {
    public final d a;
    public final k b = new k(0.0f);
    public final k c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k e = new k(0.0f);
    public final k f = new k(0.0f);
    public final k g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.a = dVar;
    }

    public static void a(g gVar, int i7, boolean z9) {
        k kVar = gVar.c;
        k kVar2 = gVar.b;
        if (z9) {
            kVar2.c = i7;
            kVar.c = i7 > 0 ? 1.0f : 0.0f;
        } else {
            kVar2.d(i7);
            kVar.d(i7 > 0 ? 1.0f : 0.0f);
        }
    }
}
