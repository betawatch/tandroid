package xc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum s extends a2 {
    public s() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d == '!') {
            kVar.h("<!");
            kVar.c = a2.I;
        } else if (d == '/') {
            kVar.e();
            kVar.c = a2.G;
        } else {
            kVar.h("<");
            aVar.q();
            kVar.c = a2.f;
        }
    }
}
