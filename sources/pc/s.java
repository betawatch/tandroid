package pc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum s extends a2 {
    public s() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d == '!') {
            kVar.g("<!");
            kVar.c = a2.F;
        } else if (d == '/') {
            kVar.e();
            kVar.c = a2.D;
        } else {
            kVar.g("<");
            aVar.q();
            kVar.c = a2.f;
        }
    }
}
