// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class tue {
    public static final sc9 a(Throwable th) {
        th.getClass();
        return new sc9(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof sc9) {
            throw ((sc9) obj).a;
        }
    }
}
