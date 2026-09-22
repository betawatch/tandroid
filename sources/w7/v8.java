package w7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class v8 {
    public static final Exception a(x0.a aVar, String str, Exception exc) {
        if (exc instanceof y0.a) {
            return new y0.a(aVar, str);
        }
        if (exc instanceof y0.b) {
            return new y0.b(aVar, str);
        }
        throw new z0.a();
    }
}
