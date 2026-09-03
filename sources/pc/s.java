package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
