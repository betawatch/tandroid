package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum u1 extends a2 {
    public u1() {
        super("BogusDoctype", 65);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.a;
        if (d == '>') {
            kVar.j();
            kVar.c = vVar;
        } else {
            if (d != 65535) {
                return;
            }
            kVar.j();
            kVar.c = vVar;
        }
    }
}
