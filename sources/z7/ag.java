package z7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class ag {
    public static t7.r a;

    public static synchronized yf a(uf ufVar) {
        yf yfVar;
        synchronized (ag.class) {
            try {
                if (a == null) {
                    a = new t7.r(4);
                }
                yfVar = (yf) a.R0(ufVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yfVar;
    }

    public static synchronized yf b() {
        yf a2;
        synchronized (ag.class) {
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
            a2 = a(new uf());
        }
        return a2;
    }
}
