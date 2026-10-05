package w7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class na {
    public static t7.r a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (a == null) {
                    a = new t7.r(2);
                }
                laVar = (la) a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
