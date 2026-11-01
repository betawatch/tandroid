package xc;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum x extends a2 {
    public x() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        if (!aVar.m('-')) {
            kVar.c = a2.f;
        } else {
            kVar.f('-');
            kVar.a(a2.M);
        }
    }
}
