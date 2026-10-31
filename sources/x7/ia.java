package x7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class ia {
    public static t7.r a;

    public static synchronized ga a(ca caVar) {
        ga gaVar;
        synchronized (ia.class) {
            try {
                if (a == null) {
                    a = new t7.r(3);
                }
                gaVar = (ga) a.R0(caVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gaVar;
    }

    public static synchronized ga b() {
        ga a2;
        synchronized (ia.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            a2 = a(new ca());
        }
        return a2;
    }
}
