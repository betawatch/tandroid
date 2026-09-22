package w;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class g extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, f fVar) {
        super(r2.toString());
        StringBuilder h = c.h(str, ", frames: ");
        h.append(fVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, f fVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder h = c.h(str, ", frames: ");
        h.append(fVar.a());
    }
}
