package x7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class ha {
    public static t7.r a;

    public static synchronized fa a(ba baVar) {
        fa faVar;
        synchronized (ha.class) {
            try {
                if (a == null) {
                    a = new t7.r(3);
                }
                faVar = (fa) a.O0(baVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return faVar;
    }

    public static synchronized fa b() {
        fa a2;
        synchronized (ha.class) {
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
            a2 = a(new ba());
        }
        return a2;
    }
}
