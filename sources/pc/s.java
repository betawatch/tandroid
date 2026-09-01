package pc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
