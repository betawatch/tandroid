package vd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h {
    public final e a;
    public final l b = new l(0.0f);
    public final l c = new l(0.0f);
    public final l d = new l(0.0f);
    public final l e = new l(0.0f);
    public final l f = new l(0.0f);
    public final l g = new l(0.0f);

    public h(i iVar, e eVar) {
        this.a = eVar;
    }

    public static void a(h hVar, int i10, boolean z10) {
        l lVar = hVar.c;
        l lVar2 = hVar.b;
        if (z10) {
            lVar2.c = i10;
            lVar.c = i10 > 0 ? 1.0f : 0.0f;
        } else {
            lVar2.d(i10);
            lVar.d(i10 > 0 ? 1.0f : 0.0f);
        }
    }
}
