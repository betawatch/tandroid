package pc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum h1 extends a2 {
    public h1() {
        super("AfterDoctypeName", 53);
    }

    @Override // pc.a2
    public final void d(k kVar, a aVar) {
        f fVar = kVar.m;
        boolean j10 = aVar.j();
        v vVar = a2.a;
        if (j10) {
            kVar.l(this);
            fVar.getClass();
            kVar.j();
            kVar.c = vVar;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            kVar.j();
            kVar.a(vVar);
            return;
        }
        if (aVar.l("PUBLIC")) {
            fVar.getClass();
            kVar.c = a2.o0;
        } else if (aVar.l("SYSTEM")) {
            fVar.getClass();
            kVar.c = a2.u0;
        } else {
            kVar.m(this);
            fVar.getClass();
            kVar.a(a2.z0);
        }
    }
}
