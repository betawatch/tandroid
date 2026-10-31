package w7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class la {
    public static t7.r a;

    public static synchronized ja a(ga gaVar) {
        ja jaVar;
        synchronized (la.class) {
            try {
                if (a == null) {
                    a = new t7.r(2);
                }
                jaVar = (ja) a.R0(gaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jaVar;
    }
}
