package pc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
