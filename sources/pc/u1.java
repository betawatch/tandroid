package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
