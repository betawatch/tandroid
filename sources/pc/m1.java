package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum m1 extends a2 {
    public m1() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        char d = aVar.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            kVar.c = a2.t0;
            return;
        }
        if (d == '\"') {
            kVar.m(this);
            kVar.c = a2.w0;
            return;
        }
        if (d == '\'') {
            kVar.m(this);
            kVar.c = a2.x0;
            return;
        }
        v vVar = a2.a;
        if (d == '>') {
            kVar.j();
            kVar.c = vVar;
        } else if (d != 65535) {
            kVar.m(this);
            fVar.getClass();
            kVar.c = a2.z0;
        } else {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
        }
    }
}
