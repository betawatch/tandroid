package w7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
