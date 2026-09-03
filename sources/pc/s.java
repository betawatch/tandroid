package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
